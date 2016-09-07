/**
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 * $Id$
 * Universidad de los Andes (Bogot� - Colombia)
 * Departamento de Ingenier�a de Sistemas y Computaci�n 
 * Licenciado bajo el esquema Academic Free License version 2.1
 *
 * Proyecto Cupi2
 * Ejercicio: n3_notasCurso
 * Autor: Pablo Barvo - 09-Sep-2005
 * ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~
 */

package uniandes.cupi2.notasCurso.mundo;

/**
 * Clase que representa un Curso
 */
public class Curso
{
    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Total de estudiantes en el curso
     */
    public final static int TOTAL_EST = 12;

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Notas de los estudiantes
     */
    private double[] notas;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Crea un nuevo curso, inicializando todas las notas en cero
     */
    public Curso( )
    {
        notas = new double[TOTAL_EST];
        for( int i = 0; i < notas.length; i++ )
            notas[ i ] = 0.0;
    }

    // -----------------------------------------------------------------
    // M�todos
    // -----------------------------------------------------------------

    /**
     * Calcula el promedio del curso
     * @return Promedio de todas las notas del curso. promedio >= 0
     */
    public double promedio( )
    {
        double suma = 0;
        for( int indice = 0; indice < TOTAL_EST; indice++ )
        {
            suma += notas[ indice ];
        }
        return suma / TOTAL_EST;
    }

    /**
     * Devuelve el numero de estudiantes que tienen la nota mayor al promedio
     * @return N�mero de estudiantes que tienen la nota mayor al promedio. n�mero >= 0
     */
    public int cuantosEncimaPromedio( )
    {
        // Saca el promedio utilizando el m�todo promedio()
        double promedio = promedio( );

        // Calcula el numero notas mayores
        int vanEncima = 0;
        for( int indice = 0; indice < TOTAL_EST; indice++ )
        {
            if( notas[ indice ] > promedio )
            {
                vanEncima++;
            }
        }
        return vanEncima;
    }

    /**
     * Devuelve la nota de un estudiante del curso
     * @param numEstudiante N�mero del estudiante : 1 <= estudiante <= 12
     * @return Nota del estudiante numEstudiante
     */
    public double darNota( int numEstudiante )
    {
        return notas[ numEstudiante - 1 ];
    }

    /**
     * Cambia la nota de un estudiante en el curso
     * @param numEstudiante N�mero del estudiante : 1 <= estudiante <= 12
     * @param nota Nota del estudiante 0 <= nota <= 5
     */
    public void cambiarNota( int numEstudiante, double nota )
    {
        notas[ numEstudiante - 1 ] = nota;
    }

    // -----------------------------------------------------------------
    // Puntos de Extensi�n
    // -----------------------------------------------------------------

    /**
     * M�todo para la extensi�n 1
     * @return Respuesta 1
     */
    public String metodo1( )
    {
        return "Respuesta 1";
    }

    /**
     * M�todo para la extensi�n2
     * @return Respuesta 2
     */
    public String metodo2( )
    {
        return "Respuesta 2";
    }
}