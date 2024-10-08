package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/*
 * @brief La clase 'SignupTwo' destaca los datos personales un poco menos relevantes, pero no por ellos menos importantes.
 *        Similar a la clase 'SignupOne', integra radioButtons pero involucra tambien comboBoxes para poder escojer entre las
 *        diferentes opciones.
 * @author Atom Alexander M. Nava
 * @date 16/08/24
 */
public class SignupTwo extends JFrame implements ActionListener {
    //Variables globales
    JTextField curp, zipCode;
    JButton next;
    JRadioButton sYes, sNo, eYes, eNo;
    JComboBox religion, category, occupation, education, income;
    String formNo;
    /*
     * @brief Constructor 'SignupTwo' para la entrada de datos, representada como la página 2. 
     * @param formNo. El parámetro 'formNo' tiene la función de asignar el número de formualario correspondiente
     *                a cada cliente que fue ingresando en la página 1. Esto ofrece mayor organización y manejo de los datos.
     * @author Atom Alexander M. Nava
     * @date 16/08/24 
     */
    SignupTwo(String formNo)
    {
        this.formNo = formNo;
        setLayout(null);
        setTitle("NEW ACCOUNT APPLICATION FORM - PAGE 2");

        JLabel additionalDetails = new JLabel("Page 2: Additional Details");
        additionalDetails.setFont(new Font("Raleway", Font.BOLD, 22));
        additionalDetails.setBounds(290, 80, 400, 30);
        add(additionalDetails);

        JLabel name = new JLabel("Religion:");
        name.setFont(new Font("Raleway", Font.BOLD, 20));
        name.setBounds(100, 140, 100, 30);
        add(name);

        String[] valReligion = {"Atheist", "Christian", "Jewish", "Muslim", "Hindu", "Other"};
        religion = new JComboBox(valReligion);
        religion.setBounds(300, 140, 400, 30);
        religion.setBackground(Color.WHITE);
        add(religion);

        JLabel fName = new JLabel("Category:");
        fName.setFont(new Font("Raleway", Font.BOLD, 20));
        fName.setBounds(100, 190, 200, 30);
        add(fName);

        String[] valCategory = {"General", "OBC", "SC", "ST", "Other"};
         category = new JComboBox(valCategory);
        category.setBounds(300, 190, 400, 30);
        category.setBackground(Color.WHITE);
        add(category);

        JLabel dob = new JLabel("Income:");
        dob.setFont(new Font("Raleway", Font.BOLD, 20));
        dob.setBounds(100, 240, 200, 30);
        add(dob);

        String incomeCategory[] = {"Null", "< 1,50,000", "< 2,50,0000", "< 5,00,000",
                                                "Upto 10,00,000"};
        income = new JComboBox(incomeCategory);
        income.setBounds(300, 240, 400, 30);
        income.setBackground(Color.WHITE);
        add(income);

        JLabel gender = new JLabel("Educational:");
        gender.setFont(new Font("Raleway", Font.BOLD, 20));
        gender.setBounds(100, 290, 200, 30);
        add(gender);

        JLabel email = new JLabel("Qualification:");
        email.setFont(new Font("Raleway", Font.BOLD, 20));
        email.setBounds(100, 315, 200, 30);
        add(email);

        String educationValues[] = {"Non-Graduated", "Graduated", "Post-Graduation", "Doctrate",
                "Other"};
        education = new JComboBox(educationValues);
        education.setBounds(300, 315, 400, 30);
        education.setBackground(Color.WHITE);
        add(education);

        JLabel maritalS = new JLabel("Occupation:");
        maritalS.setFont(new Font("Raleway", Font.BOLD, 20));
        maritalS.setBounds(100, 390, 200, 30);
        add(maritalS);

        String occupationValues[] = {"Salaried", "Hourly", "Self Employed", "Bussiness", "Student",
                "Retired", "Other"};
        occupation = new JComboBox(occupationValues);
        occupation.setBounds(300, 390, 400, 30);
        occupation.setBackground(Color.WHITE);
        add(occupation);

        JLabel address = new JLabel("CURP:");
        address.setFont(new Font("Raleway", Font.BOLD, 20));
        address.setBounds(100, 440, 200, 30);
        add(address);

        curp = new JTextField();
        curp.setFont(new Font("Raleway", Font.BOLD, 14));
        curp.setBounds(300, 440, 400, 30);
        add(curp) ;

        JLabel city = new JLabel("ZIP Code:");
        city.setFont(new Font("Raleway", Font.BOLD, 20));
        city.setBounds(100, 490, 200, 30);
        add(city);

        zipCode = new JTextField();
        zipCode.setFont(new Font("Raleway", Font.BOLD, 14));
        zipCode.setBounds(300, 490, 400, 30);
        add(zipCode);

        JLabel state = new JLabel("Senior Citizen:");
        state.setFont(new Font("Raleway", Font.BOLD, 20));
        state.setBounds(100, 540, 200, 30);
        add(state);

        sYes = new JRadioButton("Yes");
        sYes.setBounds(300,540,100,30);
        sYes.setBackground(Color.WHITE);
        add(sYes);

        sNo = new JRadioButton("No");
        sNo.setBounds(450,540,100,30);
        sNo.setBackground(Color.WHITE);
        add(sNo);

        ButtonGroup maritalGroup = new ButtonGroup();
        maritalGroup.add(sYes);
        maritalGroup.add(sNo);

        JLabel pinC = new JLabel("Existing Account:");
        pinC.setFont(new Font("Raleway", Font.BOLD, 20));
        pinC.setBounds(100, 590, 200, 30);
        add(pinC);

        eYes = new JRadioButton("Yes");
        eYes.setBounds(300,590,100,30);
        eYes.setBackground(Color.WHITE);
        add(eYes);

        eNo = new JRadioButton("No");
        eNo.setBounds(450,590,100,30);
        eNo.setBackground(Color.WHITE);
        add(eNo);

        ButtonGroup emaritalGroup = new ButtonGroup();
        emaritalGroup.add(eYes);
        emaritalGroup.add(eNo);

        next = new JButton("Next");
        next.setBackground(Color.BLACK);
        next.setForeground(Color.BLACK);
        next.setFont(new Font("Raleway", Font.BOLD, 14));
        next.setBounds(620, 660, 80, 30);
        next.addActionListener(this);
        add(next);

        getContentPane().setBackground(Color.WHITE);
        setSize(850,800);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    /*
     * @brief Implementación de la interfaz 'ActionListener' para la respuesta a diversos eventos.
     *        Embona la información correspondiente con su tipo de dato, utilizando la función .getSelectedItem()
     *        que los almacena temporalmente.
     * @param e. Sin uso
     * @author Atom Alexander M. Nava
     * @date 16/08/24
     */
    public void actionPerformed(ActionEvent e)
    {
        String sReligion = (String)religion.getSelectedItem();
        String sCategory = (String)category.getSelectedItem();
        String sIncome = (String)income.getSelectedItem();
        String sEducation = (String)education.getSelectedItem();
        String sOccupation = (String)occupation.getSelectedItem();
        String seniorCitizen = null;

        if (sYes.isSelected()) {
            seniorCitizen = "Yes";
        } else if(sNo.isSelected()) {
            seniorCitizen = "No";
        }
        String existingAccount = null;

        if (eYes.isSelected()) {
            existingAccount = "Yes";
        } else if(eNo.isSelected()) {
            existingAccount = "No";
        }

        String sCurp = curp.getText();
        String sZip = zipCode.getText();
        try {
                // Conexción con MySQL
                Conn c = new Conn();
                String query = "insert into signupTwo values('" +
                        formNo + "', '" + sReligion + "', '" + sCategory + "', '" + sIncome + "'," +
                        " '" + sEducation + "', '" + sOccupation + "', '" + sCurp + "', '" + sZip + "', '" + seniorCitizen + "', '" + existingAccount + "')";
                c.s.executeUpdate(query);

            //Signup 3 Object
            setVisible(false);
            new SignupThree(formNo).setVisible(true);

        } catch(Exception ex) {
            System.out.println(ex);
        }
    }

    /*
     * @brief Método principal para la apertura de la página 2, 
     *        con el fin de la obtención de los datos.
     * @author Atom Alexander M. Nava
     * @date 16/08/24
     */
    public static void main(String[] args) {
        new SignupTwo("");
    }
}
