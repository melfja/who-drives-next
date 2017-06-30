package io.swagger.api;

import io.swagger.model.Error;
import io.swagger.model.Profile;
import io.swagger.model.Vacation;
import io.swagger.model.VacationCore;
import io.swagger.model.VacationList;

import io.swagger.annotations.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RequestPart;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import javax.validation.constraints.*;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-28T07:57:39.790+02:00")

@Api(value = "users", description = "the users API")
public interface UsersApi {

    @ApiOperation(value = "User Profile", notes = "The User Profile endpoint returns information about a who-drives-next user.  The details of the response are depending on the authorisation of the user * any registeres user can see the username, which can be used to identify an user before adding to a carpool. * only users of a carpool can see more details of users who are assigned to the carpool ", response = Profile.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "Profile information for a user", response = Profile.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Profile.class) })
    @RequestMapping(value = "/users",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Profile> usersGet();


    @ApiOperation(value = "Off-Times of a user.", notes = "For a user a list of Off-time periods can be defined. During off times users can not be added to rides.  This eases the creation of new rides. ", response = VacationList.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "List of Off-Time periods.", response = VacationList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = VacationList.class) })
    @RequestMapping(value = "/users/{userId}/vacations",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<VacationList> usersUserIdVacationsGet(@ApiParam(value = "unique ID of the user for whicht you search Off-Times",required=true ) @PathVariable("userId") String userId);


    @ApiOperation(value = "add a Off-Time to an user", notes = "An user can define an Off-Time.  This can be used for a GUI to show whether a user is available to join a ride.  During an Off-Time a user can not be added to a ride neither as a driver nor as a passager. ", response = Vacation.class, tags={ "User", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "vacation - the newly created Off-Time", response = Vacation.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Vacation.class) })
    @RequestMapping(value = "/users/{userId}/vacations",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Vacation> usersUserIdVacationsPost(@ApiParam(value = "unique ID of the user you want to add an Off-Time to",required=true ) @PathVariable("userId") String userId,
        @ApiParam(value = "" ,required=true ) @RequestBody VacationCore vacation);

}
