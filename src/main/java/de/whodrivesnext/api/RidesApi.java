package de.whodrivesnext.api;

import java.math.BigDecimal;
import de.whodrivesnext.model.Error;
import de.whodrivesnext.model.Member;
import de.whodrivesnext.model.Ride;
import de.whodrivesnext.model.RidePageableList;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-30T07:51:49.755+02:00")

@Api(value = "rides", description = "the rides API")
public interface RidesApi {

    @ApiOperation(value = "search for rides", notes = "show the history or search for rides. either an userid or a carpoolId is required. rides can only be found by the driver, the passengers or any member of the associated carpool. ", response = RidePageableList.class, tags={ "carpool", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the rides", response = RidePageableList.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = RidePageableList.class) })
    @RequestMapping(value = "/rides",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<RidePageableList> ridesGet( @ApiParam(value = "unique ID of the carpool you want to search rides from") @RequestParam(value = "carpoolId", required = false) String carpoolId,
         @ApiParam(value = "search rides where the user was either driver or passenger. ") @RequestParam(value = "userId", required = false) String userId,
         @ApiParam(value = "search rides since or at that from-date.  date in ??? format ") @RequestParam(value = "from", required = false) String from,
         @ApiParam(value = "search rides before or at that to-date.  date in ??? format ") @RequestParam(value = "to", required = false) String to,
         @ApiParam(value = "search rides in the last number of days from now.  may give unexpected results if you combine this with from/to query parameters. ") @RequestParam(value = "lastDays", required = false) BigDecimal lastDays,
         @ApiParam(value = "Offset the list of returned results by this amount. Default is zero.") @RequestParam(value = "offset", required = false) Integer offset,
         @ApiParam(value = "Number of items to retrieve. Default is 5, maximum is 100.") @RequestParam(value = "limit", required = false) Integer limit);


    @ApiOperation(value = "create a ride - a group of people driving together", notes = "rides can only be added to existing carpools and can be added by any member of the carpool. ", response = Ride.class, tags={ "carpool", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the created ride", response = Ride.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Ride.class) })
    @RequestMapping(value = "/rides",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Ride> ridesPost(@ApiParam(value = "" ,required=true ) @RequestBody Ride ride);


    @ApiOperation(value = "deletes a ride", notes = "tbd ", response = Void.class, tags={ "carpool", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the ride has been deleted. Empty response.", response = Void.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Void.class) })
    @RequestMapping(value = "/rides/{rideId}",
        produces = { "application/json" }, 
        method = RequestMethod.DELETE)
    ResponseEntity<Void> ridesRideIdDelete(@ApiParam(value = "unique ID of the ride you want to delete",required=true ) @PathVariable("rideId") String rideId);


    @ApiOperation(value = "set a driver to a ride", notes = "one driver can be set to a existing ride. If allready a driver has been set it will be replaced. A ride allways has to have an driver, though no delete is allowed, only replace via put.  the driver must be one of the members of the carpool. ", response = Ride.class, tags={ "carpool", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the updated ride", response = Ride.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Ride.class) })
    @RequestMapping(value = "/rides/{rideId}/driver",
        produces = { "application/json" }, 
        method = RequestMethod.PUT)
    ResponseEntity<Ride> ridesRideIdDriverPut(@ApiParam(value = "unique ID of the ride you want to set the driver to",required=true ) @PathVariable("rideId") String rideId,
        @ApiParam(value = "" ,required=true ) @RequestBody Member driver);


    @ApiOperation(value = "add a passenger a ride", notes = "add a list of passengers to the ride. To add more passengers or to delete a passenger the complete list has to be added again. To delete all passengers a empty list can be posted.  all passengers must be members of the carpool. the driver of a ride can not be a passenger. a user can not be added when having an Off-Time (see #/users/{id}/vavations). ", response = Ride.class, tags={ "carpool", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the updated ride", response = Ride.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Ride.class) })
    @RequestMapping(value = "/rides/{rideId}/passengers",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Ride> ridesRideIdPassengersPost(@ApiParam(value = "unique ID of the ride you want to set the passenger to",required=true ) @PathVariable("rideId") String rideId,
        @ApiParam(value = "" ,required=true ) @RequestBody Member passenger);

}
