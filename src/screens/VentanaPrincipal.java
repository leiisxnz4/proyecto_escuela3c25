package screens;

import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class VentanaPrincipal extends JFrame{
    public JDesktopPane desktop;  // Escritorio dentro del Frame
    private JMenuBar jMenuBar;
    private JMenu jMenuAlumnos;
    private JMenu jMenuCarreras;
    private JMenu jMenuBachilleratos;
    private JMenuItem jMenuItemInsertar;
    private JMenuItem jMenuItemVerAlumnos;
    private JMenuItem jMenuItemInsertarCarreras;
    private JMenuItem jMenuItemVerCarreras;
    private JMenuItem jMenuItemInsertarBachillerato;
    private JMenuItem jMenuItemVerBachillerato;

    public VentanaPrincipal(String title){
        this.setTitle(title);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        initComponents();
    }

    private void initComponents(){
        // DesktopPane - escritorio
        desktop = new JDesktopPane();
        this.add(desktop);
        this.setContentPane(desktop); 
        // Barra de Menu
        jMenuBar = new JMenuBar();
        // this.add(jMenuBar);
        // Menu Alumnos
        jMenuAlumnos = new JMenu();
        jMenuAlumnos.setText("Alumnos");
        // Elemento de menu: Insertar
        jMenuItemInsertar = new JMenuItem();
        jMenuItemInsertar.setText("Insertar...");
        // Elemento de menu: Ver alumnos
        jMenuItemVerAlumnos = new JMenuItem();
        jMenuItemVerAlumnos.setText("Ver todos los alumnos...");

        // Menú Carreras
        jMenuCarreras = new JMenu();
        jMenuCarreras.setText("Carreras");
        // Elemento de menu: Ver Carreras
        jMenuItemVerCarreras = new JMenuItem();
        jMenuItemVerCarreras.setText("Ver todas las carreras...");
        // Elemento de menu: Insertar carrera
        jMenuItemInsertarCarreras = new JMenuItem();
        jMenuItemInsertarCarreras.setText("Insertar...");

        // Menú bachilleratos
        jMenuBachilleratos = new JMenu();
        jMenuBachilleratos.setText("Bachilleratos");
        // Elemento de menú : ver bachilleratos
        jMenuItemVerBachillerato = new JMenuItem();
        jMenuItemVerBachillerato.setText("Ver todos los bachilleratos...");
        // Elemento de menú : Insertar bachilleratos
        jMenuItemInsertarBachillerato = new JMenuItem();
        jMenuItemInsertarBachillerato.setText("Insertar...");

        // Agregar el listener de eventos para ejecutar la acción de insertar carrera
        jMenuItemInsertarCarreras.addActionListener(e -> jmiInsertarCarreras());
        jMenuItemInsertarBachillerato.addActionListener (e -> jmiInsertarBachillerato());
       
        // Agregar menuItem a menu 
        jMenuAlumnos.add(jMenuItemVerAlumnos);
        jMenuAlumnos.add(jMenuItemInsertar);
        jMenuBar.add(jMenuAlumnos);

        jMenuCarreras.add(jMenuItemVerCarreras);
        jMenuCarreras.add(jMenuItemInsertarCarreras);
        jMenuBar.add(jMenuCarreras);

        jMenuBachilleratos.add(jMenuItemVerBachillerato);
        jMenuBachilleratos.add(jMenuItemInsertarBachillerato);
        jMenuBar.add(jMenuBachilleratos);

        this.setJMenuBar(jMenuBar);
        pack();
    }

    private void jmiInsertarCarreras(){
        // 1. Crear un objeti tipo JInternalFrame 
        JInternalFrameInsertarCarrera insertarCarrera = new JInternalFrameInsertarCarrera();
        //2. Agregar el internal frame al escritorio (desktop)
        this.desktop.add(insertarCarrera);
        // 3. Hacer visible el internal frame 
        insertarCarrera.setVisible(true);
    }

    private void jmiInsertarBachillerato(){
        // 1. Crear un objeti tipo JInternalFrame 
        JInternalFrameInsertarBachillerato insertarBachillerato = new JInternalFrameInsertarBachillerato();
        //2. Agregar el internal frame al escritorio (desktop)
        this.desktop.add(insertarBachillerato);
        // 3. Hacer visible el internal frame 
        insertarBachillerato.setVisible(true);
    }

    
}