package main;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.IOException;
import javax.swing.JButton;
import javax.swing.JDesktopPane;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;
import org.ini4j.Ini;
import org.ini4j.IniPreferences;


public class iniciar {
    
    public static java.util.prefs.Preferences valores;
    
    //fonts
    Font font_t1 = new Font ("Verdana", 1, 20);
    Font font_t2 = new Font ("Verdana", 2, 40);
    Font font_b1 = new Font ("Verdana", 1, 9);
    Font font_b2 = new Font ("Verdana", 1, 15);
    
        
    //Colores
    Color redd = new Color (255, 82, 82);
    Color natura = new Color (13, 255, 159);
    Color bootonf = new Color (233, 177, 15);
    Color bootonF = new Color (238, 238, 238);
    
    
    //Variables
    
    public int L_presentacion = 0;
    public int L_ortografia = 0;
    public int L_vocabulario = 0;
    public int L_caligrafia = 0;
    
    public int M_presentacion = 0;
    public int M_calculo = 0;
    public int M_problemas = 0;
    
    public int N_presentacion = 0;
    public int N_ortografia = 0;
    
    public int S_presentacion = 0;
    public int S_ortografia = 0;
    
    

    public static void main(String[] args) throws IOException {
        
        iniciar ventana = new iniciar();
        
    }
    
