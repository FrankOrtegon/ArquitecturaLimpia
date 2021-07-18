package controller;

import format.SerieFormat;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import service.SerieService;

@RestController
@RequestMapping("/serie")
public class SerieController {
    @Autowired
    SerieService serieService;

    @PostMapping("/ crear")
    public ResponseEntity<SerieFormat> create(@RequestBody SerieFormat serieFormat){
        return new ResponseEntity<>(serieService.createSerie(serieFormat), HttpStatus.CREATED);
    }

}
