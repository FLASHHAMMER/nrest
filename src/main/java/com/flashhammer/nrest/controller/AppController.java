package com.flashhammer.nrest.controller;

import com.flashhammer.nrest.model.App;
import com.flashhammer.nrest.model.AppResponse;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping(path="/appcontroller")
public class AppController {

    private void handleException(Throwable th) {
        if (th instanceof Exception)
            th.printStackTrace();
        else if (th != null)
            th.printStackTrace();
    }

    /**
     *
     */
    @RequestMapping(value = "/app", method = RequestMethod.POST)
    public AppResponse app(@RequestBody App req) {

        AppResponse response = null;



        return response;
    }

}
