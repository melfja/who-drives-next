package de.whodrivesnext.api;

import de.whodrivesnext.model.Error;
import de.whodrivesnext.model.Profile;

import io.swagger.annotations.*;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;

import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-07-03T08:08:09.179+02:00")

@Controller
public class MeApiController implements MeApi {



    public ResponseEntity<Profile> meGet() {
        // do some magic!
        return new ResponseEntity<Profile>(HttpStatus.OK);
    }

}
