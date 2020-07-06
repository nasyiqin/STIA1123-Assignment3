import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.*;

class MyFrame extends JFrame implements ActionListener {

    // Components of the Form
    private Container c;
    private JLabel title;
    private JLabel name;
    private JTextField tname;
    private JLabel no;
    private JTextField tno;
    private JLabel category;
    private JRadioButton face;
    private JRadioButton eye;
    private JRadioButton lip;
    private ButtonGroup gengp;
    private JLabel product;
    private JComboBox makeup;
    private JLabel price;
//    private JLabel add;
//    private JTextArea tadd;
    private JCheckBox term;
    private JButton sub;
    private JButton reset;
    private JButton adding;
    private JTextArea tout;
    private JLabel res;
    private JTextArea resadd;
    private JLabel search;
    private JTextField tsearch;
    private JButton searching;
    private JLabel worded;

    private String makeups[] = { "Select","Foundation", "Concealer", "Blusher",
            "Mascara", "Eyeshadow", "Lipstick", "Lip tint"};

    // constructor, to initialize the components
    // with default values.
    public MyFrame()
    {
        setTitle("Makeup");
        setBounds(300, 90, 900, 600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        c = getContentPane();
        c.setLayout(null);

        title = new JLabel("Makeup Form");
        title.setFont(new Font("Arial", Font.PLAIN, 30));
        title.setSize(300, 30);
        title.setLocation(300, 30);
        c.add(title);

        name = new JLabel("Customer Name");
        name.setFont(new Font("Arial", Font.PLAIN, 18));
        name.setSize(150, 20);
        name.setLocation(100, 100);
        c.add(name);

        tname = new JTextField();
        tname.setFont(new Font("Arial", Font.PLAIN, 15));
        tname.setSize(190, 20);
        tname.setLocation(260, 100);
        c.add(tname);

        no = new JLabel("Phone No");
        no.setFont(new Font("Arial", Font.PLAIN, 18));
        no.setSize(150, 25);
        no.setLocation(100, 150);
        c.add(no);

        tno = new JTextField();
        tno.setFont(new Font("Arial", Font.PLAIN, 15));
        tno.setSize(190, 20);
        tno.setLocation(260, 150);
        c.add(tno);

        category = new JLabel("Category");
        category.setFont(new Font("Arial", Font.PLAIN, 18));
        category.setSize(100, 25);
        category.setLocation(100, 200);
        c.add(category);

        face = new JRadioButton("Face");
        face.setFont(new Font("Arial", Font.PLAIN, 15));
        face.setSelected(true);
        face.setSize(75, 20);
        face.setLocation(200, 200);
        c.add(face);

        eye = new JRadioButton("Eye");
        eye.setFont(new Font("Arial", Font.PLAIN, 15));
        eye.setSelected(false);
        eye.setSize(80, 20);
        eye.setLocation(275, 200);
        c.add(eye);

        lip = new JRadioButton("Lip");
        lip.setFont(new Font("Arial", Font.PLAIN, 15));
        lip.setSelected(false);
        lip.setSize(85, 20);
        lip.setLocation(355, 200);
        c.add(lip);

        gengp = new ButtonGroup();
        gengp.add(face);
        gengp.add(eye);
        gengp.add(lip);

        product = new JLabel("Product");
        product.setFont(new Font("Arial", Font.PLAIN, 18));
        product.setSize(100, 20);
        product.setLocation(100, 250);
        c.add(product);

        makeup = new JComboBox(makeups);
        makeup.setFont(new Font("Arial", Font.PLAIN, 15));
        makeup.setSize(120, 25);
        makeup.setLocation(200, 250);
        c.add(makeup);

        price = new JLabel("");
        price.setFont(new Font("Arial", Font.PLAIN, 15));
        price.setSize(120, 25);
        price.setLocation(350, 250);
        c.add(price);

        search = new JLabel("Makeup ");
        search.setFont(new Font("Arial", Font.PLAIN, 18));
        search.setSize(100, 20);
        search.setLocation(100, 315);
        c.add(search);

        tsearch = new JTextField();
        tsearch.setFont(new Font("Arial", Font.PLAIN, 15));
        tsearch.setSize(190, 20);
        tsearch.setLocation(180, 315);
        c.add(tsearch);

        searching = new JButton("Search");
        searching.setFont(new Font("Arial", Font.PLAIN, 15));
        searching.setSize(90, 20);
        searching.setLocation(390, 315);
        searching.addActionListener(this);
        c.add(searching);

        worded = new JLabel("");
        worded.setFont(new Font("Arial", Font.PLAIN, 15));
        worded.setSize(120, 25);
        worded.setLocation(100, 400);
        c.add(worded);

//        add = new JLabel("Address");
//        add.setFont(new Font("Arial", Font.PLAIN, 18));
//        add.setSize(100, 20);
//        add.setLocation(100, 300);
//        c.add(add);

//        tadd = new JTextArea();
//        tadd.setFont(new Font("Arial", Font.PLAIN, 15));
//        tadd.setSize(200, 75);
//        tadd.setLocation(200, 300);
//        tadd.setLineWrap(true);
//        c.add(tadd);

        term = new JCheckBox("Confirmed order");
        term.setFont(new Font("Arial", Font.PLAIN, 15));
        term.setSize(250, 20);
        term.setLocation(200, 470);
        c.add(term);

        sub = new JButton("Submit");
        sub.setFont(new Font("Arial", Font.PLAIN, 15));
        sub.setSize(90, 20);
        sub.setLocation(110, 520);
        sub.addActionListener(this);
        c.add(sub);

        reset = new JButton("Delete");
        reset.setFont(new Font("Arial", Font.PLAIN, 15));
        reset.setSize(90, 20);
        reset.setLocation(220, 520);
        reset.addActionListener(this);
        c.add(reset);

        adding = new JButton("Add");
        adding.setFont(new Font("Arial", Font.PLAIN, 15));
        adding.setSize(90, 20);
        adding.setLocation(350, 520);
        adding.addActionListener(this);
        c.add(adding);

        tout = new JTextArea();
        tout.setFont(new Font("Arial", Font.PLAIN, 15));
        tout.setSize(300, 400);
        tout.setLocation(500, 100);
        tout.setLineWrap(true);
        tout.setEditable(false);
        c.add(tout);

        res = new JLabel("");
        res.setFont(new Font("Arial", Font.PLAIN, 16));
        res.setSize(500, 25);
        res.setLocation(170, 490);
        c.add(res);

        resadd = new JTextArea();
        resadd.setFont(new Font("Arial", Font.PLAIN, 15));
        resadd.setSize(200, 75);
        resadd.setLocation(580, 175);
        resadd.setLineWrap(true);
        c.add(resadd);

        setVisible(true);
    }

    // method actionPerformed()
    // to get the action performed
    // by the user and act accordingly
    public void actionPerformed(ActionEvent e)
    {

        if (e.getSource() == sub) {
            if (term.isSelected()) {
                String data1;
                String data = "Customer Name : "+ tname.getText() + "\n" + "Phone No. : "
                        + tno.getText() + "\n";

                if (face.isSelected()) {
                    data1 = "Category   : Face" + "\n";
                } else if (eye.isSelected()) {
                    data1 = "Category   : Eye" + "\n";
                } else {
                    data1 = "Category   : Lip" + "\n";
                }

                if (makeup.getSelectedIndex()==1) {
                    price.setText("Price: 39.00");
                } else if (makeup.getSelectedIndex()==2) {
                    price.setText("Price: 29.00");
                } else if (makeup.getSelectedIndex()==3) {
                    price.setText("Price: 19.00");
                } else if (makeup.getSelectedIndex()==4) {
                    price.setText("Price: 22.00");
                }else if (makeup.getSelectedIndex()==5) {
                    price.setText("Price: 59.00");
                } else if (makeup.getSelectedIndex()==6) {
                    price.setText("Price: 25.00");
                } else if (makeup.getSelectedIndex()==7) {
                    price.setText("Price: 23.00");
                }

                String data2 = "Product     : " + (String)makeup.getSelectedItem() +
                        "\n\n\n\n\n\n\n\n " ;

//                String data3 = "Address    : " + tadd.getText();
                tout.setText(data + data1 + data2 ); //+ data3);
                tout.setEditable(false);
                res.setText("Thank you for your order " + tname.getText() + "!");
            }
            else {
                tout.setText("");
                resadd.setText("");
                res.setText("Please confirm your order ! ");
            }
        }

        else if (e.getSource() == adding) {
            String data4;

            if (face.isSelected()) {
                data4 = "Category   : Face" + "\n";
            } else if (eye.isSelected()) {
                data4 = "Category   : Eye" + "\n";
            } else {
                data4 = "Category   : Lip" + "\n";
            }

            String data5 = "Product     : " + (String)makeup.getSelectedItem();

            tout.setText(data4 + data5);
        }

        else if (e.getSource() == reset) {
            String def = "";
            tname.setText(def);
//            tadd.setText(def);
            tno.setText(def);
            price.setText(def);
            res.setText(def);
            tout.setText(def);
            term.setSelected(false);
            makeup.setSelectedIndex(0);
            resadd.setText(def);
            worded.setText(def);
        }

        else if(e.getSource() == searching){

            String data6;

            if (worded.equals(face)) {
                worded.setText("\n foundation \n concealer");
            } else if(worded.equals(eye)){
                worded.setText("\n mascara \n eyeliner");
             } else if(worded.equals(lip)){
                worded.setText("\n mascara \n eyeliner");
            }

//            if (word=="face") {
//                data6 = "\n" + "foundation" + "\n" + "concealer" + "\n" + "blusher";
//            } else if(word=="eye"){
//                data6 = "\n" + "mascara" + "\n" + "eyeshadow";
//             } else if(word=="lip"){
//                data6 = "\n" + "lipstick" + "\n" + "liptint";
//            }

//            switch(word){
//                case "face": System.out.println("\n foundation \n concealer");
//                break;
//                case "eye": System.out.println("\n mascara \n eyeliner");
//                break;
//                case "lip":  System.out.println("\n mascara \n eyeliner")
//                break;
//
//                word.setText(data4 + data5);
//            }
        }

    }
}

// Driver Code
public class Main {

    public static void main(String[] args) throws Exception{
        MyFrame f = new MyFrame();
    }
}
