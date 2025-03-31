package mx.unam.dgtic.M9_Practica.controller;


import jakarta.validation.Valid;
import mx.unam.dgtic.M9_Practica.modelo.Vuelo;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;

@RestController
@RequestMapping("/api/vuelos")
public class VueloController {

    private HashMap<Integer, Vuelo> vuelos;

    public VueloController() {
        vuelos = new HashMap<>();
        vuelos.put(1, new Vuelo(1, "CDMX", "España", "12:30 hrs"));
        vuelos.put(2, new Vuelo(2, "Noruega", "Japón", "07:00 hrs"));
        vuelos.put(3, new Vuelo(3, "Brasil", "Italia", "15:30 hrs"));
    }

    @GetMapping("/creditos")
    public String getCretitos(){

        String html = "<html><body><h2>Participantes del equipo:</h2>" +
                "<ul><li>Manuel Mérida Aguilar </li>" +
                "<li>Ernesto Velasco Arciniega</li>" +
                "<li>Rodrigo Ivan  Olvera Martinez</li>" +
                "<li>Omar Nieto Crisóstomo</li>" +
                "</ul></body></html>";
        return html;
    }

    @GetMapping(value = "/", headers = {"Accept=application/json"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<HashMap<Integer, Vuelo>> getAll() {
        return new ResponseEntity<>(vuelos, HttpStatus.OK);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vuelo> getById(@PathVariable Integer id) {
        if (vuelos.containsKey(id))
            return new ResponseEntity<>(vuelos.get(id), HttpStatus.OK);
        else return  ResponseEntity.notFound().build();
    }

    @PostMapping(value = "/",
            headers = {"Accept=application/json"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vuelo> agregarVuelo(@Valid @RequestBody Vuelo vuelo) {
        //Buscar el siguiente id
        Integer id = 1;
        while(vuelos.containsKey(id)) id++;
        vuelo.setId(id);
        vuelos.put(id, vuelo);

        return new ResponseEntity<>(vuelo,  HttpStatus.CREATED);
    }

    @PutMapping(value = "/{id}",
            headers = {"Accept=application/json"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vuelo> actualizarVuelo(@PathVariable Integer id, @Valid @RequestBody Vuelo vuelo) {
        Vuelo vueloActual = vuelos.get(id);

        // 404 id no encontrada
        if (vueloActual == null) return ResponseEntity.notFound().build();
        // 204 Body sin contenido
        if (vuelo == null) return ResponseEntity.noContent().build();

        vueloActual.setDestino(vuelo.getDestino());
        vueloActual.setOrigen(vuelo.getOrigen());
        vueloActual.setHoraSalida(vuelo.getHoraSalida());
        vuelos.replace(id, vueloActual);
        return ResponseEntity.ok(vueloActual);
    }

    @PatchMapping(value = "/{id}",
            headers = {"Accept=application/json"},
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vuelo> actualizarParcialVuelo(
            @PathVariable Integer id,
            @RequestBody Vuelo vuelo) {
        Vuelo vueloActual = vuelos.get(id);

        // 404 id no encontrada
        if (vueloActual == null) return ResponseEntity.notFound().build();
        // 204 Body sin contenido
        if (vuelo == null) return ResponseEntity.noContent().build();

        if (vuelo.getDestino() != null)
            vueloActual.setDestino(vuelo.getDestino());
        if (vuelo.getOrigen() != null)
            vueloActual.setOrigen(vuelo.getOrigen());
        if (vuelo.getHoraSalida() != null)
            vueloActual.setHoraSalida(vuelo.getHoraSalida());
        vuelos.replace(id, vueloActual);
        return ResponseEntity.ok(vueloActual);
    }


    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<Vuelo> deleteVuelo(@PathVariable Integer id) {
        Vuelo vuelo = vuelos.get(id);
        if (vuelos.containsKey(id)){
            vuelos.remove(id);
            return new ResponseEntity<>(vuelo, HttpStatus.OK);
        } else return  ResponseEntity.notFound().build();
    }
}
