//Analu Sorbara
package lista9;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

public class Interface {

    private final Integracao interg;
    private JTextField tf23;
    private JTextField tf24;
    private JTextField tf25;
    private JTextField tf27;
    private JTextField tf28;
    private JTextField tf29;
    private JTextField tf30;
    private JTextField tf31;
    private JTextField tf33;
    private JTextField tf34;
    private JTextField tf35;
    private JTextField tf36;
    private JTextField tf37;
    private JTextField tf38;
    private JTextField tf39;
    private JTextField tf40;
    private JTextField tf41;
    private JTextField tf42;
    private JTable jt;
    private JTable jt2;

    public Interface() {

        this.interg = new Integracao(this);
    }

    public void gestaoDeVeiculos(){
        JFrame f=new JFrame("Gestão de Veículos");//creating instance of JFrame

        JButton b1=new JButton("Passeio");//creating instance of JButton
        b1.setBounds(10,25,100, 20);//x axis, y axis, width, height
        b1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.clickAbrirPasseio();
            }
        });
        JButton b2=new JButton("Carga");//creating instance of JButton
        b2.setBounds(10,50,100, 20);//x axis, y axis, width, height
        b2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                interg.clickAbrirCarga();
            }
        });

        f.add(b1);//adding button in JFrame
        f.add(b2);//adding button in JFrame

        f.setSize(250,150);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }

    public void veiculoDePasseio(){
        JFrame f=new JFrame("Veículos de Passeio");//creating instance of JFrame

        JButton b3=new JButton("Cadastrar");//creating instance of JButton
        b3.setBounds(10,25,100, 20);//x axis, y axis, width, height
        b3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {

                interg.clickCadastraPasseio();
            }
        });
        JButton b4=new JButton("Consultar/Excluir pela placa");//creating instance of JButton
        b4.setBounds(10,50,200, 20);//x axis, y axis, width, height
        b4.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.clickConsultaExcluiPasseio();
            }
        });
        JButton b5=new JButton("Imprimir/Excluir todos");//creating instance of JButton
        b5.setBounds(10,75,200, 20);//x axis, y axis, width, height
        b5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.clickImprimePasseio();
            }
        });
        JButton b6=new JButton("Sair");//creating instance of JButton
        b6.setBounds(10,100,100, 20);//x axis, y axis, width, height
        b6.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });

        f.add(b3);//adding button in JFrame
        f.add(b4);//adding button in JFrame
        f.add(b5);//adding button in JFrame
        f.add(b6);//adding button in JFrame


        f.setSize(350,250);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }

    public void veiculoDeCarga(){
        JFrame f=new JFrame("Veículos de Carga");//creating instance of JFrame

        JButton b7=new JButton("Cadastrar");//creating instance of JButton
        b7.setBounds(10,25,100, 20);//x axis, y axis, width, height
        b7.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.clickCadastraCarga();
            }
        });
        JButton b8=new JButton("Consultar/Excluir pela placa");//creating instance of JButton
        b8.setBounds(10,50,200, 20);//x axis, y axis, width, height
        b8.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.clickConsultaExcluiCarga();
            }
        });
        JButton b9=new JButton("Imprimir/Excluir todos");//creating instance of JButton
        b9.setBounds(10,75,200, 20);//x axis, y axis, width, height
        b9.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.clickImprimeCarga();

            }
        });
        JButton b10=new JButton("Sair");//creating instance of JButton
        b10.setBounds(10,100,100, 20);//x axis, y axis, width, height
        b10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });

        f.add(b7);//adding button in JFrame
        f.add(b8);//adding button in JFrame
        f.add(b9);//adding button in JFrame
        f.add(b10);//adding button in JFrame


        f.setSize(350,250);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }

    public void cadastroDePasseio(){
        JFrame f=new JFrame("Cadastro de Passeio");//creating instance of JFrame

        JLabel l1=new JLabel("Qtd. passageiros:");
        l1.setBounds(20,10, 100,30);
        JLabel l2=new JLabel("Placa:");
        l2.setBounds(20,30, 100,30);
        JLabel l3=new JLabel("Marca:");
        l3.setBounds(20,50, 100,30);
        JLabel l4=new JLabel("Modelo:");
        l4.setBounds(20,70, 100,30);
        JLabel l5=new JLabel("Cor:");
        l5.setBounds(20,90, 100,30);
        JLabel l6=new JLabel("Qtd. rodas:");
        l6.setBounds(20,110, 100,30);
        JLabel l7=new JLabel("Velocidade max.:");
        l7.setBounds(20,130, 100,30);
        JLabel l8=new JLabel("Qtd. pistões:");
        l8.setBounds(20,150, 100,30);
        JLabel l9=new JLabel("Potencia:");
        l9.setBounds(20,170, 100,30);

        f.add(l1);
        f.add(l2);
        f.add(l3);
        f.add(l4);
        f.add(l5);
        f.add(l6);
        f.add(l7);
        f.add(l8);
        f.add(l9);

        JTextField tf1=new JTextField();
        tf1.setBounds(130,15, 150,18);
        JTextField tf2=new JTextField();
        tf2.setBounds(70,35, 150,18);
        JTextField tf3=new JTextField();
        tf3.setBounds(70,55, 150,18);
        JTextField tf4=new JTextField();
        tf4.setBounds(70,75, 150,18);
        JTextField tf5=new JTextField();
        tf5.setBounds(70,95, 150,18);
        JTextField tf6=new JTextField();
        tf6.setBounds(90,115, 150,18);
        JTextField tf7=new JTextField();
        tf7.setBounds(120,135, 150,18);
        JTextField tf8=new JTextField();
        tf8.setBounds(100,155, 150,18);
        JTextField tf9=new JTextField();
        tf9.setBounds(80,175, 150,18);


        f.add(tf1);
        f.add(tf2);
        f.add(tf3);
        f.add(tf4);
        f.add(tf5);
        f.add(tf6);
        f.add(tf7);
        f.add(tf8);
        f.add(tf9);


        JButton b11=new JButton("Cadastrar");//creating instance of JButton
        b11.setBounds(10,250,100, 20);//x axis, y axis, width, height
        b11.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.cadastrarPasseio(tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());
            }
        });
        JButton b12=new JButton("Limpar");//creating instance of JButton
        b12.setBounds(120,250,100, 20);//x axis, y axis, width, height
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf1.setText(null);
                tf2.setText(null);
                tf3.setText(null);
                tf4.setText(null);
                tf5.setText(null);
                tf6.setText(null);
                tf7.setText(null);
                tf8.setText(null);
                tf9.setText(null);

            }
        });
        JButton b13=new JButton("Novo");//creating instance of JButton
        b13.setBounds(230,250,100, 20);//x axis, y axis, width, height
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.cadastrarPasseio(tf1.getText(),tf2.getText(),tf3.getText(),tf4.getText(), tf5.getText(), tf6.getText(), tf7.getText(), tf8.getText(), tf9.getText());

                tf1.setText(null);
                tf2.setText(null);
                tf3.setText(null);
                tf4.setText(null);
                tf5.setText(null);
                tf6.setText(null);
                tf7.setText(null);
                tf8.setText(null);
                tf9.setText(null);
            }

        });
        JButton b14=new JButton("Sair");//creating instance of JButton
        b14.setBounds(340,250,100, 20);//x axis, y axis, width, height
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });

        f.add(b11);//adding button in JFrame
        f.add(b12);//adding button in JFrame
        f.add(b13);//adding button in JFrame
        f.add(b14);//adding button in JFrame


        f.setSize(600,400);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }

    public void cadastroDeCarga(){
        JFrame f=new JFrame("Cadastro de Carga");//creating instance of JFrame

        JLabel l10=new JLabel("Tara:");
        l10.setBounds(20,10, 100,30);
        JLabel l11=new JLabel("Carga max.:");
        l11.setBounds(20,30, 100,30);
        JLabel l12=new JLabel("Placa:");
        l12.setBounds(20,50, 100,30);
        JLabel l13=new JLabel("Marca:");
        l13.setBounds(20,70, 100,30);
        JLabel l14=new JLabel("Modelo:");
        l14.setBounds(20,90, 100,30);
        JLabel l15=new JLabel("Cor:");
        l15.setBounds(20,110, 100,30);
        JLabel l16=new JLabel("Qtd. rodas:");
        l16.setBounds(20,130, 100,30);
        JLabel l17=new JLabel("Velocidade max:");
        l17.setBounds(20,150, 100,30);
        JLabel l18=new JLabel("Qtd. pistões:");
        l18.setBounds(20,170, 100,30);
        JLabel l19=new JLabel("Potencia:");
        l19.setBounds(20,190, 100,30);

        f.add(l10);
        f.add(l11);
        f.add(l12);
        f.add(l13);
        f.add(l14);
        f.add(l15);
        f.add(l16);
        f.add(l17);
        f.add(l18);
        f.add(l19);

        JTextField tf11=new JTextField();
        tf11.setBounds(60,15, 150,18);
        JTextField tf12=new JTextField();
        tf12.setBounds(100,35, 150,18);
        JTextField tf13=new JTextField();
        tf13.setBounds(70,55, 150,18);
        JTextField tf14=new JTextField();
        tf14.setBounds(70,75, 150,18);
        JTextField tf15=new JTextField();
        tf15.setBounds(70,95, 150,18);
        JTextField tf16=new JTextField();
        tf16.setBounds(70,115, 150,18);
        JTextField tf17=new JTextField();
        tf17.setBounds(90,135, 150,18);
        JTextField tf18=new JTextField();
        tf18.setBounds(130,155, 150,18);
        JTextField tf19=new JTextField();
        tf19.setBounds(120,175, 150,18);
        JTextField tf20=new JTextField();
        tf20.setBounds(100,195, 150,18);
        

        f.add(tf11);
        f.add(tf12);
        f.add(tf13);
        f.add(tf14);
        f.add(tf15);
        f.add(tf16);
        f.add(tf17);
        f.add(tf18);
        f.add(tf19);
        f.add(tf20);
        

        JButton b12=new JButton("Cadastrar");//creating instance of JButton
        b12.setBounds(10,250,100, 20);//x axis, y axis, width, height
        b12.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.cadastrarCarga(tf11.getText(),tf12.getText(),tf13.getText(),tf14.getText(), tf15.getText(), tf16.getText(), tf17.getText(), tf18.getText(), tf19.getText(),tf20.getText());
            }
        });
        JButton b13=new JButton("Limpar");//creating instance of JButton
        b13.setBounds(120,250,100, 20);//x axis, y axis, width, height
        b13.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tf11.setText(null);
                tf12.setText(null);
                tf13.setText(null);
                tf14.setText(null);
                tf15.setText(null);
                tf16.setText(null);
                tf17.setText(null);
                tf18.setText(null);
                tf19.setText(null);
                tf20.setText(null);

            }
        });
        JButton b14=new JButton("Novo");//creating instance of JButton
        b14.setBounds(230,250,100, 20);//x axis, y axis, width, height
        b14.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.cadastrarCarga(tf11.getText(),tf12.getText(),tf13.getText(),tf14.getText(), tf15.getText(), tf16.getText(), tf17.getText(), tf18.getText(), tf19.getText(),tf20.getText());

                tf11.setText(null);
                tf12.setText(null);
                tf13.setText(null);
                tf14.setText(null);
                tf15.setText(null);
                tf16.setText(null);
                tf17.setText(null);
                tf18.setText(null);
                tf19.setText(null);
                tf20.setText(null);
            }
        });        
        JButton b15=new JButton("Sair");//creating instance of JButton
        b15.setBounds(340,250,100, 20);//x axis, y axis, width, height
        b15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });

        f.add(b12);//adding button in JFrame
        f.add(b13);//adding button in JFrame
        f.add(b14);//adding button in JFrame
        f.add(b15);//adding button in JFrame


        f.setSize(600,400);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }

    public void consultaExcluiPasseio(){
        JFrame f=new JFrame("Consultar/Excluir pela placa Passeio");//creating instance of JFrame

        JLabel l20=new JLabel("Informe a placa:");
        l20.setBounds(20,10, 100,30);

        JLabel l21=new JLabel("Qtd. passageiros:");
        l21.setBounds(20,30, 100,30);
        JLabel l22=new JLabel("Marca:");
        l22.setBounds(20,50, 100,30);
        JLabel l23=new JLabel("Modelo:");
        l23.setBounds(20,70, 100,30);
        JLabel l24=new JLabel("Cor:");
        l24.setBounds(20,90, 100,30);
        JLabel l25=new JLabel("Qtd. rodas:");
        l25.setBounds(20,110, 100,30);
        JLabel l26=new JLabel("Velocidade max.:");
        l26.setBounds(20,130, 100,30);
        JLabel l27=new JLabel("Qtd. pistões:");
        l27.setBounds(20,150, 100,30);
        JLabel l28=new JLabel("Potencia:");
        l28.setBounds(20,170, 100,30);

        f.add(l20);
        f.add(l21);
        f.add(l22);
        f.add(l23);
        f.add(l24);
        f.add(l25);
        f.add(l26);
        f.add(l27);
        f.add(l28);

        JTextField tf22=new JTextField();
        tf22.setBounds(120,15, 150,18);
        tf23=new JTextField();
        tf23.setBounds(130,35, 150,18);
        tf23.setEnabled(false);
        tf24=new JTextField();
        tf24.setBounds(70,55, 150,18);
        tf24.setEnabled(false);
        tf25=new JTextField();
        tf25.setBounds(70,75, 150,18);
        tf25.setEnabled(false);
        tf27=new JTextField();
        tf27.setBounds(70,95, 150,18);
        tf27.setEnabled(false);
        tf28=new JTextField();
        tf28.setBounds(90,115, 150,18);
        tf28.setEnabled(false);
        tf29=new JTextField();
        tf29.setBounds(120,135, 150,18);
        tf29.setEnabled(false);
        tf30=new JTextField();
        tf30.setBounds(100,155, 150,18);
        tf30.setEnabled(false);
        tf31=new JTextField();
        tf31.setBounds(90,175, 150,18);
        tf31.setEnabled(false);

        f.add(tf22);
        f.add(tf23);
        f.add(tf24);
        f.add(tf25);
        f.add(tf27);
        f.add(tf28);
        f.add(tf29);
        f.add(tf30);
        f.add(tf31);

        JButton b16=new JButton("Consultar");//creating instance of JButton
        b16.setBounds(10,250,100, 20);//x axis, y axis, width, height
        b16.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.consultaPasseio(tf22.getText());
            }
        });
        JButton b17=new JButton("Excluir");//creating instance of JButton
        b17.setBounds(120,250,100, 20);//x axis, y axis, width, height
        b17.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.excluiPasseio(tf22.getText());
            }
        });
        JButton b18=new JButton("Sair");//creating instance of JButton
        b18.setBounds(230,250,100, 20);//x axis, y axis, width, height
        b18.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });

        f.add(b16);//adding button in JFrame
        f.add(b17);//adding button in JFrame
        f.add(b18);//adding button in JFrame

        f.setSize(600,400);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }

    public void consultaExcluiCarga(){
        JFrame f=new JFrame("Cadastrar/Excluir pela placa Carga");//creating instance of JFrame

        JLabel l29=new JLabel("Informe a Placa:");
        l29.setBounds(20,10, 100,30);

        JLabel l30 = new JLabel("Tara:");
        l30.setBounds(20,30, 100,30);
        JLabel l31=new JLabel("Carga max.:");
        l31.setBounds(20,50, 100,30);
        JLabel l32=new JLabel("Marca:");
        l32.setBounds(20,70, 100,30);
        JLabel l33=new JLabel("Modelo:");
        l33.setBounds(20,90, 100,30);
        JLabel l34=new JLabel("Cor:");
        l34.setBounds(20,110, 100,30);
        JLabel l35=new JLabel("Qtd. rodas:");
        l35.setBounds(20,130, 100,30);
        JLabel l36=new JLabel("Velocidade max:");
        l36.setBounds(20,150, 100,30);
        JLabel l37=new JLabel("Qtd. pistões:");
        l37.setBounds(20,170, 100,30);
        JLabel l38=new JLabel("Potencia:");
        l38.setBounds(20,190, 100,30);

        f.add(l29);
        f.add(l30);
        f.add(l31);
        f.add(l32);
        f.add(l33);
        f.add(l34);
        f.add(l35);
        f.add(l36);
        f.add(l37);
        f.add(l38);

        JTextField tf32=new JTextField();
        tf32.setBounds(130,15, 150,18);

        tf33=new JTextField();
        tf33.setBounds(60,35, 150,18);
        tf33.setEnabled(false);
        tf34=new JTextField();
        tf34.setBounds(100,55, 150,18);
        tf34.setEnabled(false);
        tf35=new JTextField();
        tf35.setBounds(70,75, 150,18);
        tf35.setEnabled(false);
        tf37=new JTextField();
        tf37.setBounds(70,95, 150,18);
        tf37.setEnabled(false);
        tf38=new JTextField();
        tf38.setBounds(70,115, 150,18);
        tf38.setEnabled(false);
        tf39=new JTextField();
        tf39.setBounds(110,135, 150,18);
        tf39.setEnabled(false);
        tf40=new JTextField();
        tf40.setBounds(120,155, 150,18);
        tf40.setEnabled(false);
        tf41=new JTextField();
        tf41.setBounds(100,175, 150,18);
        tf41.setEnabled(false);
        tf42=new JTextField();
        tf42.setBounds(80,195, 150,18);
        tf42.setEnabled(false);

        f.add(tf32);
        f.add(tf33);
        f.add(tf34);
        f.add(tf35);
        f.add(tf37);
        f.add(tf38);
        f.add(tf39);
        f.add(tf40);
        f.add(tf41);
        f.add(tf42);

        JButton b19=new JButton("Consultar");//creating instance of JButton
        b19.setBounds(10,250,100, 20);//x axis, y axis, width, height
        b19.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.consultaCarga(tf32.getText());
            }
        });
        JButton b20=new JButton("Excluir");//creating instance of JButton
        b20.setBounds(120,250,100, 20);//x axis, y axis, width, height
        b20.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.excluiCarga(tf32.getText());
            }
        });
        JButton b21=new JButton("Sair");//creating instance of JButton
        b21.setBounds(230,250,100, 20);//x axis, y axis, width, height
        b21.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });

        f.add(b19);//adding button in JFrame
        f.add(b20);//adding button in JFrame
        f.add(b21);//adding button in JFrame


        f.setSize(600,400);//400 width and 500 height
        f.setLayout(null);//using no layout managers
        f.setVisible(true);//making the frame visible

    }

    public void imprimiExcluiPasseio(){

        JFrame f=new JFrame();

        String column[]={"Placa","Marca","Modelo","Cor","Qtd. rodas","Velocidade max.","Qtd. pistoões","Potencia",
                "Qtd. Passageiro"};
        DefaultTableModel model = new DefaultTableModel(column, 0);

        jt=new JTable();
        jt.setModel(model);
        JScrollPane sp=new JScrollPane(jt);
        sp.setBounds(0,0,900, 450);
        f.add(sp);

        JButton b22=new JButton("Imprimir todos");//creating instance of JButton
        b22.setBounds(10,500,150, 20);//x axis, y axis, width, height
        b22.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.imprimirTodosPasseio();
            }
        });
        JButton b23=new JButton("Excluir todos");//creating instance of JButton
        b23.setBounds(170,500,150, 20);//x axis, y axis, width, height
        b23.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.excluirTodosPasseio();
            }
        });
        JButton b24=new JButton("Sair");//creating instance of JButton
        b24.setBounds(330,500,150, 20);//x axis, y axis, width, height
        b24.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });

        f.add(b22);//adding button in JFrame
        f.add(b23);//adding button in JFrame
        f.add(b24);//adding button in JFrame


        f.setLayout(null);

        f.setSize(1000,600);
        f.setVisible(true);
    }

    public void imprimiExcluiCarga(){

        JFrame f=new JFrame();

        String[] column ={"Placa","Marca","Modelo","Cor","Qtd. rodas","Velocidade max.","Qtd. pistões","Potencia",
                "Tara","Carga max."};
        DefaultTableModel model = new DefaultTableModel(column, 0);

        jt2=new JTable();
        jt2.setModel(model);
        JScrollPane cg=new JScrollPane(jt2);
        cg.setBounds(0,0,1000, 450);
        f.add(cg);

        JButton b25=new JButton("Imprimir todos");//creating instance of JButton
        b25.setBounds(10,500,150, 20);//x axis, y axis, width, height
        b25.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.imprimirTodosCarga();
            }
        });
        JButton b26=new JButton("Excluir todos");//creating instance of JButton
        b26.setBounds(170,500,150, 20);//x axis, y axis, width, height
        b26.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                interg.excluirTodosCarga();
            }
        });
        JButton b27=new JButton("Sair");//creating instance of JButton
        b27.setBounds(330,500,150, 20);//x axis, y axis, width, height
        b27.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                f.dispatchEvent(new WindowEvent(f,WindowEvent.WINDOW_CLOSING));
            }
        });

        f.add(b25);//adding button in JFrame
        f.add(b26);//adding button in JFrame
        f.add(b27);//adding button in JFrame


        f.setLayout(null);

        f.setSize(1200,600);
        f.setVisible(true);
    }

    public void setDadoPasseio(String qtdPassageiro, String marca, String modelo, String cor, String qtdRodas,
                               String velocMax, String qtdPistoes, String potencia){

        tf23.setText(qtdPassageiro);
        tf24.setText(marca);
        tf25.setText(modelo);
        tf27.setText(cor);
        tf28.setText(qtdRodas);
        tf29.setText(velocMax);
        tf30.setText(qtdPistoes);
        tf31.setText(potencia);
    }

    public void setDadoCarga(String tara, String cargaMax, String marca, String modelo, String cor,
                               String qtdRodas, String velocMax, String qtdPistoes, String potencia){

        tf33.setText(tara);
        tf34.setText(cargaMax);
        tf35.setText(marca);
        tf37.setText(modelo);
        tf38.setText(cor);
        tf39.setText(qtdRodas);
        tf40.setText(velocMax);
        tf41.setText(qtdPistoes);
        tf42.setText(potencia);
    }

    public void setTabelaPasseio(String[][] data){
        DefaultTableModel model = (DefaultTableModel) jt.getModel();
        model.setRowCount(0); // limpar tabela
        // adiciona itens
        for (String[] datum : data) {
            model.addRow(datum);
        }
    }

    public void setTabelaCarda(String[][] data){
        DefaultTableModel model = (DefaultTableModel) jt2.getModel();
        model.setRowCount(0); // limpar tabela
        // adiciona itens
        for (String[] datum : data) {
            model.addRow(datum);
        }
    }

    public void mostrarErro(String text){
        Toolkit.getDefaultToolkit().beep();
        JOptionPane optionPane = new JOptionPane(text,JOptionPane.ERROR_MESSAGE);
        JDialog dialog = optionPane.createDialog("Erro!");
        dialog.setAlwaysOnTop(true);
        dialog.setVisible(true);
    }
}
