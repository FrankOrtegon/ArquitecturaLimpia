package mapper;

import format.SerieFormat;
import model.Serie;

public class SerieMapper {

    public Serie fromDTO(SerieFormat serieFormat){
        Serie serie = new Serie();
        serie.setId(serieFormat.getId());
        serie.setNombre(serieFormat.getNombre());
        serie.setGenero(serieFormat.getGenero());
        return serie;
    }

    public SerieFormat fromModel(Serie serie){
        SerieFormat serieFormat = new SerieFormat();
        serieFormat.setId(serie.getId());
        serieFormat.setNombre(serie.getNombre());
        serieFormat.setGenero(serie.getGenero());
        return serieFormat;
    }


}
