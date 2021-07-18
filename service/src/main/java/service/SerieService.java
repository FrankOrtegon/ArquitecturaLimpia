package service;

import format.SerieFormat;
import mapper.SerieMapper;
import model.Serie;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import repository.SerieRepository;

@Service
public class SerieService {

    @Autowired
    private SerieRepository serieRepository;

    SerieMapper serieMapper = new SerieMapper();

    public SerieFormat createSerie(SerieFormat serieFormat){
        Serie serie = serieMapper.fromDTO(serieFormat);
        return serieMapper.fromModel(serieRepository.save(serie));
    }

}
