package top.controller;

import lombok.SneakyThrows;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.multipart.MultipartFile;

import javax.servlet.ServletContext;
import javax.servlet.http.HttpSession;
import java.awt.font.MultipleMaster;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;

/**
 * @author kinoz
 * @Date 2022/10/5 14:17
 * @apiNote 文件上传下载操作
 */
@Controller
public class FileUpDownController {
    //下载功能
    @RequestMapping("/testDown")
    public ResponseEntity<byte[]> testResponseEntity(HttpSession session) throws IOException {
        //获取ServletContext对象
        ServletContext servletContext = session.getServletContext();
        //获取服务器中文件的真实路径
        String realPath = servletContext.getRealPath("/static/img/1.jpg");
        System.out.println(realPath);
        //创建输入流
        InputStream is = new FileInputStream(realPath);
        //创建字节数组
        byte[] bytes = new byte[is.available()];
        //将流读到字节数组中
        is.read(bytes);
        //创建HttpHeaders对象设置响应头信息
        MultiValueMap<String, String> headers = new HttpHeaders();
        //设置要下载方式以及下载文件的名字
        headers.add("Content-Disposition", "attachment;filename=1.jpg");
        //设置响应状态码
        HttpStatus statusCode = HttpStatus.OK;
        //创建ResponseEntity对象
        ResponseEntity<byte[]> responseEntity = new ResponseEntity<>(bytes, headers, statusCode);
        //关闭输入流
        is.close();
        return responseEntity;
    }

    //上传功能
    @SneakyThrows       //功能同java模板中的try catch或throw exception相同
    @RequestMapping("/testUP")
    public String testUP(MultipartFile photo,HttpSession session){
        System.out.println("表单name属性值:"+photo.getName());
        //获取上传文件名称
        String up_file_name = photo.getOriginalFilename();
        //获取上传文件的后缀名(判断上传文件名称是否为空)
        assert up_file_name != null;
        String suffixName = up_file_name.substring(up_file_name.lastIndexOf("."));
        //将uuid作为文件名
        String uuid = UUID.randomUUID().toString();
        //将uuid和后缀拼接作为最终文件名
        up_file_name = uuid+suffixName;
        //通过ServletContext获取服务器中的photo路径
        ServletContext servletContext = session.getServletContext();
        String photoPath = servletContext.getRealPath("photo");
        //此文件代表photoPath的目录
        File file = new File(photoPath);
        //判断此目录是否存在,若不存在进行判断
        if (!file.exists()){
            file.mkdir();
        }
        //最终确定的上传路径通过transferTo方法进行上传
        String finalPath = photoPath + File.separator + up_file_name;
        System.out.println(finalPath);
        photo.transferTo(new File(finalPath));

        return "success";
    }
}