    public iniciar() throws IOException{
        
        Ini ini = new Ini(new File("valores.ini"));
        valores = new IniPreferences(ini);
        
        JFrame marco = new JFrame();
    
        //Configuracuón de la ventana
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        marco.pack();
        marco.setSize(800, 500);
        marco.setLocationRelativeTo(null);
        marco.setResizable(false);
        marco.setTitle("Asistente de corrección");
 
        //Creacion del conjunto de pestañas
        JTabbedPane pestañas = new JTabbedPane();

        //Creación de los escritorios
        JDesktopPane dk1 = new JDesktopPane();
        JDesktopPane dk2 = new JDesktopPane();
        JDesktopPane dk3 = new JDesktopPane();
        JDesktopPane dk4 = new JDesktopPane();
        
        //Configuración de los escritorios
        dk1.setBackground(Color.cyan);
        dk2.setBackground(redd);
        dk3.setBackground(natura);
        dk4.setBackground(Color.green);

        //Componentes del panel 1
        JLabel l_presentacion = new JLabel();
        l_presentacion.setBounds(10, 20, 150, 30);
        l_presentacion.setFont(font_t1);
        l_presentacion.setBackground(Color.cyan);
        l_presentacion.setText("Presentación");
        
        JButton l_presentacion1 = new JButton();
        l_presentacion1.setBounds(165, 15, 40, 40);
        l_presentacion1.setFont(font_b1);
        l_presentacion1.setText("1");
        
        JButton l_presentacion2 = new JButton();
        l_presentacion2.setBounds(165+(50*1), 15, 40, 40);
        l_presentacion2.setFont(font_b1);
        l_presentacion2.setText("2");
        
        JButton l_presentacion3 = new JButton();
        l_presentacion3.setBounds(165+(50*2), 15, 40, 40);
        l_presentacion3.setFont(font_b1);
        l_presentacion3.setText("3");
        
        JButton l_presentacion4 = new JButton();
        l_presentacion4.setBounds(165+(50*3), 15, 40, 40);
        l_presentacion4.setFont(font_b1);
        l_presentacion4.setText("4");
        
        JButton l_presentacion5 = new JButton();
        l_presentacion5.setBounds(165+(50*4), 15, 40, 40);
        l_presentacion5.setFont(font_b1);
        l_presentacion5.setText("5");
        
        JButton l_presentacion6 = new JButton();
        l_presentacion6.setBounds(165+(50*5), 15, 40, 40);
        l_presentacion6.setFont(font_b1);
        l_presentacion6.setText("6");
        
        JButton l_presentacion7 = new JButton();
        l_presentacion7.setBounds(165+(50*6), 15, 40, 40);
        l_presentacion7.setFont(font_b1);
        l_presentacion7.setText("7");
        
        JButton l_presentacion8 = new JButton();
        l_presentacion8.setBounds(165+(50*7), 15, 40, 40);
        l_presentacion8.setFont(font_b1);
        l_presentacion8.setText("8");
        
        JButton l_presentacion9 = new JButton();
        l_presentacion9.setBounds(165+(50*8), 15, 40, 40);
        l_presentacion9.setFont(font_b1);
        l_presentacion9.setText("9");
        
        JButton l_presentacion10 = new JButton();
        l_presentacion10.setBounds(165+(50*9), 15, 50, 40);
        l_presentacion10.setFont(font_b1);
        l_presentacion10.setText("10");
        
        JLabel l_presentacionS = new JLabel();
        l_presentacionS.setBounds(700, 20, 40, 30);
        l_presentacionS.setFont(font_t1);
        l_presentacionS.setBackground(Color.cyan);
        l_presentacionS.setText(Integer.toString(L_presentacion));
        
        
        JLabel l_ortografia = new JLabel();
        l_ortografia.setBounds(10, 20+(50*1), 150, 30);
        l_ortografia.setFont(font_t1);
        l_ortografia.setBackground(Color.cyan);
        l_ortografia.setText("Ortografia");
        
        JButton l_ortografia1 = new JButton();
        l_ortografia1.setBounds(165, 15+(50*1), 40, 40);
        l_ortografia1.setFont(font_b1);
        l_ortografia1.setText("1");
        
        JButton l_ortografia2 = new JButton();
        l_ortografia2.setBounds(165+(50*1), 15+(50*1), 40, 40);
        l_ortografia2.setFont(font_b1);
        l_ortografia2.setText("2");
        
        JButton l_ortografia3 = new JButton();
        l_ortografia3.setBounds(165+(50*2), 15+(50*1), 40, 40);
        l_ortografia3.setFont(font_b1);
        l_ortografia3.setText("3");
        
        JButton l_ortografia4 = new JButton();
        l_ortografia4.setBounds(165+(50*3), 15+(50*1), 40, 40);
        l_ortografia4.setFont(font_b1);
        l_ortografia4.setText("4");
        
        JButton l_ortografia5 = new JButton();
        l_ortografia5.setBounds(165+(50*4), 15+(50*1), 40, 40);
        l_ortografia5.setFont(font_b1);
        l_ortografia5.setText("5");
        
        JButton l_ortografia6 = new JButton();
        l_ortografia6.setBounds(165+(50*5), 15+(50*1), 40, 40);
        l_ortografia6.setFont(font_b1);
        l_ortografia6.setText("6");
        
        JButton l_ortografia7 = new JButton();
        l_ortografia7.setBounds(165+(50*6), 15+(50*1), 40, 40);
        l_ortografia7.setFont(font_b1);
        l_ortografia7.setText("7");
        
        JButton l_ortografia8 = new JButton();
        l_ortografia8.setBounds(165+(50*7), 15+(50*1), 40, 40);
        l_ortografia8.setFont(font_b1);
        l_ortografia8.setText("8");
        
        JButton l_ortografia9 = new JButton();
        l_ortografia9.setBounds(165+(50*8), 15+(50*1), 40, 40);
        l_ortografia9.setFont(font_b1);
        l_ortografia9.setText("9");
        
        JButton l_ortografia10 = new JButton();
        l_ortografia10.setBounds(165+(50*9), 15+(50*1), 50, 40);
        l_ortografia10.setFont(font_b1);
        l_ortografia10.setText("10");
        
        JLabel l_ortografiaS = new JLabel();
        l_ortografiaS.setBounds(700, 20+(50*1), 40, 30);
        l_ortografiaS.setFont(font_t1);
        l_ortografiaS.setBackground(Color.cyan);
        l_ortografiaS.setText(Integer.toString(L_ortografia));
        
        
        JLabel l_vocabulario = new JLabel();
        l_vocabulario.setBounds(10, 20+(50*2), 150, 30);
        l_vocabulario.setFont(font_t1);
        l_vocabulario.setBackground(Color.cyan);
        l_vocabulario.setText("Vocabulario");
        
        JButton l_vocabulario1 = new JButton();
        l_vocabulario1.setBounds(165, 15+(50*2), 40, 40);
        l_vocabulario1.setFont(font_b1);
        l_vocabulario1.setText("1");
        
        JButton l_vocabulario2 = new JButton();
        l_vocabulario2.setBounds(165+(50*1), 15+(50*2), 40, 40);
        l_vocabulario2.setFont(font_b1);
        l_vocabulario2.setText("2");
        
        JButton l_vocabulario3 = new JButton();
        l_vocabulario3.setBounds(165+(50*2), 15+(50*2), 40, 40);
        l_vocabulario3.setFont(font_b1);
        l_vocabulario3.setText("3");
        
        JButton l_vocabulario4 = new JButton();
        l_vocabulario4.setBounds(165+(50*3), 15+(50*2), 40, 40);
        l_vocabulario4.setFont(font_b1);
        l_vocabulario4.setText("4");
        
        JButton l_vocabulario5 = new JButton();
        l_vocabulario5.setBounds(165+(50*4), 15+(50*2), 40, 40);
        l_vocabulario5.setFont(font_b1);
        l_vocabulario5.setText("5");
        
        JButton l_vocabulario6 = new JButton();
        l_vocabulario6.setBounds(165+(50*5), 15+(50*2), 40, 40);
        l_vocabulario6.setFont(font_b1);
        l_vocabulario6.setText("6");
        
        JButton l_vocabulario7 = new JButton();
        l_vocabulario7.setBounds(165+(50*6), 15+(50*2), 40, 40);
        l_vocabulario7.setFont(font_b1);
        l_vocabulario7.setText("7");
        
        JButton l_vocabulario8 = new JButton();
        l_vocabulario8.setBounds(165+(50*7), 15+(50*2), 40, 40);
        l_vocabulario8.setFont(font_b1);
        l_vocabulario8.setText("8");
        
        JButton l_vocabulario9 = new JButton();
        l_vocabulario9.setBounds(165+(50*8), 15+(50*2), 40, 40);
        l_vocabulario9.setFont(font_b1);
        l_vocabulario9.setText("9");
        
        JButton l_vocabulario10 = new JButton();
        l_vocabulario10.setBounds(165+(50*9), 15+(50*2), 50, 40);
        l_vocabulario10.setFont(font_b1);
        l_vocabulario10.setText("10");
        
        JLabel l_vocabularioS = new JLabel();
        l_vocabularioS.setBounds(700, 20+(50*2), 40, 30);
        l_vocabularioS.setFont(font_t1);
        l_vocabularioS.setBackground(Color.cyan);
        l_vocabularioS.setText(Integer.toString(L_vocabulario));
        
        JLabel l_caligrafia = new JLabel();
        l_caligrafia.setBounds(10, 20+(50*3), 150, 30);
        l_caligrafia.setFont(font_t1);
        l_caligrafia.setBackground(Color.cyan);
        l_caligrafia.setText("Caligrafia");
        
        JButton l_caligrafia1 = new JButton();
        l_caligrafia1.setBounds(165, 15+(50*3), 40, 40);
        l_caligrafia1.setFont(font_b1);
        l_caligrafia1.setText("1");
        
        JButton l_caligrafia2 = new JButton();
        l_caligrafia2.setBounds(165+(50*1), 15+(50*3), 40, 40);
        l_caligrafia2.setFont(font_b1);
        l_caligrafia2.setText("2");
        
        JButton l_caligrafia3 = new JButton();
        l_caligrafia3.setBounds(165+(50*2), 15+(50*3), 40, 40);
        l_caligrafia3.setFont(font_b1);
        l_caligrafia3.setText("3");
        
        JButton l_caligrafia4 = new JButton();
        l_caligrafia4.setBounds(165+(50*3), 15+(50*3), 40, 40);
        l_caligrafia4.setFont(font_b1);
        l_caligrafia4.setText("4");
        
        JButton l_caligrafia5 = new JButton();
        l_caligrafia5.setBounds(165+(50*4), 15+(50*3), 40, 40);
        l_caligrafia5.setFont(font_b1);
        l_caligrafia5.setText("5");
        
        JButton l_caligrafia6 = new JButton();
        l_caligrafia6.setBounds(165+(50*5), 15+(50*3), 40, 40);
        l_caligrafia6.setFont(font_b1);
        l_caligrafia6.setText("6");
        
        JButton l_caligrafia7 = new JButton();
        l_caligrafia7.setBounds(165+(50*6), 15+(50*3), 40, 40);
        l_caligrafia7.setFont(font_b1);
        l_caligrafia7.setText("7");
        
        JButton l_caligrafia8 = new JButton();
        l_caligrafia8.setBounds(165+(50*7), 15+(50*3), 40, 40);
        l_caligrafia8.setFont(font_b1);
        l_caligrafia8.setText("8");
        
        JButton l_caligrafia9 = new JButton();
        l_caligrafia9.setBounds(165+(50*8), 15+(50*3), 40, 40);
        l_caligrafia9.setFont(font_b1);
        l_caligrafia9.setText("9");
        
        JButton l_caligrafia10 = new JButton();
        l_caligrafia10.setBounds(165+(50*9), 15+(50*3), 50, 40);
        l_caligrafia10.setFont(font_b1);
        l_caligrafia10.setText("10");
        
        JLabel l_caligrafiaS = new JLabel();
        l_caligrafiaS.setBounds(700, 20+(50*3), 40, 30);
        l_caligrafiaS.setFont(font_t1);
        l_caligrafiaS.setBackground(Color.cyan);
        l_caligrafiaS.setText(Integer.toString(L_caligrafia));
        
        
        JLabel l_contenido = new JLabel();
        l_contenido.setBounds(10, 20+(50*4), 120, 30);
        l_contenido.setFont(font_t1);
        l_contenido.setBackground(Color.cyan);
        l_contenido.setText("Contenido");
        
        JLabel l_contenid_total = new JLabel();
        l_contenid_total.setBounds(150, 20+(50*4), 120, 30);
        l_contenid_total.setFont(font_t1);
        l_contenid_total.setBackground(Color.cyan);
        l_contenid_total.setText("Total:");
        
        JTextArea l_contenido_total = new JTextArea();
        l_contenido_total.setBounds(220, 20+(50*4), 30, 30);
        l_contenido_total.setFont(font_t1);
        l_contenido_total.setBackground(Color.lightGray);
        l_contenido_total.setText("");
        
        JLabel l_contenid_bien = new JLabel();
        l_contenid_bien.setBounds(280, 20+(50*4), 120, 30);
        l_contenid_bien.setFont(font_t1);
        l_contenid_bien.setBackground(Color.cyan);
        l_contenid_bien.setText("Bien:");
        
        JTextArea l_contenido_bien = new JTextArea();
        l_contenido_bien.setBounds(340, 20+(50*4), 30, 30);
        l_contenido_bien.setFont(font_t1);
        l_contenido_bien.setBackground(Color.lightGray);
        l_contenido_bien.setText("");
        
        JLabel l_contenid_regular = new JLabel();
        l_contenid_regular.setBounds(400, 20+(50*4), 120, 30);
        l_contenid_regular.setFont(font_t1);
        l_contenid_regular.setBackground(Color.cyan);
        l_contenid_regular.setText("Regular:");
        
        JTextArea l_contenido_regular = new JTextArea();
        l_contenido_regular.setBounds(500, 20+(50*4), 30, 30);
        l_contenido_regular.setFont(font_t1);
        l_contenido_regular.setBackground(Color.lightGray);
        l_contenido_regular.setText("");
        
        JButton l_reset = new JButton();
        l_reset.setBounds(580, 360, 160, 50);
        l_reset.setFont(font_b2);
        l_reset.setText("Reiniciar");
        
        JButton l_calcular = new JButton();
        l_calcular.setBounds(50, 360, 150, 50);
        l_calcular.setFont(font_b2);
        l_calcular.setText("Calcular");
        
        JLabel l_total = new JLabel();
        l_total.setBounds(240, 360, 150, 40);
        l_total.setFont(font_t2);
        l_total.setBackground(Color.cyan);
        l_total.setText("0");
        
        
        
        resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
        resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
        resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
        resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
        
        dk1.add(l_presentacion);
        dk1.add(l_presentacion1);
        dk1.add(l_presentacion2);
        dk1.add(l_presentacion3);
        dk1.add(l_presentacion4);
        dk1.add(l_presentacion5);
        dk1.add(l_presentacion6);
        dk1.add(l_presentacion7);
        dk1.add(l_presentacion8);
        dk1.add(l_presentacion9);
        dk1.add(l_presentacion10);
        dk1.add(l_presentacionS);
        dk1.add(l_ortografia);
        dk1.add(l_ortografia1);
        dk1.add(l_ortografia2);
        dk1.add(l_ortografia3);
        dk1.add(l_ortografia4);
        dk1.add(l_ortografia5);
        dk1.add(l_ortografia6);
        dk1.add(l_ortografia7);
        dk1.add(l_ortografia8);
        dk1.add(l_ortografia9);
        dk1.add(l_ortografia10);
        dk1.add(l_ortografiaS);
        dk1.add(l_vocabulario);
        dk1.add(l_vocabulario1);
        dk1.add(l_vocabulario2);
        dk1.add(l_vocabulario3);
        dk1.add(l_vocabulario4);
        dk1.add(l_vocabulario5);
        dk1.add(l_vocabulario6);
        dk1.add(l_vocabulario7);
        dk1.add(l_vocabulario8);
        dk1.add(l_vocabulario9);
        dk1.add(l_vocabulario10);
        dk1.add(l_vocabularioS);
        dk1.add(l_caligrafia);
        dk1.add(l_caligrafia1);
        dk1.add(l_caligrafia2);
        dk1.add(l_caligrafia3);
        dk1.add(l_caligrafia4);
        dk1.add(l_caligrafia5);
        dk1.add(l_caligrafia6);
        dk1.add(l_caligrafia7);
        dk1.add(l_caligrafia8);
        dk1.add(l_caligrafia9);
        dk1.add(l_caligrafia10);
        dk1.add(l_caligrafiaS);
        dk1.add(l_contenido);
        dk1.add(l_contenid_total);
        dk1.add(l_contenid_regular);
        dk1.add(l_contenid_bien);
        dk1.add(l_contenido_total);
        dk1.add(l_contenido_regular);
        dk1.add(l_contenido_bien);
        dk1.add(l_calcular);
        dk1.add(l_reset);
        dk1.add(l_total);
        
        //Componentes del panel 2
        
        JLabel m_presentacion = new JLabel();
        m_presentacion.setBounds(10, 20, 150, 30);
        m_presentacion.setFont(font_t1);
        m_presentacion.setBackground(Color.cyan);
        m_presentacion.setText("Presentación");
        
        JButton m_presentacion1 = new JButton();
        m_presentacion1.setBounds(165, 15, 40, 40);
        m_presentacion1.setFont(font_b1);
        m_presentacion1.setText("1");
        
        JButton m_presentacion2 = new JButton();
        m_presentacion2.setBounds(165+(50*1), 15, 40, 40);
        m_presentacion2.setFont(font_b1);
        m_presentacion2.setText("2");
        
        JButton m_presentacion3 = new JButton();
        m_presentacion3.setBounds(165+(50*2), 15, 40, 40);
        m_presentacion3.setFont(font_b1);
        m_presentacion3.setText("3");
        
        JButton m_presentacion4 = new JButton();
        m_presentacion4.setBounds(165+(50*3), 15, 40, 40);
        m_presentacion4.setFont(font_b1);
        m_presentacion4.setText("4");
        
        JButton m_presentacion5 = new JButton();
        m_presentacion5.setBounds(165+(50*4), 15, 40, 40);
        m_presentacion5.setFont(font_b1);
        m_presentacion5.setText("5");
        
        JButton m_presentacion6 = new JButton();
        m_presentacion6.setBounds(165+(50*5), 15, 40, 40);
        m_presentacion6.setFont(font_b1);
        m_presentacion6.setText("6");
        
        JButton m_presentacion7 = new JButton();
        m_presentacion7.setBounds(165+(50*6), 15, 40, 40);
        m_presentacion7.setFont(font_b1);
        m_presentacion7.setText("7");
        
        JButton m_presentacion8 = new JButton();
        m_presentacion8.setBounds(165+(50*7), 15, 40, 40);
        m_presentacion8.setFont(font_b1);
        m_presentacion8.setText("8");
        
        JButton m_presentacion9 = new JButton();
        m_presentacion9.setBounds(165+(50*8), 15, 40, 40);
        m_presentacion9.setFont(font_b1);
        m_presentacion9.setText("9");
        
        JButton m_presentacion10 = new JButton();
        m_presentacion10.setBounds(165+(50*9), 15, 50, 40);
        m_presentacion10.setFont(font_b1);
        m_presentacion10.setText("10");
        
        JLabel m_presentacionS = new JLabel();
        m_presentacionS.setBounds(700, 20, 40, 30);
        m_presentacionS.setFont(font_t1);
        m_presentacionS.setBackground(Color.cyan);
        m_presentacionS.setText(Integer.toString(L_presentacion));
        
        
        JLabel m_calculo = new JLabel();
        m_calculo.setBounds(10, 20+(50*1), 150, 30);
        m_calculo.setFont(font_t1);
        m_calculo.setBackground(Color.cyan);
        m_calculo.setText("Calculo");
        
        JButton m_calculo1 = new JButton();
        m_calculo1.setBounds(165, 15+(50*1), 40, 40);
        m_calculo1.setFont(font_b1);
        m_calculo1.setText("1");
        
        JButton m_calculo2 = new JButton();
        m_calculo2.setBounds(165+(50*1), 15+(50*1), 40, 40);
        m_calculo2.setFont(font_b1);
        m_calculo2.setText("2");
        
        JButton m_calculo3 = new JButton();
        m_calculo3.setBounds(165+(50*2), 15+(50*1), 40, 40);
        m_calculo3.setFont(font_b1);
        m_calculo3.setText("3");
        
        JButton m_calculo4 = new JButton();
        m_calculo4.setBounds(165+(50*3), 15+(50*1), 40, 40);
        m_calculo4.setFont(font_b1);
        m_calculo4.setText("4");
        
        JButton m_calculo5 = new JButton();
        m_calculo5.setBounds(165+(50*4), 15+(50*1), 40, 40);
        m_calculo5.setFont(font_b1);
        m_calculo5.setText("5");
        
        JButton m_calculo6 = new JButton();
        m_calculo6.setBounds(165+(50*5), 15+(50*1), 40, 40);
        m_calculo6.setFont(font_b1);
        m_calculo6.setText("6");
        
        JButton m_calculo7 = new JButton();
        m_calculo7.setBounds(165+(50*6), 15+(50*1), 40, 40);
        m_calculo7.setFont(font_b1);
        m_calculo7.setText("7");
        
        JButton m_calculo8 = new JButton();
        m_calculo8.setBounds(165+(50*7), 15+(50*1), 40, 40);
        m_calculo8.setFont(font_b1);
        m_calculo8.setText("8");
        
        JButton m_calculo9 = new JButton();
        m_calculo9.setBounds(165+(50*8), 15+(50*1), 40, 40);
        m_calculo9.setFont(font_b1);
        m_calculo9.setText("9");
        
        JButton m_calculo10 = new JButton();
        m_calculo10.setBounds(165+(50*9), 15+(50*1), 50, 40);
        m_calculo10.setFont(font_b1);
        m_calculo10.setText("10");
        
        JLabel m_calculoS = new JLabel();
        m_calculoS.setBounds(700, 20+(50*1), 40, 30);
        m_calculoS.setFont(font_t1);
        m_calculoS.setBackground(Color.cyan);
        m_calculoS.setText(Integer.toString(M_calculo));
        
        
        JLabel m_problemas = new JLabel();
        m_problemas.setBounds(10, 20+(50*2), 150, 30);
        m_problemas.setFont(font_t1);
        m_problemas.setBackground(Color.cyan);
        m_problemas.setText("Problemas");
        
        JButton m_problemas1 = new JButton();
        m_problemas1.setBounds(165, 15+(50*2), 40, 40);
        m_problemas1.setFont(font_b1);
        m_problemas1.setText("1");
        
        JButton m_problemas2 = new JButton();
        m_problemas2.setBounds(165+(50*1), 15+(50*2), 40, 40);
        m_problemas2.setFont(font_b1);
        m_problemas2.setText("2");
        
        JButton m_problemas3 = new JButton();
        m_problemas3.setBounds(165+(50*2), 15+(50*2), 40, 40);
        m_problemas3.setFont(font_b1);
        m_problemas3.setText("3");
        
        JButton m_problemas4 = new JButton();
        m_problemas4.setBounds(165+(50*3), 15+(50*2), 40, 40);
        m_problemas4.setFont(font_b1);
        m_problemas4.setText("4");
        
        JButton m_problemas5 = new JButton();
        m_problemas5.setBounds(165+(50*4), 15+(50*2), 40, 40);
        m_problemas5.setFont(font_b1);
        m_problemas5.setText("5");
        
        JButton m_problemas6 = new JButton();
        m_problemas6.setBounds(165+(50*5), 15+(50*2), 40, 40);
        m_problemas6.setFont(font_b1);
        m_problemas6.setText("6");
        
        JButton m_problemas7 = new JButton();
        m_problemas7.setBounds(165+(50*6), 15+(50*2), 40, 40);
        m_problemas7.setFont(font_b1);
        m_problemas7.setText("7");
        
        JButton m_problemas8 = new JButton();
        m_problemas8.setBounds(165+(50*7), 15+(50*2), 40, 40);
        m_problemas8.setFont(font_b1);
        m_problemas8.setText("8");
        
        JButton m_problemas9 = new JButton();
        m_problemas9.setBounds(165+(50*8), 15+(50*2), 40, 40);
        m_problemas9.setFont(font_b1);
        m_problemas9.setText("9");
        
        JButton m_problemas10 = new JButton();
        m_problemas10.setBounds(165+(50*9), 15+(50*2), 50, 40);
        m_problemas10.setFont(font_b1);
        m_problemas10.setText("10");
        
        JLabel m_problemasS = new JLabel();
        m_problemasS.setBounds(700, 20+(50*2), 40, 30);
        m_problemasS.setFont(font_t1);
        m_problemasS.setBackground(Color.cyan);
        m_problemasS.setText(Integer.toString(M_problemas));
        
        JLabel m_contenido = new JLabel();
        m_contenido.setBounds(10, 20+(50*4), 120, 30);
        m_contenido.setFont(font_t1);
        m_contenido.setBackground(Color.cyan);
        m_contenido.setText("Contenido");
        
        JLabel m_contenid_total = new JLabel();
        m_contenid_total.setBounds(150, 20+(50*4), 120, 30);
        m_contenid_total.setFont(font_t1);
        m_contenid_total.setBackground(Color.cyan);
        m_contenid_total.setText("Total:");
        
        JTextArea m_contenido_total = new JTextArea();
        m_contenido_total.setBounds(220, 20+(50*4), 30, 30);
        m_contenido_total.setFont(font_t1);
        m_contenido_total.setBackground(Color.lightGray);
        m_contenido_total.setText("");
        
        JLabel m_contenid_bien = new JLabel();
        m_contenid_bien.setBounds(280, 20+(50*4), 120, 30);
        m_contenid_bien.setFont(font_t1);
        m_contenid_bien.setBackground(Color.cyan);
        m_contenid_bien.setText("Bien:");
        
        JTextArea m_contenido_bien = new JTextArea();
        m_contenido_bien.setBounds(340, 20+(50*4), 30, 30);
        m_contenido_bien.setFont(font_t1);
        m_contenido_bien.setBackground(Color.lightGray);
        m_contenido_bien.setText("");
        
        JLabel m_contenid_regular = new JLabel();
        m_contenid_regular.setBounds(400, 20+(50*4), 120, 30);
        m_contenid_regular.setFont(font_t1);
        m_contenid_regular.setBackground(Color.cyan);
        m_contenid_regular.setText("Regular:");
        
        JTextArea m_contenido_regular = new JTextArea();
        m_contenido_regular.setBounds(500, 20+(50*4), 30, 30);
        m_contenido_regular.setFont(font_t1);
        m_contenido_regular.setBackground(Color.lightGray);
        m_contenido_regular.setText("");
        
        JButton m_reset = new JButton();
        m_reset.setBounds(580, 360, 160, 50);
        m_reset.setFont(font_b2);
        m_reset.setText("Reiniciar");
        
        JButton m_calcular = new JButton();
        m_calcular.setBounds(50, 360, 150, 50);
        m_calcular.setFont(font_b2);
        m_calcular.setText("Calcular");
        
        JLabel m_total = new JLabel();
        m_total.setBounds(240, 360, 150, 40);
        m_total.setFont(font_t2);
        m_total.setBackground(Color.cyan);
        m_total.setText("0");
        
        
        
        resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
        resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
        resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
        
        dk2.add(m_presentacion);
        dk2.add(m_presentacion1);
        dk2.add(m_presentacion2);
        dk2.add(m_presentacion3);
        dk2.add(m_presentacion4);
        dk2.add(m_presentacion5);
        dk2.add(m_presentacion6);
        dk2.add(m_presentacion7);
        dk2.add(m_presentacion8);
        dk2.add(m_presentacion9);
        dk2.add(m_presentacion10);
        dk2.add(m_presentacionS);
        dk2.add(m_calculo);
        dk2.add(m_calculo1);
        dk2.add(m_calculo2);
        dk2.add(m_calculo3);
        dk2.add(m_calculo4);
        dk2.add(m_calculo5);
        dk2.add(m_calculo6);
        dk2.add(m_calculo7);
        dk2.add(m_calculo8);
        dk2.add(m_calculo9);
        dk2.add(m_calculo10);
        dk2.add(m_calculoS);
        dk2.add(m_problemas);
        dk2.add(m_problemas1);
        dk2.add(m_problemas2);
        dk2.add(m_problemas3);
        dk2.add(m_problemas4);
        dk2.add(m_problemas5);
        dk2.add(m_problemas6);
        dk2.add(m_problemas7);
        dk2.add(m_problemas8);
        dk2.add(m_problemas9);
        dk2.add(m_problemas10);
        dk2.add(m_problemasS);
        dk2.add(m_contenido);
        dk2.add(m_contenid_total);
        dk2.add(m_contenid_regular);
        dk2.add(m_contenid_bien);
        dk2.add(m_contenido_total);
        dk2.add(m_contenido_regular);
        dk2.add(m_contenido_bien);
        dk2.add(m_calcular);
        dk2.add(m_reset);
        dk2.add(m_total);
        
        //Componentes del panel 3
        
        JLabel n_presentacion = new JLabel();
        n_presentacion.setBounds(10, 20, 150, 30);
        n_presentacion.setFont(font_t1);
        n_presentacion.setBackground(Color.cyan);
        n_presentacion.setText("Presentación");
        
        JButton n_presentacion1 = new JButton();
        n_presentacion1.setBounds(165, 15, 40, 40);
        n_presentacion1.setFont(font_b1);
        n_presentacion1.setText("1");
        
        JButton n_presentacion2 = new JButton();
        n_presentacion2.setBounds(165+(50*1), 15, 40, 40);
        n_presentacion2.setFont(font_b1);
        n_presentacion2.setText("2");
        
        JButton n_presentacion3 = new JButton();
        n_presentacion3.setBounds(165+(50*2), 15, 40, 40);
        n_presentacion3.setFont(font_b1);
        n_presentacion3.setText("3");
        
        JButton n_presentacion4 = new JButton();
        n_presentacion4.setBounds(165+(50*3), 15, 40, 40);
        n_presentacion4.setFont(font_b1);
        n_presentacion4.setText("4");
        
        JButton n_presentacion5 = new JButton();
        n_presentacion5.setBounds(165+(50*4), 15, 40, 40);
        n_presentacion5.setFont(font_b1);
        n_presentacion5.setText("5");
        
        JButton n_presentacion6 = new JButton();
        n_presentacion6.setBounds(165+(50*5), 15, 40, 40);
        n_presentacion6.setFont(font_b1);
        n_presentacion6.setText("6");
        
        JButton n_presentacion7 = new JButton();
        n_presentacion7.setBounds(165+(50*6), 15, 40, 40);
        n_presentacion7.setFont(font_b1);
        n_presentacion7.setText("7");
        
        JButton n_presentacion8 = new JButton();
        n_presentacion8.setBounds(165+(50*7), 15, 40, 40);
        n_presentacion8.setFont(font_b1);
        n_presentacion8.setText("8");
        
        JButton n_presentacion9 = new JButton();
        n_presentacion9.setBounds(165+(50*8), 15, 40, 40);
        n_presentacion9.setFont(font_b1);
        n_presentacion9.setText("9");
        
        JButton n_presentacion10 = new JButton();
        n_presentacion10.setBounds(165+(50*9), 15, 50, 40);
        n_presentacion10.setFont(font_b1);
        n_presentacion10.setText("10");
        
        JLabel n_presentacionS = new JLabel();
        n_presentacionS.setBounds(700, 20, 40, 30);
        n_presentacionS.setFont(font_t1);
        n_presentacionS.setBackground(Color.cyan);
        n_presentacionS.setText(Integer.toString(L_presentacion));
        
        
        JLabel n_ortografia = new JLabel();
        n_ortografia.setBounds(10, 20+(50*1), 150, 30);
        n_ortografia.setFont(font_t1);
        n_ortografia.setBackground(Color.cyan);
        n_ortografia.setText("Ortografia");
        
        JButton n_ortografia1 = new JButton();
        n_ortografia1.setBounds(165, 15+(50*1), 40, 40);
        n_ortografia1.setFont(font_b1);
        n_ortografia1.setText("1");
        
        JButton n_ortografia2 = new JButton();
        n_ortografia2.setBounds(165+(50*1), 15+(50*1), 40, 40);
        n_ortografia2.setFont(font_b1);
        n_ortografia2.setText("2");
        
        JButton n_ortografia3 = new JButton();
        n_ortografia3.setBounds(165+(50*2), 15+(50*1), 40, 40);
        n_ortografia3.setFont(font_b1);
        n_ortografia3.setText("3");
        
        JButton n_ortografia4 = new JButton();
        n_ortografia4.setBounds(165+(50*3), 15+(50*1), 40, 40);
        n_ortografia4.setFont(font_b1);
        n_ortografia4.setText("4");
        
        JButton n_ortografia5 = new JButton();
        n_ortografia5.setBounds(165+(50*4), 15+(50*1), 40, 40);
        n_ortografia5.setFont(font_b1);
        n_ortografia5.setText("5");
        
        JButton n_ortografia6 = new JButton();
        n_ortografia6.setBounds(165+(50*5), 15+(50*1), 40, 40);
        n_ortografia6.setFont(font_b1);
        n_ortografia6.setText("6");
        
        JButton n_ortografia7 = new JButton();
        n_ortografia7.setBounds(165+(50*6), 15+(50*1), 40, 40);
        n_ortografia7.setFont(font_b1);
        n_ortografia7.setText("7");
        
        JButton n_ortografia8 = new JButton();
        n_ortografia8.setBounds(165+(50*7), 15+(50*1), 40, 40);
        n_ortografia8.setFont(font_b1);
        n_ortografia8.setText("8");
        
        JButton n_ortografia9 = new JButton();
        n_ortografia9.setBounds(165+(50*8), 15+(50*1), 40, 40);
        n_ortografia9.setFont(font_b1);
        n_ortografia9.setText("9");
        
        JButton n_ortografia10 = new JButton();
        n_ortografia10.setBounds(165+(50*9), 15+(50*1), 50, 40);
        n_ortografia10.setFont(font_b1);
        n_ortografia10.setText("10");
        
        JLabel n_ortografiaS = new JLabel();
        n_ortografiaS.setBounds(700, 20+(50*1), 40, 30);
        n_ortografiaS.setFont(font_t1);
        n_ortografiaS.setBackground(Color.cyan);
        n_ortografiaS.setText(Integer.toString(M_calculo));
        
        
        JLabel n_contenido = new JLabel();
        n_contenido.setBounds(10, 20+(50*4), 120, 30);
        n_contenido.setFont(font_t1);
        n_contenido.setBackground(Color.cyan);
        n_contenido.setText("Contenido");
        
        JLabel n_contenid_total = new JLabel();
        n_contenid_total.setBounds(150, 20+(50*4), 120, 30);
        n_contenid_total.setFont(font_t1);
        n_contenid_total.setBackground(Color.cyan);
        n_contenid_total.setText("Total:");
        
        JTextArea n_contenido_total = new JTextArea();
        n_contenido_total.setBounds(220, 20+(50*4), 30, 30);
        n_contenido_total.setFont(font_t1);
        n_contenido_total.setBackground(Color.lightGray);
        n_contenido_total.setText("");
        
        JLabel n_contenid_bien = new JLabel();
        n_contenid_bien.setBounds(280, 20+(50*4), 120, 30);
        n_contenid_bien.setFont(font_t1);
        n_contenid_bien.setBackground(Color.cyan);
        n_contenid_bien.setText("Bien:");
        
        JTextArea n_contenido_bien = new JTextArea();
        n_contenido_bien.setBounds(340, 20+(50*4), 30, 30);
        n_contenido_bien.setFont(font_t1);
        n_contenido_bien.setBackground(Color.lightGray);
        n_contenido_bien.setText("");
        
        JLabel n_contenid_regular = new JLabel();
        n_contenid_regular.setBounds(400, 20+(50*4), 120, 30);
        n_contenid_regular.setFont(font_t1);
        n_contenid_regular.setBackground(Color.cyan);
        n_contenid_regular.setText("Regular:");
        
        JTextArea n_contenido_regular = new JTextArea();
        n_contenido_regular.setBounds(500, 20+(50*4), 30, 30);
        n_contenido_regular.setFont(font_t1);
        n_contenido_regular.setBackground(Color.lightGray);
        n_contenido_regular.setText("");
        
        JButton n_reset = new JButton();
        n_reset.setBounds(580, 360, 160, 50);
        n_reset.setFont(font_b2);
        n_reset.setText("Reiniciar");
        
        JButton n_calcular = new JButton();
        n_calcular.setBounds(50, 360, 150, 50);
        n_calcular.setFont(font_b2);
        n_calcular.setText("Calcular");
        
        JLabel n_total = new JLabel();
        n_total.setBounds(240, 360, 150, 40);
        n_total.setFont(font_t2);
        n_total.setBackground(Color.cyan);
        n_total.setText("0");
        
        
        
        resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
        resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
        
        dk3.add(n_presentacion);
        dk3.add(n_presentacion1);
        dk3.add(n_presentacion2);
        dk3.add(n_presentacion3);
        dk3.add(n_presentacion4);
        dk3.add(n_presentacion5);
        dk3.add(n_presentacion6);
        dk3.add(n_presentacion7);
        dk3.add(n_presentacion8);
        dk3.add(n_presentacion9);
        dk3.add(n_presentacion10);
        dk3.add(n_presentacionS);
        dk3.add(n_ortografia);
        dk3.add(n_ortografia1);
        dk3.add(n_ortografia2);
        dk3.add(n_ortografia3);
        dk3.add(n_ortografia4);
        dk3.add(n_ortografia5);
        dk3.add(n_ortografia6);
        dk3.add(n_ortografia7);
        dk3.add(n_ortografia8);
        dk3.add(n_ortografia9);
        dk3.add(n_ortografia10);
        dk3.add(n_ortografiaS);
        dk3.add(n_contenido);
        dk3.add(n_contenid_total);
        dk3.add(n_contenid_regular);
        dk3.add(n_contenid_bien);
        dk3.add(n_contenido_total);
        dk3.add(n_contenido_regular);
        dk3.add(n_contenido_bien);
        dk3.add(n_calcular);
        dk3.add(n_reset);
        dk3.add(n_total);
        
        //Componentes del panel 4
        
        JLabel s_presentacion = new JLabel();
        s_presentacion.setBounds(10, 20, 150, 30);
        s_presentacion.setFont(font_t1);
        s_presentacion.setBackground(Color.cyan);
        s_presentacion.setText("Presentación");
        
        JButton s_presentacion1 = new JButton();
        s_presentacion1.setBounds(165, 15, 40, 40);
        s_presentacion1.setFont(font_b1);
        s_presentacion1.setText("1");
        
        JButton s_presentacion2 = new JButton();
        s_presentacion2.setBounds(165+(50*1), 15, 40, 40);
        s_presentacion2.setFont(font_b1);
        s_presentacion2.setText("2");
        
        JButton s_presentacion3 = new JButton();
        s_presentacion3.setBounds(165+(50*2), 15, 40, 40);
        s_presentacion3.setFont(font_b1);
        s_presentacion3.setText("3");
        
        JButton s_presentacion4 = new JButton();
        s_presentacion4.setBounds(165+(50*3), 15, 40, 40);
        s_presentacion4.setFont(font_b1);
        s_presentacion4.setText("4");
        
        JButton s_presentacion5 = new JButton();
        s_presentacion5.setBounds(165+(50*4), 15, 40, 40);
        s_presentacion5.setFont(font_b1);
        s_presentacion5.setText("5");
        
        JButton s_presentacion6 = new JButton();
        s_presentacion6.setBounds(165+(50*5), 15, 40, 40);
        s_presentacion6.setFont(font_b1);
        s_presentacion6.setText("6");
        
        JButton s_presentacion7 = new JButton();
        s_presentacion7.setBounds(165+(50*6), 15, 40, 40);
        s_presentacion7.setFont(font_b1);
        s_presentacion7.setText("7");
        
        JButton s_presentacion8 = new JButton();
        s_presentacion8.setBounds(165+(50*7), 15, 40, 40);
        s_presentacion8.setFont(font_b1);
        s_presentacion8.setText("8");
        
        JButton s_presentacion9 = new JButton();
        s_presentacion9.setBounds(165+(50*8), 15, 40, 40);
        s_presentacion9.setFont(font_b1);
        s_presentacion9.setText("9");
        
        JButton s_presentacion10 = new JButton();
        s_presentacion10.setBounds(165+(50*9), 15, 50, 40);
        s_presentacion10.setFont(font_b1);
        s_presentacion10.setText("10");
        
        JLabel s_presentacionS = new JLabel();
        s_presentacionS.setBounds(700, 20, 40, 30);
        s_presentacionS.setFont(font_t1);
        s_presentacionS.setBackground(Color.cyan);
        s_presentacionS.setText(Integer.toString(L_presentacion));
        
        
        JLabel s_ortografia = new JLabel();
        s_ortografia.setBounds(10, 20+(50*1), 150, 30);
        s_ortografia.setFont(font_t1);
        s_ortografia.setBackground(Color.cyan);
        s_ortografia.setText("Ortografia");
        
        JButton s_ortografia1 = new JButton();
        s_ortografia1.setBounds(165, 15+(50*1), 40, 40);
        s_ortografia1.setFont(font_b1);
        s_ortografia1.setText("1");
        
        JButton s_ortografia2 = new JButton();
        s_ortografia2.setBounds(165+(50*1), 15+(50*1), 40, 40);
        s_ortografia2.setFont(font_b1);
        s_ortografia2.setText("2");
        
        JButton s_ortografia3 = new JButton();
        s_ortografia3.setBounds(165+(50*2), 15+(50*1), 40, 40);
        s_ortografia3.setFont(font_b1);
        s_ortografia3.setText("3");
        
        JButton s_ortografia4 = new JButton();
        s_ortografia4.setBounds(165+(50*3), 15+(50*1), 40, 40);
        s_ortografia4.setFont(font_b1);
        s_ortografia4.setText("4");
        
        JButton s_ortografia5 = new JButton();
        s_ortografia5.setBounds(165+(50*4), 15+(50*1), 40, 40);
        s_ortografia5.setFont(font_b1);
        s_ortografia5.setText("5");
        
        JButton s_ortografia6 = new JButton();
        s_ortografia6.setBounds(165+(50*5), 15+(50*1), 40, 40);
        s_ortografia6.setFont(font_b1);
        s_ortografia6.setText("6");
        
        JButton s_ortografia7 = new JButton();
        s_ortografia7.setBounds(165+(50*6), 15+(50*1), 40, 40);
        s_ortografia7.setFont(font_b1);
        s_ortografia7.setText("7");
        
        JButton s_ortografia8 = new JButton();
        s_ortografia8.setBounds(165+(50*7), 15+(50*1), 40, 40);
        s_ortografia8.setFont(font_b1);
        s_ortografia8.setText("8");
        
        JButton s_ortografia9 = new JButton();
        s_ortografia9.setBounds(165+(50*8), 15+(50*1), 40, 40);
        s_ortografia9.setFont(font_b1);
        s_ortografia9.setText("9");
        
        JButton s_ortografia10 = new JButton();
        s_ortografia10.setBounds(165+(50*9), 15+(50*1), 50, 40);
        s_ortografia10.setFont(font_b1);
        s_ortografia10.setText("10");
        
        JLabel s_ortografiaS = new JLabel();
        s_ortografiaS.setBounds(700, 20+(50*1), 40, 30);
        s_ortografiaS.setFont(font_t1);
        s_ortografiaS.setBackground(Color.cyan);
        s_ortografiaS.setText(Integer.toString(M_calculo));
        
        
        JLabel s_contenido = new JLabel();
        s_contenido.setBounds(10, 20+(50*4), 120, 30);
        s_contenido.setFont(font_t1);
        s_contenido.setBackground(Color.cyan);
        s_contenido.setText("Contenido");
        
        JLabel s_contenid_total = new JLabel();
        s_contenid_total.setBounds(150, 20+(50*4), 120, 30);
        s_contenid_total.setFont(font_t1);
        s_contenid_total.setBackground(Color.cyan);
        s_contenid_total.setText("Total:");
        
        JTextArea s_contenido_total = new JTextArea();
        s_contenido_total.setBounds(220, 20+(50*4), 30, 30);
        s_contenido_total.setFont(font_t1);
        s_contenido_total.setBackground(Color.lightGray);
        s_contenido_total.setText("");
        
        JLabel s_contenid_bien = new JLabel();
        s_contenid_bien.setBounds(280, 20+(50*4), 120, 30);
        s_contenid_bien.setFont(font_t1);
        s_contenid_bien.setBackground(Color.cyan);
        s_contenid_bien.setText("Bien:");
        
        JTextArea s_contenido_bien = new JTextArea();
        s_contenido_bien.setBounds(340, 20+(50*4), 30, 30);
        s_contenido_bien.setFont(font_t1);
        s_contenido_bien.setBackground(Color.lightGray);
        s_contenido_bien.setText("");
        
        JLabel s_contenid_regular = new JLabel();
        s_contenid_regular.setBounds(400, 20+(50*4), 120, 30);
        s_contenid_regular.setFont(font_t1);
        s_contenid_regular.setBackground(Color.cyan);
        s_contenid_regular.setText("Regular:");
        
        JTextArea s_contenido_regular = new JTextArea();
        s_contenido_regular.setBounds(500, 20+(50*4), 30, 30);
        s_contenido_regular.setFont(font_t1);
        s_contenido_regular.setBackground(Color.lightGray);
        s_contenido_regular.setText("");
        
        JButton s_reset = new JButton();
        s_reset.setBounds(580, 360, 160, 50);
        s_reset.setFont(font_b2);
        s_reset.setText("Reiniciar");
        
        JButton s_calcular = new JButton();
        s_calcular.setBounds(50, 360, 150, 50);
        s_calcular.setFont(font_b2);
        s_calcular.setText("Calcular");
        
        JLabel s_total = new JLabel();
        s_total.setBounds(240, 360, 150, 40);
        s_total.setFont(font_t2);
        s_total.setBackground(Color.cyan);
        s_total.setText("0");
        
        
        
        resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
        resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
        
        dk4.add(s_presentacion);
        dk4.add(s_presentacion1);
        dk4.add(s_presentacion2);
        dk4.add(s_presentacion3);
        dk4.add(s_presentacion4);
        dk4.add(s_presentacion5);
        dk4.add(s_presentacion6);
        dk4.add(s_presentacion7);
        dk4.add(s_presentacion8);
        dk4.add(s_presentacion9);
        dk4.add(s_presentacion10);
        dk4.add(s_presentacionS);
        dk4.add(s_ortografia);
        dk4.add(s_ortografia1);
        dk4.add(s_ortografia2);
        dk4.add(s_ortografia3);
        dk4.add(s_ortografia4);
        dk4.add(s_ortografia5);
        dk4.add(s_ortografia6);
        dk4.add(s_ortografia7);
        dk4.add(s_ortografia8);
        dk4.add(s_ortografia9);
        dk4.add(s_ortografia10);
        dk4.add(s_ortografiaS);
        dk4.add(s_contenido);
        dk4.add(s_contenid_total);
        dk4.add(s_contenid_regular);
        dk4.add(s_contenid_bien);
        dk4.add(s_contenido_total);
        dk4.add(s_contenido_regular);
        dk4.add(s_contenido_bien);
        dk4.add(s_calcular);
        dk4.add(s_reset);
        dk4.add(s_total);
        
        //Añadir paneles a las pestañas
        pestañas.add("Lengua",dk1);
        pestañas.add("Matematicas",dk2);
        pestañas.add("Naturales",dk3);
        pestañas.add("Sociales",dk4);
        
        marco.getContentPane().add(pestañas);
        
        marco.setVisible(true);
        
        //Scripts
        STest script = new STest();
        
        //Eventos
        
        l_presentacion1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(1);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion1.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(2);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion2.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(3);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion3.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(4);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion4.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(5);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion5.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(6);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion6.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(7);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion7.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(8);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion8.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(9);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion9.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        l_presentacion10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_presentacion(10);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            l_presentacion10.setBackground(bootonf);
            l_presentacionS.setText(Integer.toString(L_presentacion));
          }
        });
        
        l_ortografia1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(1);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia1.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(2);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia2.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(3);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia3.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(4);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia4.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(5);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia5.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(6);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia6.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(7);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia7.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(8);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia8.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(9);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia9.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        l_ortografia10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_ortografia(10);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            l_ortografia10.setBackground(bootonf);
            l_ortografiaS.setText(Integer.toString(L_ortografia));
          }
        });
        
        l_vocabulario1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(1);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario1.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(2);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario2.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(3);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario3.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(4);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario4.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(5);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario5.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(6);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario6.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(7);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario7.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(8);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario8.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(9);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario9.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        l_vocabulario10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_vocabulario(10);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            l_vocabulario10.setBackground(bootonf);
            l_vocabularioS.setText(Integer.toString(L_vocabulario));
          }
        });
        
        l_caligrafia1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(1);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia1.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(2);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia2.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(3);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia3.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(4);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia4.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(5);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia5.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(6);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia6.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(7);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia7.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(8);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia8.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(9);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia9.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        l_caligrafia10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setL_caligrafia(10);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
            l_caligrafia10.setBackground(bootonf);
            l_caligrafiaS.setText(Integer.toString(L_caligrafia));
          }
        });
        
        l_calcular.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
              if(L_presentacion != 0){
                  if(L_ortografia != 0){
                      if(L_vocabulario != 0){
                          if(L_caligrafia != 0){
                            if(l_contenido_total.getText().length() >= 1){
                                if (l_contenido_bien.getText().length() >= 1) {
                                    if (l_contenido_regular.getText().length() >= 1) {
                                        if (Integer.valueOf(l_contenido_total.getText()) >= Integer.valueOf(l_contenido_bien.getText()) + Integer.valueOf(l_contenido_regular.getText())) {
                                              l_total.setText(STest.lengua(L_presentacion, L_ortografia, L_vocabulario, L_caligrafia, Double.valueOf(l_contenido_total.getText()), Double.valueOf(l_contenido_bien.getText()), Double.valueOf(l_contenido_regular.getText()),valores));
                                        } else {
                                            JOptionPane.showMessageDialog(marco, "Hay más respuestas que preguntas.");
                                        }
                                    } else {
                                        JOptionPane.showMessageDialog(marco, "El campo de preguntas regular esta vacio.");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(marco, "El campo de preguntas bien esta vacio.");
                                }
                            }else{
                                JOptionPane.showMessageDialog(marco, "El campo de preguntas totales esta vacio.");
                            }
                        }else{
                            JOptionPane.showMessageDialog(marco, "El campo de caligrafia esta vacio.");
                        }
                    }else{
                      JOptionPane.showMessageDialog(marco, "El campo de vocabulario esta vacio.");
                    }
                  }else{
                      JOptionPane.showMessageDialog(marco, "El campo de ortografia esta vacio.");
                  }
              }else{
                  JOptionPane.showMessageDialog(marco, "El campo de presentacion esta vacio.");
              }
            
          }
        });
        l_reset.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            l_reset(l_presentacionS,l_ortografiaS,l_vocabularioS,l_caligrafiaS,l_total,l_contenido_total,l_contenido_bien,l_contenido_regular);
            resetButtonColor(l_presentacion1,l_presentacion2,l_presentacion3,l_presentacion4,l_presentacion5,l_presentacion6,l_presentacion7,l_presentacion8,l_presentacion9,l_presentacion10);
            resetButtonColor(l_ortografia1,l_ortografia2,l_ortografia3,l_ortografia4,l_ortografia5,l_ortografia6,l_ortografia7,l_ortografia8,l_ortografia9,l_ortografia10);
            resetButtonColor(l_vocabulario1,l_vocabulario2,l_vocabulario3,l_vocabulario4,l_vocabulario5,l_vocabulario6,l_vocabulario7,l_vocabulario8,l_vocabulario9,l_vocabulario10);
            resetButtonColor(l_caligrafia1,l_caligrafia2,l_caligrafia3,l_caligrafia4,l_caligrafia5,l_caligrafia6,l_caligrafia7,l_caligrafia8,l_caligrafia9,l_caligrafia10);
          }
        });
        
        
        m_presentacion1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(1);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion1.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(2);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion2.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(3);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion3.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(4);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion4.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(5);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion5.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(6);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion6.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(7);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion7.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(8);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion8.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(9);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion9.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        m_presentacion10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_presentacion(10);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            m_presentacion10.setBackground(bootonf);
            m_presentacionS.setText(Integer.toString(M_presentacion));
          }
        });
        
        m_problemas1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(1);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas1.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(2);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas2.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(3);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas3.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(4);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas4.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(5);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas5.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(6);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas6.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(7);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas7.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(8);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas8.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(9);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas9.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        m_problemas10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_problemas(10);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
            m_problemas10.setBackground(bootonf);
            m_problemasS.setText(Integer.toString(M_problemas));
          }
        });
        
        m_calculo1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(1);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo1.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(2);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo2.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(3);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo3.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(4);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo4.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(5);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo5.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(6);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo6.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(7);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo7.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(8);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo8.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(9);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo9.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        m_calculo10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setM_calculo(10);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            m_calculo10.setBackground(bootonf);
            m_calculoS.setText(Integer.toString(M_calculo));
          }
        });
        
        m_calcular.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
              if(M_presentacion != 0){
                  if(M_problemas != 0){
                      if(M_calculo != 0){
                        if(m_contenido_total.getText().length() >= 1){
                            if (m_contenido_bien.getText().length() >= 1) {
                                if (m_contenido_regular.getText().length() >= 1) {
                                    if (Integer.valueOf(m_contenido_total.getText()) >= Integer.valueOf(m_contenido_bien.getText()) + Integer.valueOf(m_contenido_regular.getText())) {
                                          m_total.setText(STest.matematicas(M_calculo, M_problemas, M_presentacion, Double.valueOf(m_contenido_total.getText()), Double.valueOf(m_contenido_bien.getText()), Double.valueOf(m_contenido_regular.getText()),valores));
                                    } else {
                                        JOptionPane.showMessageDialog(marco, "Hay más respuestas que preguntas.");
                                    }
                                } else {
                                    JOptionPane.showMessageDialog(marco, "El campo de preguntas regular esta vacio.");
                                }
                            } else {
                                JOptionPane.showMessageDialog(marco, "El campo de preguntas bien esta vacio.");
                            }
                        }else{
                            JOptionPane.showMessageDialog(marco, "El campo de preguntas totales esta vacio.");
                        }
                    }else{
                      JOptionPane.showMessageDialog(marco, "El campo de calculo esta vacio.");
                    }
                  }else{
                      JOptionPane.showMessageDialog(marco, "El campo de problemas esta vacio.");
                  }
              }else{
                  JOptionPane.showMessageDialog(marco, "El campo de presentacion esta vacio.");
              }
            
          }
        });
        m_reset.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            m_reset(m_presentacionS,m_calculoS,m_problemasS,m_total,m_contenido_total,m_contenido_bien,m_contenido_regular);
            resetButtonColor(m_presentacion1,m_presentacion2,m_presentacion3,m_presentacion4,m_presentacion5,m_presentacion6,m_presentacion7,m_presentacion8,m_presentacion9,m_presentacion10);
            resetButtonColor(m_calculo1,m_calculo2,m_calculo3,m_calculo4,m_calculo5,m_calculo6,m_calculo7,m_calculo8,m_calculo9,m_calculo10);
            resetButtonColor(m_problemas1,m_problemas2,m_problemas3,m_problemas4,m_problemas5,m_problemas6,m_problemas7,m_problemas8,m_problemas9,m_problemas10);
          }
        });
        
        
        n_presentacion1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(1);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion1.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(2);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion2.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(3);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion3.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(4);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion4.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(5);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion5.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(6);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion6.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(7);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion7.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(8);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion8.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(9);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion9.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        n_presentacion10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_presentacion(10);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            n_presentacion10.setBackground(bootonf);
            n_presentacionS.setText(Integer.toString(N_presentacion));
          }
        });
        
        n_ortografia1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(1);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia1.setBackground(bootonf);
           n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(2);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia2.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(3);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia3.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(4);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia4.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(5);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia5.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(6);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia6.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(7);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia7.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(8);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia8.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(9);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia9.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        n_ortografia10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setN_ortografia(10);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
            n_ortografia10.setBackground(bootonf);
            n_ortografiaS.setText(Integer.toString(N_ortografia));
          }
        });
        
        n_calcular.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
              if(N_presentacion != 0){
                  if(N_ortografia != 0){
                      if(n_contenido_total.getText().length() >= 1){
                          if (n_contenido_bien.getText().length() >= 1) {
                              if (n_contenido_regular.getText().length() >= 1) {
                                  if (Integer.valueOf(n_contenido_total.getText()) >= Integer.valueOf(n_contenido_bien.getText()) + Integer.valueOf(n_contenido_regular.getText())) {
                                        n_total.setText(STest.naturales(N_presentacion, N_ortografia, Double.valueOf(n_contenido_total.getText()), Double.valueOf(n_contenido_bien.getText()), Double.valueOf(n_contenido_regular.getText()),valores));
                                  } else {
                                      JOptionPane.showMessageDialog(marco, "Hay más respuestas que preguntas.");
                                  }
                              } else {
                                  JOptionPane.showMessageDialog(marco, "El campo de preguntas regular esta vacio.");
                              }
                          } else {
                              JOptionPane.showMessageDialog(marco, "El campo de preguntas bien esta vacio.");
                          }
                      }else{
                          JOptionPane.showMessageDialog(marco, "El campo de preguntas totales esta vacio.");
                      }
                  }else{
                      JOptionPane.showMessageDialog(marco, "El campo de ortografia esta vacio.");
                  }
              }else{
                  JOptionPane.showMessageDialog(marco, "El campo de presentacion esta vacio.");
              }
            
          }
        });
        n_reset.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            n_reset(n_presentacionS,n_ortografiaS,n_total,n_contenido_total,n_contenido_bien,n_contenido_regular);
            resetButtonColor(n_presentacion1,n_presentacion2,n_presentacion3,n_presentacion4,n_presentacion5,n_presentacion6,n_presentacion7,n_presentacion8,n_presentacion9,n_presentacion10);
            resetButtonColor(n_ortografia1,n_ortografia2,n_ortografia3,n_ortografia4,n_ortografia5,n_ortografia6,n_ortografia7,n_ortografia8,n_ortografia9,n_ortografia10);
          }
        });
        
        
        s_presentacion1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(1);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion1.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(2);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion2.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(3);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion3.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(4);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion4.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(5);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion5.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(6);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion6.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(7);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion7.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(8);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion8.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(9);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion9.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        s_presentacion10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_presentacion(10);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            s_presentacion10.setBackground(bootonf);
            s_presentacionS.setText(Integer.toString(S_presentacion));
          }
        });
        
        s_ortografia1.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(1);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia1.setBackground(bootonf);
           s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia2.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(2);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia2.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia3.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(3);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia3.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia4.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(4);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia4.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia5.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(5);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia5.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia6.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(6);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia6.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia7.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(7);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia7.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia8.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(8);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia8.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia9.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(9);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia9.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        s_ortografia10.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            setS_ortografia(10);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
            s_ortografia10.setBackground(bootonf);
            s_ortografiaS.setText(Integer.toString(S_ortografia));
          }
        });
        
        s_calcular.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
              if(S_presentacion != 0){
                  if(S_ortografia != 0){
                      if(s_contenido_total.getText().length() >= 1){
                          if (s_contenido_bien.getText().length() >= 1) {
                              if (s_contenido_regular.getText().length() >= 1) {
                                  if (Integer.valueOf(s_contenido_total.getText()) >= Integer.valueOf(s_contenido_bien.getText()) + Integer.valueOf(s_contenido_regular.getText())) {
                                      s_total.setText(STest.naturales(S_presentacion, S_ortografia, Double.valueOf(s_contenido_total.getText()), Double.valueOf(s_contenido_bien.getText()), Double.valueOf(s_contenido_regular.getText()),valores));
                                  } else {
                                      JOptionPane.showMessageDialog(marco, "Hay más respuestas que preguntas.");
                                  }
                              } else {
                                  JOptionPane.showMessageDialog(marco, "El campo de preguntas regular esta vacio.");
                              }
                          } else {
                              JOptionPane.showMessageDialog(marco, "El campo de preguntas bien esta vacio.");
                          }
                      }else{
                          JOptionPane.showMessageDialog(marco, "El campo de preguntas totales esta vacio.");
                      }
                  }else{
                      JOptionPane.showMessageDialog(marco, "El campo de ortografia esta vacio.");
                  }
              }else{
                  JOptionPane.showMessageDialog(marco, "El campo de presentacion esta vacio.");
              }
          }
        });
        s_reset.addActionListener(new ActionListener(){
          public void actionPerformed(ActionEvent e) {
            s_reset(s_presentacionS,s_ortografiaS,s_total,s_contenido_total,s_contenido_bien,s_contenido_regular);
            resetButtonColor(s_presentacion1,s_presentacion2,s_presentacion3,s_presentacion4,s_presentacion5,s_presentacion6,s_presentacion7,s_presentacion8,s_presentacion9,s_presentacion10);
            resetButtonColor(s_ortografia1,s_ortografia2,s_ortografia3,s_ortografia4,s_ortografia5,s_ortografia6,s_ortografia7,s_ortografia8,s_ortografia9,s_ortografia10);
          }
        });
     
    }
    
    private void setL_presentacion(int valor){
        L_presentacion = valor;
    }
    private void setL_ortografia(int valor){
        L_ortografia = valor;
    }
    private void setL_vocabulario(int valor){
        L_vocabulario = valor; 
    }
    private void setL_caligrafia(int valor){
        L_caligrafia = valor; 
    }
    private void setM_presentacion(int valor){
        M_presentacion = valor;
    }
    private void setM_problemas(int valor){
        M_problemas = valor;
    }
    private void setM_calculo(int valor){
        M_calculo = valor;
    }
    private void setN_presentacion(int valor){
        N_presentacion = valor;
    }
    private void setN_ortografia(int valor){
        N_ortografia = valor;
    }
    private void setS_presentacion(int valor){
        S_presentacion = valor;
    }
    private void setS_ortografia(int valor){
        S_ortografia = valor;
    }
    private void l_reset(JLabel l1,JLabel l2,JLabel l3,JLabel l4,JLabel lr,JTextArea lct,JTextArea lcb,JTextArea lcr){
        L_caligrafia=0;
        L_ortografia=0;
        L_presentacion=0;
        L_vocabulario=0;
        l1.setText("0");
        l2.setText("0");
        l3.setText("0");
        l4.setText("0");
        lr.setText("0");
        lct.setText("");
        lcb.setText("");
        lcr.setText("");
        
    }
    private void m_reset(JLabel m1,JLabel m2,JLabel m3,JLabel mr,JTextArea mct,JTextArea mcb,JTextArea mcr){
        M_calculo=0;
        M_presentacion=0;
        M_problemas=0;
        m1.setText("0");
        m2.setText("0");
        m3.setText("0");
        mr.setText("0");
        mct.setText("");
        mcb.setText("");
        mcr.setText("");
    }
    private void n_reset(JLabel n1,JLabel n2,JLabel nr,JTextArea nct,JTextArea ncb,JTextArea ncr){
        N_ortografia=0;
        N_presentacion=0;
        n1.setText("0");
        n2.setText("0");
        nr.setText("0");
        nct.setText("");
        ncb.setText("");
        ncr.setText("");
    }
    private void s_reset(JLabel s1,JLabel s2,JLabel sr,JTextArea sct,JTextArea scb,JTextArea scr){
        S_ortografia=0;
        S_presentacion=0;
        s1.setText("0");
        s2.setText("0");
        sr.setText("0");
        sct.setText("");
        scb.setText("");
        scr.setText("");
    }
    
    private void resetButtonColor(JButton b1, JButton b2, JButton b3, JButton b4, JButton b5, JButton b6, JButton b7, JButton b8, JButton b9, JButton b10){
        b1.setBackground(bootonF);
        b2.setBackground(bootonF);
        b3.setBackground(bootonF);
        b4.setBackground(bootonF);
        b5.setBackground(bootonF);
        b6.setBackground(bootonF);
        b7.setBackground(bootonF);
        b8.setBackground(bootonF);
        b9.setBackground(bootonF);
        b10.setBackground(bootonF);
    }
    
    
}
