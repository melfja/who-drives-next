package de.whodrivesnext.api;

import de.whodrivesnext.model.Carpool;
import de.whodrivesnext.model.Error;

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

@Api(value = "carpools", description = "the carpools API")
public interface CarpoolsApi {

    @ApiOperation(value = "carpool - a group of people who want to drive together", notes = "tbd. ", response = Carpool.class, tags={ "carpool", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the created carpool", response = Carpool.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Carpool.class) })
    @RequestMapping(value = "/carpools",
        produces = { "application/json" }, 
        method = RequestMethod.GET)
    ResponseEntity<Carpool> carpoolsGet( @NotNull @ApiParam(value = "Name of the Car pool", required = true) @RequestParam(value = "name", required = true) String name);


    @ApiOperation(value = "create a carpool - a group of people who want to drive together", notes = "You can create a new carpool and add drivers or passengers. Rides can be associated to a carpool and statistics are offered. ", response = Carpool.class, tags={ "carpool", })
    @ApiResponses(value = { 
        @ApiResponse(code = 200, message = "the created carpool", response = Carpool.class),
        @ApiResponse(code = 200, message = "Unexpected error", response = Carpool.class) })
    @RequestMapping(value = "/carpools",
        produces = { "application/json" }, 
        method = RequestMethod.POST)
    ResponseEntity<Carpool> carpoolsPost(@ApiParam(value = "carpool object" ,required=true ) @RequestBody Carpool carpool);

}
