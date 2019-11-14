package kirichripper.entertainment.server.controllers;


import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;

@Controller
public class HelloController {

    @ResponseBody
    @RequestMapping(value = "/hello", method = RequestMethod.GET)
    public  String sayHello(ModelMap model){
        return "<h1>Hey there! I'm Tails server</h1>";
    }

    /*
    @GetMapping(
            value = "/getMeme/ok",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody byte[] getOkMeme(ModelMap model) throws IOException {
        InputStream in = getClass().getResourceAsStream("/home/kirichripper/Documents/ok.jpg");
        return toByteArray(in);
    }


    @GetMapping(
            value = "/getMeme/helow",
            produces = MediaType.IMAGE_JPEG_VALUE
    )
    public @ResponseBody byte[] getHelowMeme(ModelMap model) throws IOException{
        InputStream  in = getClass().getResourceAsStream("/home/kirichripper/Documents/helow.jpg");

        return toByteArray(in);
    }

    public static byte[] toByteArray(InputStream in) throws IOException {

        ByteArrayOutputStream os = new ByteArrayOutputStream();

        byte[] buffer = new byte[1024];
        int len;

        // read bytes from the input stream and store them in buffer
        while ((len = in.read(buffer)) != -1) {
            // write bytes from the buffer into output stream
            os.write(buffer, 0, len);
        }

        return os.toByteArray();
    }
*/
}
