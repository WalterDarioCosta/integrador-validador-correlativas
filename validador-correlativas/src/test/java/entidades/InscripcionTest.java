package entidades;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
class InscripcionTest {

    Inscripcion objInscripcionTest;
    Materia materia1;
    Materia materia2;
    Materia materia3;


    @BeforeAll
    public void beforeAll() {

        // Instanciar materias
        materia1 = new Materia("MatematicaI");
        materia2 = new Materia("MatematicaII");
        materia3 = new Materia("MatematicaIII");

        // Instanciar correlativas
        materia2.agregarCorrelativa(materia1);
        materia3.agregarCorrelativa(materia1);
        materia3.agregarCorrelativa(materia2);
    }

    @BeforeEach
    public void setUp() {
        objInscripcionTest = new Inscripcion();
    }

    @Test
    void aprobadaTrue() {

        Alumno alumno3 = new Alumno("Matias", "20930");
        alumno3.agregarMateriaAprobada(materia1);
        alumno3.agregarMateriaAprobada(materia2);

        Inscripcion inscripcion1 = new Inscripcion(alumno3, materia3 );
        boolean estaAprobado = inscripcion1.aprobada();
        boolean valorEsperado = true;
        boolean resultado = ( estaAprobado == valorEsperado);

        assertTrue(resultado);
    }
}