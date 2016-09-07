/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogotá - Colombia)
 * Departamento de Ingeniería de Sistemas y Computación 
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: n3_notasCurso
 * Autor: Pablo Barvo - 09-Sep-2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.notasCurso.test;

import junit.framework.TestCase;
import uniandes.cupi2.notasCurso.mundo.Curso;

/**
 * Esta es la clase usada para verificar que los métodos de la clase Curso estén correctamente implementados
 */
public class CursoTest extends TestCase
{
    //-----------------------------------------------------------------
    // Atributos
    //-----------------------------------------------------------------

    /**
     * Es la clase donde se harán las pruebas
     */
    private Curso curso;

    //-----------------------------------------------------------------
    // Métodos
    //-----------------------------------------------------------------

    /**
     * Construye un nuevo Curso vacía
     */
    private void setupEscenario1( )
    {
        curso = new Curso( );
        curso.cambiarNota( 1, 5.0 );
        curso.cambiarNota( 2, 4.2 );
        curso.cambiarNota( 3, 2.5 );
        curso.cambiarNota( 4, 3.6 );
        curso.cambiarNota( 5, 5.0 );
        curso.cambiarNota( 6, 2.0 );
        curso.cambiarNota( 7, 4.8 );
        curso.cambiarNota( 8, 4.9 );
        curso.cambiarNota( 9, 0.0 );
        curso.cambiarNota( 10, 0.1 );
        curso.cambiarNota( 11, 3.2 );
        curso.cambiarNota( 12, 3.0 );
    }

    /**
     * Prueba del Promedio
     */
    public void testPromedio( )
    {
        setupEscenario1( );

        assertEquals( "El promedio no es correcto.", 3.191666666666667, curso.promedio( ), 0 );
    }

    /**
     * Prueba de los estudiantes con nota mayor al promedio
     *  
     */
    public void testMayores( )
    {
        setupEscenario1( );

        assertEquals( "El numero de estudiantes por encima del promedio deben ser 7", 7, curso.cuantosEncimaPromedio( ) );
    }
}