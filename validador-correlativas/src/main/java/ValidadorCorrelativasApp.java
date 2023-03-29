import entidades.Alumno;
import entidades.Inscripcion;
import entidades.Materia;
import servicios.CorrelativasServicio;
import servicios.FileService;

import java.io.IOException;
import java.util.ArrayList;

public class ValidadorCorrelativasApp {

    private static final FileService fileServicio = new FileService();
    private static final CorrelativasServicio correlativeSrv = new CorrelativasServicio(fileServicio);
    public static void main(String[] args) {

        // Nueva inscripción
        // leer archivo de inscripciones
        try {
            correlativeSrv.registrarMaterias();
            correlativeSrv.registrarAlumnos();

            correlativeSrv.registrarInscripcion();
        } catch (IOException e) {
            System.out.println(e);
        }

    }
}
