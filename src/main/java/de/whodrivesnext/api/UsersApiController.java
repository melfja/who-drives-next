package de.whodrivesnext.api;

import de.whodrivesnext.model.Error;
import de.whodrivesnext.model.Profile;
import de.whodrivesnext.model.Vacation;
import de.whodrivesnext.model.VacationCore;
import de.whodrivesnext.model.VacationList;

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
public class UsersApiController implements UsersApi {



    public ResponseEntity<Profile> usersGet() {
        // do some magic!
        return new ResponseEntity<Profile>(HttpStatus.OK);
    }

    public ResponseEntity<VacationList> usersUserIdVacationsGet(@ApiParam(value = "unique ID of the user for whicht you search Off-Times",required=true ) @PathVariable("userId") String userId) {
        // do some magic!
        return new ResponseEntity<VacationList>(HttpStatus.OK);
    }

    public ResponseEntity<Vacation> usersUserIdVacationsPost(@ApiParam(value = "unique ID of the user you want to add an Off-Time to",required=true ) @PathVariable("userId") String userId,
        @ApiParam(value = "" ,required=true ) @RequestBody VacationCore vacation) {
        // do some magic!
        return new ResponseEntity<Vacation>(HttpStatus.OK);
    }

}
