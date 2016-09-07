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

package uniandes.cupi2.notasCurso.interfaz;

import java.awt.*;
import java.awt.event.*;

import javax.swing.*;
import javax.swing.border.*;

/**
 * Panel donde se muestra los datos adicionales y las opciones
 */
public class PanelAdicionales extends JPanel implements ActionListener
{

    // -----------------------------------------------------------------
    // Constantes
    // -----------------------------------------------------------------

    /**
     * Comando promedio
     */
    private static final String PROMEDIO = "PROMEDIO";

    /**
     * Comando mayores
     */
    private static final String MAYORES = "MAYORES";

    /**
     * Comando opción 1
     */
    private static final String OPCION_1 = "OPCION_1";

    /**
     * Comando opción 2
     */
    private static final String OPCION_2 = "OPCION_2";

    // -----------------------------------------------------------------
    // Atributos
    // -----------------------------------------------------------------

    /**
     * Ventana principal
     */
    private InterfazNotasCurso ventana;

    // -----------------------------------------------------------------
    // Atributos de la interfaz
    // -----------------------------------------------------------------

    /**
     * Botón promedio
     */
    private JButton btnPromedio;

    /**
     * Botón número de estudiantes con nota mayor al promedio
     */
    private JButton btnMayores;

    /**
     * Botón Extensión 1
     */
    private JButton btnExtension1;

    /**
     * Botón Extensión 2
     */
    private JButton btnExtension2;

    // -----------------------------------------------------------------
    // Constructores
    // -----------------------------------------------------------------

    /**
     * Constructor del panel
     * @param laVentana Ventana principal
     */
    public PanelAdicionales( InterfazNotasCurso laVentana )
    {
        ventana = laVentana;
        setBorder( new TitledBorder( "Adicionales" ) );
        setLayout( new GridLayout( 1, 4 ) );

        // Botón Promedio
        btnPromedio = new JButton( "Promedio" );
        btnPromedio.addActionListener( this );
        btnPromedio.setActionCommand( PanelAdicionales.PROMEDIO );
        add( btnPromedio );

        // Botón Mayores
        btnMayores = new JButton( "# Mayor al promedio" );
        btnMayores.addActionListener( this );
        btnMayores.setActionCommand( PanelAdicionales.MAYORES );
        add( btnMayores );

        // Botón Extensión 1
        btnExtension1 = new JButton( "Opción 1" );
        btnExtension1.addActionListener( this );
        btnExtension1.setActionCommand( PanelAdicionales.OPCION_1 );
        add( btnExtension1 );

        // Botón Extensión 2
        btnExtension2 = new JButton( "Opción 2" );
        btnExtension2.addActionListener( this );
        btnExtension2.setActionCommand( PanelAdicionales.OPCION_2 );
        add( btnExtension2 );
    }

    // -----------------------------------------------------------------
    // Métodos
    // -----------------------------------------------------------------

    /**
     * Manejo de eventos de los botones
     * @param e Evento que generó la acción. e != null.
     */
    public void actionPerformed( ActionEvent e )
    {
        String comando = e.getActionCommand( );
        if( OPCION_1.equals( comando ) )
        {
            ventana.reqFuncOpcion1( );
        }
        else if( OPCION_2.equals( comando ) )
        {
            ventana.reqFuncOpcion2( );
        }
        else if( PROMEDIO.equals( comando ) )
        {
            ventana.mostrarPromedio( );
        }
        else if( MAYORES.equals( comando ) )
        {
            ventana.mostrarMayores( );
        }
    }
}
