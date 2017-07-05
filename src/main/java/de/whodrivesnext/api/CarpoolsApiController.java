package de.whodrivesnext.api;

import de.whodrivesnext.model.Carpool;
import de.whodrivesnext.model.Error;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-30T07:51:49.755+02:00")

@Controller
public class CarpoolsApiController implements CarpoolsApi {



    public ResponseEntity<Carpool> carpoolsGet( @NotNull @ApiParam(value = "Name of the Car pool", required = true) @RequestParam(value = "name", required = true) String name) {
        // do some magic!
        return new ResponseEntity<Carpool>(HttpStatus.OK);
    }

    public ResponseEntity<Carpool> carpoolsPost(@ApiParam(value = "carpool object" ,required=true ) @RequestBody Carpool carpool) {
        // do some magic!
        return new ResponseEntity<Carpool>(HttpStatus.OK);
    }

}
