package io.swagger.api;

import java.math.BigDecimal;
import io.swagger.model.Error;
import io.swagger.model.Member;
import io.swagger.model.Ride;
import io.swagger.model.RidePageableList;

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
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2017-06-28T07:57:39.790+02:00")

@Controller
public class RidesApiController implements RidesApi {



    public ResponseEntity<RidePageableList> ridesGet( @ApiParam(value = "unique ID of the carpool you want to search rides from") @RequestParam(value = "carpoolId", required = false) String carpoolId,
         @ApiParam(value = "search rides where the user was either driver or passenger. ") @RequestParam(value = "userId", required = false) String userId,
         @ApiParam(value = "search rides since or at that from-date.  date in ??? format ") @RequestParam(value = "from", required = false) String from,
         @ApiParam(value = "search rides before or at that to-date.  date in ??? format ") @RequestParam(value = "to", required = false) String to,
         @ApiParam(value = "search rides in the last number of days from now.  may give unexpected results if you combine this with from/to query parameters. ") @RequestParam(value = "lastDays", required = false) BigDecimal lastDays,
         @ApiParam(value = "Offset the list of returned results by this amount. Default is zero.") @RequestParam(value = "offset", required = false) Integer offset,
         @ApiParam(value = "Number of items to retrieve. Default is 5, maximum is 100.") @RequestParam(value = "limit", required = false) Integer limit) {
        // do some magic!
        return new ResponseEntity<RidePageableList>(HttpStatus.OK);
    }

    public ResponseEntity<Ride> ridesPost(@ApiParam(value = "" ,required=true ) @RequestBody Ride ride) {
        // do some magic!
        return new ResponseEntity<Ride>(HttpStatus.OK);
    }

    public ResponseEntity<Void> ridesRideIdDelete(@ApiParam(value = "unique ID of the ride you want to delete",required=true ) @PathVariable("rideId") String rideId) {
        // do some magic!
        return new ResponseEntity<Void>(HttpStatus.OK);
    }

    public ResponseEntity<Ride> ridesRideIdDriverPut(@ApiParam(value = "unique ID of the ride you want to set the driver to",required=true ) @PathVariable("rideId") String rideId,
        @ApiParam(value = "" ,required=true ) @RequestBody Member driver) {
        // do some magic!
        return new ResponseEntity<Ride>(HttpStatus.OK);
    }

    public ResponseEntity<Ride> ridesRideIdPassengersPost(@ApiParam(value = "unique ID of the ride you want to set the passenger to",required=true ) @PathVariable("rideId") String rideId,
        @ApiParam(value = "" ,required=true ) @RequestBody Member passenger) {
        // do some magic!
        return new ResponseEntity<Ride>(HttpStatus.OK);
    }

}
