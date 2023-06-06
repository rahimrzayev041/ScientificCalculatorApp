// Name: Rahim
// Surname: Rzayev
/* Description: A Scientific Calculator has been provided with numerous useful functions.
This calculator is capable of performing various operations such as multiplication, division, subtraction, percentage calculations, trigonometric identities (in degrees and radians), square root, cubic root, and more.
Additionally, the calculator offers a feature specifically designed to solve problems related to Rate, Time, and Distance. 
To utilize this feature, you need to select the desired variable to find (speed, time, or distance) from the ComboBox.
Depending on your selection, you will enter the corresponding values for time, distance, or speed into the designated TextFields. 
The calculator will then compute the desired quantity and display the result in the third TextField.
*/ 
package ScientificCalculatorbyRahim;
import java.math.*;
import javax.swing.JOptionPane;
//@author Rzayev Rahim

public class ScientificCalculatorbyRahim extends javax.swing.JFrame {
    private boolean zerodisp; // This Private boolean is a simple variable that captures what the state of a rule is; Either the rule is true or false.
    private boolean decdisp; // This Private boolean is a simple variable that captures what the state of a rule is; Either the rule is true or false.
    private boolean dgrrad; // This Private boolean is a simple variable that captures what the state of a rule is; Either the rule is true or false.
    private boolean sh; // This Private boolean is a simple variable that captures what the state of a rule is; Either the rule is true or false.
    private byte op; // This private bytes shows the size, in bytes, that this process has allocated that cannot be shared with other processes. 
    private double ina; // This private double is an access modifier used for attributes, methods and constructors, making them only accessible within the declared class.
    private double inb; // This private double is an access modifier used for attributes, methods and constructors, making them only accessible within the declared class.
    private double out; // This private double is an access modifier used for attributes, methods and constructors, making them only accessible within the declared class.
   
    
    public ScientificCalculatorbyRahim() {
        initComponents();
    }
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        display2 = new javax.swing.JTextField();
        display1 = new javax.swing.JTextField();
        memorydisplay = new javax.swing.JTextField();
        memoryclear = new javax.swing.JButton();
        memorysave = new javax.swing.JButton();
        onedividedbyx = new javax.swing.JButton();
        cos = new javax.swing.JButton();
        sin = new javax.swing.JButton();
        memoryread = new javax.swing.JButton();
        tan = new javax.swing.JButton();
        pi = new javax.swing.JButton();
        add = new javax.swing.JButton();
        multply = new javax.swing.JButton();
        seven = new javax.swing.JButton();
        eight = new javax.swing.JButton();
        subtract = new javax.swing.JButton();
        nine = new javax.swing.JButton();
        percent = new javax.swing.JButton();
        five = new javax.swing.JButton();
        four = new javax.swing.JButton();
        one = new javax.swing.JButton();
        six = new javax.swing.JButton();
        three = new javax.swing.JButton();
        zero = new javax.swing.JButton();
        two = new javax.swing.JButton();
        negate = new javax.swing.JButton();
        decpoint = new javax.swing.JButton();
        cuberoot = new javax.swing.JButton();
        squared = new javax.swing.JButton();
        squareroot = new javax.swing.JButton();
        divide = new javax.swing.JButton();
        clear = new javax.swing.JButton();
        reset = new javax.swing.JButton();
        equals = new javax.swing.JButton();
        cubed = new javax.swing.JButton();
        degrees = new javax.swing.JRadioButton();
        radians = new javax.swing.JRadioButton();
        shift = new javax.swing.JToggleButton();
        jCDistance1 = new javax.swing.JComboBox<>();
        Reset = new javax.swing.JButton();
        Convert = new javax.swing.JButton();
        jtxtEnter4 = new javax.swing.JTextField();
        jlblResult = new javax.swing.JTextField();
        jtxtEnter3 = new javax.swing.JTextField();
        jlblDisplay4 = new javax.swing.JTextField();
        jlblDisplay3 = new javax.swing.JTextField();
        jlblDisplay5 = new javax.swing.JTextField();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Scientific Calculator By Rahim");
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        display2.setBackground(new java.awt.Color(255, 255, 153));
        display2.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        display2.setForeground(new java.awt.Color(255, 0, 0));
        display2.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display2.setFocusable(false);
        display2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display2ActionPerformed(evt);
            }
        });
        getContentPane().add(display2, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 11, 890, 36));

        display1.setBackground(new java.awt.Color(255, 255, 153));
        display1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        display1.setForeground(new java.awt.Color(255, 0, 0));
        display1.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        display1.setFocusable(false);
        display1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                display1ActionPerformed(evt);
            }
        });
        getContentPane().add(display1, new org.netbeans.lib.awtextra.AbsoluteConstraints(10, 53, 890, 42));

        memorydisplay.setBackground(new java.awt.Color(255, 204, 204));
        memorydisplay.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        memorydisplay.setText("0");
        memorydisplay.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.LOWERED));
        memorydisplay.setFocusable(false);
        memorydisplay.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorydisplayActionPerformed(evt);
            }
        });
        getContentPane().add(memorydisplay, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 110, 150, 40));

        memoryclear.setBackground(new java.awt.Color(204, 204, 204));
        memoryclear.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        memoryclear.setForeground(new java.awt.Color(0, 0, 153));
        memoryclear.setText("MC");
        memoryclear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryclear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryclear.setFocusable(false);
        memoryclear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryclearActionPerformed(evt);
            }
        });
        getContentPane().add(memoryclear, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 110, 60, 50));

        memorysave.setBackground(new java.awt.Color(204, 204, 204));
        memorysave.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        memorysave.setForeground(new java.awt.Color(0, 0, 153));
        memorysave.setText("MS");
        memorysave.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memorysave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memorysave.setFocusable(false);
        memorysave.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memorysaveActionPerformed(evt);
            }
        });
        getContentPane().add(memorysave, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 110, 60, 50));

        onedividedbyx.setBackground(new java.awt.Color(204, 204, 204));
        onedividedbyx.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        onedividedbyx.setForeground(new java.awt.Color(0, 0, 153));
        onedividedbyx.setText("1/x");
        onedividedbyx.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        onedividedbyx.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        onedividedbyx.setFocusable(false);
        onedividedbyx.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                onedividedbyxActionPerformed(evt);
            }
        });
        getContentPane().add(onedividedbyx, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 390, 60, 50));

        cos.setBackground(new java.awt.Color(204, 204, 204));
        cos.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cos.setForeground(new java.awt.Color(0, 0, 153));
        cos.setText("Cos");
        cos.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cos.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cos.setFocusable(false);
        cos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cosActionPerformed(evt);
            }
        });
        getContentPane().add(cos, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 210, 60, 50));

        sin.setBackground(new java.awt.Color(204, 204, 204));
        sin.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        sin.setForeground(new java.awt.Color(0, 0, 153));
        sin.setText("Sin");
        sin.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        sin.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        sin.setFocusable(false);
        sin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sinActionPerformed(evt);
            }
        });
        getContentPane().add(sin, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 210, 60, 50));

        memoryread.setBackground(new java.awt.Color(204, 204, 204));
        memoryread.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        memoryread.setForeground(new java.awt.Color(0, 0, 153));
        memoryread.setText("MR");
        memoryread.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        memoryread.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        memoryread.setFocusable(false);
        memoryread.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                memoryreadActionPerformed(evt);
            }
        });
        getContentPane().add(memoryread, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 110, 60, 50));

        tan.setBackground(new java.awt.Color(204, 204, 204));
        tan.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        tan.setForeground(new java.awt.Color(0, 0, 153));
        tan.setText("Tan");
        tan.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        tan.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        tan.setFocusable(false);
        tan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tanActionPerformed(evt);
            }
        });
        getContentPane().add(tan, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 210, 60, 50));

        pi.setBackground(new java.awt.Color(204, 204, 204));
        pi.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        pi.setForeground(new java.awt.Color(0, 0, 153));
        pi.setText("π");
        pi.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        pi.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        pi.setFocusable(false);
        pi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                piActionPerformed(evt);
            }
        });
        getContentPane().add(pi, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 450, 60, 50));

        add.setBackground(new java.awt.Color(204, 204, 204));
        add.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        add.setForeground(new java.awt.Color(0, 0, 153));
        add.setText("+");
        add.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        add.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        add.setFocusable(false);
        add.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                addActionPerformed(evt);
            }
        });
        getContentPane().add(add, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 210, 60, 50));

        multply.setBackground(new java.awt.Color(204, 204, 204));
        multply.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        multply.setForeground(new java.awt.Color(0, 0, 153));
        multply.setText("*");
        multply.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        multply.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        multply.setFocusable(false);
        multply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                multplyActionPerformed(evt);
            }
        });
        getContentPane().add(multply, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 330, 60, 50));

        seven.setBackground(new java.awt.Color(204, 204, 204));
        seven.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        seven.setForeground(new java.awt.Color(0, 0, 153));
        seven.setText("7");
        seven.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        seven.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        seven.setFocusable(false);
        seven.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sevenActionPerformed(evt);
            }
        });
        getContentPane().add(seven, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 270, 60, 50));

        eight.setBackground(new java.awt.Color(204, 204, 204));
        eight.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        eight.setForeground(new java.awt.Color(0, 0, 153));
        eight.setText("8");
        eight.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        eight.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        eight.setFocusable(false);
        eight.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                eightActionPerformed(evt);
            }
        });
        getContentPane().add(eight, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 270, 60, 50));

        subtract.setBackground(new java.awt.Color(204, 204, 204));
        subtract.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        subtract.setForeground(new java.awt.Color(0, 0, 153));
        subtract.setText("-");
        subtract.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        subtract.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        subtract.setFocusable(false);
        subtract.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                subtractActionPerformed(evt);
            }
        });
        getContentPane().add(subtract, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 270, 60, 50));

        nine.setBackground(new java.awt.Color(204, 204, 204));
        nine.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        nine.setForeground(new java.awt.Color(0, 0, 153));
        nine.setText("9");
        nine.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        nine.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        nine.setFocusable(false);
        nine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                nineActionPerformed(evt);
            }
        });
        getContentPane().add(nine, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 270, 60, 50));

        percent.setBackground(new java.awt.Color(204, 204, 204));
        percent.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        percent.setForeground(new java.awt.Color(0, 0, 153));
        percent.setText("%");
        percent.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        percent.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        percent.setFocusable(false);
        percent.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                percentActionPerformed(evt);
            }
        });
        getContentPane().add(percent, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 210, 60, 50));

        five.setBackground(new java.awt.Color(204, 204, 204));
        five.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        five.setForeground(new java.awt.Color(0, 0, 153));
        five.setText("5");
        five.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        five.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        five.setFocusable(false);
        five.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fiveActionPerformed(evt);
            }
        });
        getContentPane().add(five, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 330, 60, 50));

        four.setBackground(new java.awt.Color(204, 204, 204));
        four.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        four.setForeground(new java.awt.Color(0, 0, 153));
        four.setText("4");
        four.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        four.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        four.setFocusable(false);
        four.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fourActionPerformed(evt);
            }
        });
        getContentPane().add(four, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 330, 60, 50));

        one.setBackground(new java.awt.Color(204, 204, 204));
        one.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        one.setForeground(new java.awt.Color(0, 0, 153));
        one.setText("1");
        one.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        one.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        one.setFocusable(false);
        one.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneActionPerformed(evt);
            }
        });
        getContentPane().add(one, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 390, 60, 50));

        six.setBackground(new java.awt.Color(204, 204, 204));
        six.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        six.setForeground(new java.awt.Color(0, 0, 153));
        six.setText("6");
        six.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        six.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        six.setFocusable(false);
        six.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                sixActionPerformed(evt);
            }
        });
        getContentPane().add(six, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 330, 60, 50));

        three.setBackground(new java.awt.Color(204, 204, 204));
        three.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        three.setForeground(new java.awt.Color(0, 0, 153));
        three.setText("3");
        three.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        three.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        three.setFocusable(false);
        three.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                threeActionPerformed(evt);
            }
        });
        getContentPane().add(three, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 390, 60, 50));

        zero.setBackground(new java.awt.Color(204, 204, 204));
        zero.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        zero.setForeground(new java.awt.Color(0, 0, 153));
        zero.setText("0");
        zero.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        zero.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        zero.setFocusable(false);
        zero.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zeroActionPerformed(evt);
            }
        });
        getContentPane().add(zero, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 450, 60, 50));

        two.setBackground(new java.awt.Color(204, 204, 204));
        two.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        two.setForeground(new java.awt.Color(0, 0, 153));
        two.setText("2");
        two.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        two.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        two.setFocusable(false);
        two.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoActionPerformed(evt);
            }
        });
        getContentPane().add(two, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 390, 60, 50));

        negate.setBackground(new java.awt.Color(204, 204, 204));
        negate.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        negate.setForeground(new java.awt.Color(0, 0, 153));
        negate.setText("±");
        negate.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        negate.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        negate.setFocusable(false);
        negate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                negateActionPerformed(evt);
            }
        });
        getContentPane().add(negate, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 450, 60, 50));

        decpoint.setBackground(new java.awt.Color(204, 204, 204));
        decpoint.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        decpoint.setForeground(new java.awt.Color(0, 0, 153));
        decpoint.setText(".");
        decpoint.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        decpoint.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        decpoint.setFocusable(false);
        decpoint.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                decpointActionPerformed(evt);
            }
        });
        getContentPane().add(decpoint, new org.netbeans.lib.awtextra.AbsoluteConstraints(200, 450, 60, 50));

        cuberoot.setBackground(new java.awt.Color(204, 204, 204));
        cuberoot.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cuberoot.setForeground(new java.awt.Color(0, 0, 153));
        cuberoot.setText("³√x");
        cuberoot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cuberoot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cuberoot.setFocusable(false);
        cuberoot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cuberootActionPerformed(evt);
            }
        });
        getContentPane().add(cuberoot, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 450, 60, 50));

        squared.setBackground(new java.awt.Color(204, 204, 204));
        squared.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        squared.setForeground(new java.awt.Color(0, 0, 153));
        squared.setText("x²");
        squared.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squared.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squared.setFocusable(false);
        squared.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squaredActionPerformed(evt);
            }
        });
        getContentPane().add(squared, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 270, 60, 50));

        squareroot.setBackground(new java.awt.Color(204, 204, 204));
        squareroot.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        squareroot.setForeground(new java.awt.Color(0, 0, 153));
        squareroot.setText("√x");
        squareroot.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        squareroot.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        squareroot.setFocusable(false);
        squareroot.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                squarerootActionPerformed(evt);
            }
        });
        getContentPane().add(squareroot, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 330, 60, 50));

        divide.setBackground(new java.awt.Color(204, 204, 204));
        divide.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        divide.setForeground(new java.awt.Color(0, 0, 153));
        divide.setText("/");
        divide.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        divide.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        divide.setFocusable(false);
        divide.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                divideActionPerformed(evt);
            }
        });
        getContentPane().add(divide, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 390, 60, 50));

        clear.setBackground(new java.awt.Color(204, 204, 204));
        clear.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        clear.setForeground(new java.awt.Color(0, 0, 153));
        clear.setText("CE");
        clear.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        clear.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        clear.setFocusable(false);
        clear.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearActionPerformed(evt);
            }
        });
        getContentPane().add(clear, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 270, 60, 50));

        reset.setBackground(new java.awt.Color(204, 204, 204));
        reset.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        reset.setForeground(new java.awt.Color(0, 0, 153));
        reset.setText("C");
        reset.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        reset.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        reset.setFocusable(false);
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });
        getContentPane().add(reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 210, 60, 50));

        equals.setBackground(new java.awt.Color(204, 204, 204));
        equals.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        equals.setForeground(new java.awt.Color(0, 0, 153));
        equals.setText("=");
        equals.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        equals.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        equals.setFocusable(false);
        equals.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                equalsActionPerformed(evt);
            }
        });
        getContentPane().add(equals, new org.netbeans.lib.awtextra.AbsoluteConstraints(290, 450, 60, 50));

        cubed.setBackground(new java.awt.Color(204, 204, 204));
        cubed.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        cubed.setForeground(new java.awt.Color(0, 0, 153));
        cubed.setText("x³");
        cubed.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        cubed.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        cubed.setFocusable(false);
        cubed.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cubedActionPerformed(evt);
            }
        });
        getContentPane().add(cubed, new org.netbeans.lib.awtextra.AbsoluteConstraints(380, 390, 60, 50));

        degrees.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(degrees);
        degrees.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        degrees.setForeground(new java.awt.Color(0, 0, 153));
        degrees.setSelected(true);
        degrees.setText("Degrees");
        degrees.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        degrees.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        degrees.setFocusable(false);
        degrees.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                degreesActionPerformed(evt);
            }
        });
        getContentPane().add(degrees, new org.netbeans.lib.awtextra.AbsoluteConstraints(20, 170, -1, -1));

        radians.setBackground(new java.awt.Color(204, 255, 255));
        buttonGroup1.add(radians);
        radians.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        radians.setForeground(new java.awt.Color(0, 0, 153));
        radians.setText("Radians");
        radians.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        radians.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        radians.setFocusable(false);
        radians.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                radiansActionPerformed(evt);
            }
        });
        getContentPane().add(radians, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 170, -1, -1));

        shift.setBackground(new java.awt.Color(204, 204, 204));
        shift.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        shift.setForeground(new java.awt.Color(0, 0, 153));
        shift.setText("Sh");
        shift.setBorder(new javax.swing.border.SoftBevelBorder(javax.swing.border.BevelBorder.RAISED));
        shift.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        shift.setFocusable(false);
        shift.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                shiftMouseClicked(evt);
            }
        });
        shift.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shiftActionPerformed(evt);
            }
        });
        getContentPane().add(shift, new org.netbeans.lib.awtextra.AbsoluteConstraints(470, 330, 60, 50));

        jCDistance1.setBackground(new java.awt.Color(255, 0, 0));
        jCDistance1.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        jCDistance1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Select an option", "Distance", "Speed", "Time" }));
        jCDistance1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jCDistance1ActionPerformed(evt);
            }
        });
        getContentPane().add(jCDistance1, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 110, 290, 70));

        Reset.setBackground(new java.awt.Color(255, 0, 51));
        Reset.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Reset.setText("Reset");
        Reset.setPreferredSize(new java.awt.Dimension(7, 23));
        Reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ResetActionPerformed(evt);
            }
        });
        getContentPane().add(Reset, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 450, 150, 50));

        Convert.setBackground(new java.awt.Color(255, 0, 51));
        Convert.setFont(new java.awt.Font("Calibri", 1, 18)); // NOI18N
        Convert.setText("Convert");
        Convert.setPreferredSize(new java.awt.Dimension(7, 23));
        Convert.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConvertActionPerformed(evt);
            }
        });
        getContentPane().add(Convert, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 450, 150, 50));

        jtxtEnter4.setBackground(new java.awt.Color(153, 255, 204));
        jtxtEnter4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtEnter4.setForeground(new java.awt.Color(204, 0, 204));
        jtxtEnter4.setPreferredSize(new java.awt.Dimension(20, 20));
        jtxtEnter4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEnter4ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtEnter4, new org.netbeans.lib.awtextra.AbsoluteConstraints(750, 210, 150, 50));

        jlblResult.setBackground(new java.awt.Color(153, 255, 204));
        jlblResult.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblResult.setForeground(new java.awt.Color(204, 0, 204));
        jlblResult.setPreferredSize(new java.awt.Dimension(20, 20));
        jlblResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblResultActionPerformed(evt);
            }
        });
        getContentPane().add(jlblResult, new org.netbeans.lib.awtextra.AbsoluteConstraints(630, 380, 200, 50));

        jtxtEnter3.setBackground(new java.awt.Color(153, 255, 204));
        jtxtEnter3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jtxtEnter3.setForeground(new java.awt.Color(204, 0, 204));
        jtxtEnter3.setPreferredSize(new java.awt.Dimension(20, 20));
        jtxtEnter3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jtxtEnter3ActionPerformed(evt);
            }
        });
        getContentPane().add(jtxtEnter3, new org.netbeans.lib.awtextra.AbsoluteConstraints(580, 210, 150, 50));

        jlblDisplay4.setBackground(new java.awt.Color(153, 255, 204));
        jlblDisplay4.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblDisplay4.setForeground(new java.awt.Color(204, 0, 204));
        jlblDisplay4.setPreferredSize(new java.awt.Dimension(20, 20));
        jlblDisplay4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblDisplay4ActionPerformed(evt);
            }
        });
        getContentPane().add(jlblDisplay4, new org.netbeans.lib.awtextra.AbsoluteConstraints(560, 300, 100, 50));

        jlblDisplay3.setBackground(new java.awt.Color(153, 255, 204));
        jlblDisplay3.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblDisplay3.setForeground(new java.awt.Color(204, 0, 204));
        jlblDisplay3.setPreferredSize(new java.awt.Dimension(20, 20));
        jlblDisplay3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblDisplay3ActionPerformed(evt);
            }
        });
        getContentPane().add(jlblDisplay3, new org.netbeans.lib.awtextra.AbsoluteConstraints(680, 300, 100, 50));

        jlblDisplay5.setBackground(new java.awt.Color(153, 255, 204));
        jlblDisplay5.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jlblDisplay5.setForeground(new java.awt.Color(204, 0, 204));
        jlblDisplay5.setPreferredSize(new java.awt.Dimension(20, 20));
        jlblDisplay5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jlblDisplay5ActionPerformed(evt);
            }
        });
        getContentPane().add(jlblDisplay5, new org.netbeans.lib.awtextra.AbsoluteConstraints(800, 300, 100, 50));

        jTextField1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField1ActionPerformed(evt);
            }
        });
        getContentPane().add(jTextField1, new org.netbeans.lib.awtextra.AbsoluteConstraints(430, 556, 10, 0));
        getContentPane().add(jTextField2, new org.netbeans.lib.awtextra.AbsoluteConstraints(910, 320, 10, 10));

        pack();
    }// </editor-fold>//GEN-END:initComponents
    // MR surgery is performed using this code. The Mr (memory recall) button brings the memory value back to the screen.
    private void memoryreadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryreadActionPerformed
     display1.setText(String.valueOf(memorydisplay.getText()));   
    }//GEN-LAST:event_memoryreadActionPerformed

    private void onedividedbyxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_onedividedbyxActionPerformed
      inb =Double.parseDouble(String.valueOf(display1.getText())); //This code displays all of the calculations related to 1/x on TextField.
      out = 1 / inb;
      //the condition in an if statement is a Boolean expression which evaluates to either true or false 
      if( out > -100000000 && out < 100000000 ){ // If the expression matches the condition specified in parentheses, this code will calculate and the answer will be displayed in TextField
           display1.setText(String.valueOf(out)); //This code displays all of the calculations related to 1/x on TextField.
       }
      //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false. 
      else{
              display1.setText("Error"); // If the condition is not correct, it will show "ERROR" message.
       }
       display2.setText( "1/" +  String.valueOf(inb)); //This code commands to display the "1/x" operation in TextField.
       out = 0;
       op = 0;
      
    }//GEN-LAST:event_onedividedbyxActionPerformed
    // The cosinus operation is represented by this code. 
    private void cosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cosActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText())); //This code displays all of the calculations related to sinus operations on TextField.
     if(!sh){ //the condition in an if statement is a Boolean expression which evaluates to either true or false
         if(!dgrrad){ //An if statement's condition is a Boolean expression that evaluates to true or false.
              display2.setText("cos(" + String.valueOf(inb) + ")");//this code is intended to perform calculations with degrees
      inb = inb * 0.0174532925;/* the given number is equal to the 1 degree of the sinus, 
                               and this code obtains the result by multiplying the degree you entered by the specified number.*/
         }
         out = Math.cos(inb);
     }
     else{//an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.           w  
         //This code calculates the cosinus with the number pi.
         display2.setText("cosh(" + String.valueOf(inb) + ")");
           out = Math.cosh(inb);
     }
     
     display1.setText(String.valueOf(out));//This code calculates and display on the TextField. 
     out = 0;
     op = 0;
    }//GEN-LAST:event_cosActionPerformed
    // The sinus operation is represented by this code. 
    private void sinActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sinActionPerformed
     inb = Double.parseDouble(String.valueOf(display1.getText())); //This code displays all of the calculations related to sinus operations on TextField.
     if(!sh){ //the condition in an if statement is a Boolean expression which evaluates to either true or false
         if(!dgrrad){ //An if statement's condition is a Boolean expression that evaluates to true or false.
              display2.setText("sin(" + String.valueOf(inb) + ")"); //this code is intended to perform calculations with degrees
      inb = inb * 0.0174532925;/* the given number is equal to the 1 degree of the sinus, 
                               and this code obtains the result by multiplying the degree you entered by the specified number.*/
         }
         out = Math.sin(inb);
     }
     else{//an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.           w  
         //This code calculates the sinus with the number pi.
         display2.setText("sinh(" + String.valueOf(inb) + ")");
           out = Math.sinh(inb);
     }
     
     display1.setText(String.valueOf(out));//This code calculates and display on the TextField. 
     out = 0;
     op = 0;
    }//GEN-LAST:event_sinActionPerformed
    //On a calculator, these codes are used to write the number 4.
    private void fourActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fourActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 4 from TextField.
       }
       display1.setText(display1.getText()+"4"); //this code is to display the number 4 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_fourActionPerformed
    //On a calculator, these codes are used to write the number 5.
    private void fiveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fiveActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 5 from TextField.
       }
       display1.setText(display1.getText()+"5"); //this code is to display the number 5 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_fiveActionPerformed
    // The computation is converted from degrees to radian using this button.
    private void radiansActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_radiansActionPerformed
      dgrrad = true; // This code converts degrees to radians 
    }//GEN-LAST:event_radiansActionPerformed
    //On a calculator, these codes are used to write the number 0.
    private void zeroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zeroActionPerformed
       if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 0 from TextField.
       }
       display1.setText(display1.getText()+"0"); //this code is to display the number 0 in the TextField.
  
    }//GEN-LAST:event_zeroActionPerformed
    //On a calculator, these codes are used to write the number 1.
    private void oneActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 1 from TextField.
       }
       display1.setText(display1.getText()+"1"); //this code is to display the number 1 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_oneActionPerformed
    //On a calculator, these codes are used to write the number 2.
    private void twoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 2 from TextField.
       }
       display1.setText(display1.getText()+"2"); //this code is to display the number 2 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_twoActionPerformed
    //On a calculator, these codes are used to write the number 3.
    private void threeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_threeActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 3 from TextField.
       }
       display1.setText(display1.getText()+"3"); //this code is to display the number 3 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_threeActionPerformed
    //On a calculator, these codes are used to write the number 6.
    private void sixActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sixActionPerformed
         if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 6 from TextField.
       }
       display1.setText(display1.getText()+"6"); //this code is to display the number 6 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_sixActionPerformed
    //On a calculator, these codes are used to write the number 7.
    private void sevenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_sevenActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 7 from TextField.
       }
       display1.setText(display1.getText()+"7"); //this code is to display the number 7 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_sevenActionPerformed
    //On a calculator, these codes are used to write the number 8.
    private void eightActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_eightActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 8 from TextField.
       }
       display1.setText(display1.getText()+"8"); //this code is to display the number 8 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_eightActionPerformed
    //On a calculator, these codes are used to write the number 9.
    private void nineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_nineActionPerformed
        if(!zerodisp && !decdisp){
           display1.setText(null); //The purpose of this code is to remove the number 9 from TextField.
       }
       display1.setText(display1.getText()+"9"); //this code is to display the number 9 in the TextField.
       zerodisp =true;
    }//GEN-LAST:event_nineActionPerformed
    // This code is used to create "." operation.
    private void decpointActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_decpointActionPerformed
     if(! decdisp){ 
        display1.setText(display1.getText()+"."); //this code is in TextField "." shows.
     }
    }//GEN-LAST:event_decpointActionPerformed
    // This code is used to create negative numbers.
    private void negateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_negateActionPerformed
       inb = Double.parseDouble(String.valueOf(display1.getText())); //This code displays all of the calculations related to negative numbers on TextField.
       out=inb * -1 ; 
       //the condition in an if statement is a Boolean expression which evaluates to either true or false.
       if( out > -100000000 && out < 100000000 ){ //The condition -100000000 and 100000000 is shown in this if sentence.
           display1.setText(String.valueOf(out)); //This code commands to display the result in TextField when the above condition is true.
       }
       else{//an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.
              display1.setText("Error"); //This code commands to display "Error" message in TextField when the above condition is false.
       }
       decdisp = true;
       out = 0;
    }//GEN-LAST:event_negateActionPerformed
     
    
    private void clearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearActionPerformed
       display1.setText("0");
      zerodisp = false;  
      decdisp = false;  
    }//GEN-LAST:event_clearActionPerformed
    //It removes all textfields and sets all textfields to null.
    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed
       display1.setText(null); //This code removes display1.setText
       display2.setText(null); //This code removes display2.setText
       zerodisp = false; //This code removes zerodisp  
       decdisp = false; //This code removes decdisp
       ina = 0;
       inb = 0; 
       out = 0;
        
    }//GEN-LAST:event_resetActionPerformed

    private void display1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display1ActionPerformed
     // All answer display in this TextField.   
    }//GEN-LAST:event_display1ActionPerformed

    private void display2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_display2ActionPerformed
    // All calculations are displayed in this TextField.   
    }//GEN-LAST:event_display2ActionPerformed
    // MS surgery is performed using this code. MC (memory clear) to clear the calculator's memory.
    private void memoryclearActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memoryclearActionPerformed
      memorydisplay.setText("0"); //The calculator's memory is emptied thanks to this code.
    }//GEN-LAST:event_memoryclearActionPerformed
    // MS surgery is performed using this code. The ms (memory store) button copies the number from the screen to the memory.
    private void memorysaveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorysaveActionPerformed
       memorydisplay.setText(String.valueOf(display1.getText())); //The calculations are copied from the TextField to memory using this code.
    }//GEN-LAST:event_memorysaveActionPerformed

    private void percentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_percentActionPerformed
         ina =Double.parseDouble(String.valueOf(display1.getText())); // this code indicates the percentage on the TextField.
         display1.setText("0"); // This code shows "0" on the TextField.
         display2.setText(String.valueOf(ina)+ "%("); // This code add "%" to the TextField.
         decdisp = false;
         zerodisp = false;
         op = 5;
         
    }//GEN-LAST:event_percentActionPerformed

    private void piActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_piActionPerformed
      display1.setText(String.valueOf(Math.PI)); //This code displays "PI" button on the TextField. 
    }//GEN-LAST:event_piActionPerformed

    private void squaredActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squaredActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText())); // This code indicates the square on the TextField.
        out = inb * inb; // This code times two number each other, and it calculates square of number.
        //the condition in an if statement is a Boolean expression which evaluates to either true or false 
         if( out > -100000000 && out < 100000000 ){// If the expression matches the condition specified in parentheses, this code will calculate and the answer will be displayed in TextField
           display1.setText(String.valueOf(out));
       }
       //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.
         else{
              display1.setText("Error");// If the condition is not correct, it will show "ERROR" message.
       }
         display2.setText(String.valueOf(inb) + "²"); //This code commands to display the "^2" operation in TextField.
         out = 0;
         op = 0;
        
    }//GEN-LAST:event_squaredActionPerformed

    private void squarerootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_squarerootActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText())); //This code displays all of the calculations related to squareroot on TextField.
        out = Math.sqrt(inb);
        
        display1.setText(String.valueOf(out));
        display2.setText( "√" + String.valueOf(inb)); //This code commands to display the "√" operation in TextField.
         out = 0;
         op = 0;
        
    }//GEN-LAST:event_squarerootActionPerformed

    private void cubedActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cubedActionPerformed
       inb = Double.parseDouble(String.valueOf(display1.getText())); //This code displays all of the calculations related to x to the third power on TextField.
        out = inb * inb * inb;
        //the condition in an if statement is a Boolean expression which evaluates to either true or false 
         if( out > -100000000 && out < 100000000 ){// If the expression matches the condition specified in parentheses, this code will calculate and the answer will be displayed in TextField
           display1.setText(String.valueOf(out));
       }
       //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.
         else{
              display1.setText("Error");// If the condition is not correct, it will show "ERROR" message.
       }
         display2.setText(String.valueOf(inb) + "³"); //This code commands to display the "^3" operation in TextField.
         out = 0;
         op = 0;
        
    }//GEN-LAST:event_cubedActionPerformed

    private void cuberootActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cuberootActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText())); //This code displays all of the calculations related to third degree root of value on TextField.
        out = Math.cbrt(inb);
        
        display1.setText(String.valueOf(out));
        display2.setText( "³√" + String.valueOf(inb)); //This code commands to display the "³√" operation in TextField.
         out = 0;
        op = 0;
    }//GEN-LAST:event_cuberootActionPerformed

    private void shiftMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_shiftMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_shiftMouseClicked
    // The tangent operation is represented by this code.
    private void tanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tanActionPerformed
        inb = Double.parseDouble(String.valueOf(display1.getText())); //This code displays all of the calculations related to tangent operations on TextField.
     if(!sh){ //the condition in an if statement is a Boolean expression which evaluates to either true or false
         if(!dgrrad){ //An if statement's condition is a Boolean expression that evaluates to true or false.
              display2.setText("tan(" + String.valueOf(inb) + ")"); //this code is intended to perform calculations with degrees
     inb = inb * 0.0174532925; /* the given number is equal to the 1 degree of the tangent, 
                               and this code obtains the result by multiplying the degree you entered by the specified number.*/
         }
         out = Math.tan(inb);
     }
     else{ //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.           w  
         //This code calculates the tangent with the number pi.
         display2.setText("tanh(" + String.valueOf(inb) + ")"); //This code calculates and display on the TextField. 
           out = Math.tanh(inb);
     }
     
     display1.setText(String.valueOf(out));//Code displays the result about tangent's calculations.
     out = 0;
     op = 0;
    }//GEN-LAST:event_tanActionPerformed
    // The computation is converted from radians to degrees using this button.
    private void degreesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_degreesActionPerformed
        dgrrad = false; // This code converts radians to degrees
    }//GEN-LAST:event_degreesActionPerformed

    private void shiftActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shiftActionPerformed
       if(sh){
           sh = true ;
       }
       else{
           sh = false;
       }
    }//GEN-LAST:event_shiftActionPerformed
    // This code was added in order to sum numbers.
    private void addActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_addActionPerformed
        //the condition in an if statement is a Boolean expression which evaluates to either true or false
        if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText())); //this code indicates the first addition on the TextField.
        }
       
        //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false. 
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText())); //this code indicates the second addition on the TextField
        }
        if( op == 1 ){ 
            ina = ina + inb; // This code was added in order to sum numbers.
        }
         if( op == 2 ){
            ina = ina - inb; // This code was added in order to subtract numbers.
        }
         if( op == 3 ){
            ina = ina * inb; // This code has been added to multiply numbers.
        }
         if( op == 4 ){
            ina = ina / inb; // This code has been added to divide numbers.
        }
         if( op == 5 ){
            ina = ina * inb / 100; // This code was added to find the percentage of numbers.
        }
         display1.setText("0");; //While holding the addition operation in the first TextField, this code writes the number 0 in the second TextField.
         display2.setText(String.valueOf(ina) + " + "); //This code commands to display the "+" operation in TextField.
         op = 1;
         decdisp = false;
         zerodisp = false;
         
    }//GEN-LAST:event_addActionPerformed
    // This code was added in order to subtract numbers.
    private void subtractActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_subtractActionPerformed
        //the condition in an if statement is a Boolean expression which evaluates to either true or false 
        if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText())); // this code indicates the Minuend on the TextField.
        }
        //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false. 
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText())); //this code indicates the subtrahend on the TextField
        }
        if( op == 1 ){
            ina = ina + inb; // This code was added in order to sum numbers.
        }
         if( op == 2 ){
            ina = ina - inb; // This code was added in order to subtract numbers.
        }
         if( op == 3 ){
            ina = ina * inb; // This code has been added to multiply numbers.
        }
         if( op == 4 ){
            ina = ina / inb; // This code has been added to divide numbers.
        }
         if( op == 5 ){
            ina = ina * inb / 100; // This code was added to find the percentage of numbers.
        }
         display1.setText("0");; //While holding the addition operation in the first TextField, this code writes the number 0 in the second TextField.
         display2.setText(String.valueOf(ina) + " - "); //This code commands to display the "-" operation in TextField.
         op = 2;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_subtractActionPerformed
    // This code was added in order to multiplication numbers.
    private void multplyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_multplyActionPerformed
        //the condition in an if statement is a Boolean expression which evaluates to either true or false
        if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText())); // this code indicates the division on the TextField.
        }
        //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText())); //this code indicates the divisor on the TextField
        }
        if( op == 1 ){
            ina = ina + inb; // This code was added in order to sum numbers.
        }
         if( op == 2 ){
            ina = ina - inb; // This code was added in order to subtract numbers.
        }
         if( op == 3 ){
            ina = ina * inb; // This code has been added to multiply numbers.
        }
         if( op == 4 ){
            ina = ina / inb; // This code has been added to divide numbers.
        }
         if( op == 5 ){
            ina = ina * inb / 100; // This code was added to find the percentage of numbers.
        }
         display1.setText("0");; //While holding the addition operation in the first TextField, this code writes the number 0 in the second TextField.
         display2.setText(String.valueOf(ina) + " * "); //This code commands to display the "*" operation in TextField.
         op = 3;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_multplyActionPerformed
    // This code was added in order to division numbers.
    private void divideActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_divideActionPerformed
        //the condition in an if statement is a Boolean expression which evaluates to either true or false
        if(op ==0){
            ina =Double.parseDouble(String.valueOf(display1.getText())); // this code indicates the first addition on the TextField.
        }
        //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.
        else{
              inb =Double.parseDouble(String.valueOf(display1.getText())); //this code indicates the second addition on the TextField
        }
        if( op == 1 ){
            ina = ina + inb; // This code was added in order to sum numbers.
        }
         if( op == 2 ){
            ina = ina - inb; // This code was added in order to subtract numbers.
        }
         if( op == 3 ){
            ina = ina * inb; // This code has been added to multiply numbers.
        }
         if( op == 4 ){
            ina = ina / inb; // This code has been added to divide numbers.
        }
         if( op == 5 ){
            ina = ina * inb / 100; // This code was added to find the percentage of numbers.
        }
         display1.setText("0");; //While holding the addition operation in the first TextField, this code writes the number 0 in the second TextField.
         display2.setText(String.valueOf(ina) + " / "); //This code commands to display the "/" operation in TextField.
         op = 4;
         decdisp = false;
         zerodisp = false;
    }//GEN-LAST:event_divideActionPerformed
    // This is Equals button in order to show the result on the screen.
    private void equalsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_equalsActionPerformed
      inb =Double.parseDouble(String.valueOf(display1.getText())); // This code indicates the equality on the TextField.
      if( op == 0){
          out = inb;
          display2.setText(String.valueOf(inb)); // This code indicates the equality on the TextField.
      }
      if( op == 1){
          out = ina + inb;
          display2.setText(display2.getText() + String.valueOf(inb)); // This code indicates the sum on the TextField.
      }
      if( op == 2){
          out = ina - inb;
          display2.setText(display2.getText() + String.valueOf(inb)); // This code indicates difference on the TextField.
      }
      if( op == 3){
          out = ina * inb;
          display2.setText(display2.getText() + String.valueOf(inb)); // This code indicates product on the TextField.
      }
      if( op == 4){
          out = ina / inb;
          display2.setText(display2.getText() + String.valueOf(inb)); // This code indicates quotient on the TextField.
      }
      if( op == 5){
          out = ina + inb / 100;
          display2.setText(display2.getText() + String.valueOf(inb) + ")"); // This code indicates percentage on the TextField.
      }
      //the condition in an if statement is a Boolean expression which evaluates to either true or false  
      if( out > -100000000 && out < 100000000 ){ // If the expression matches the condition specified in parentheses, this code will calculate and the answer will be displayed in TextField
           display1.setText(String.valueOf(out));
       }
      //an else statement is an alternative statement that is executed if the result of a previous test condition evaluates to false.
       else{
              display1.setText("Error"); // If the condition is not correct, it will show "ERROR" message.
       }
        ina = 0;
        inb = 0;
        out = 0;
        decdisp = false;
        zerodisp = false;
    }//GEN-LAST:event_equalsActionPerformed

    private void jCDistance1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jCDistance1ActionPerformed
    /* ComboBox is represented by this code. 
                This code was added so that whether you're looking for a speed, time, or distance, 
                                you may first select the one you're looking for in the ComboBox.*/       
    }//GEN-LAST:event_jCDistance1ActionPerformed

    private void jtxtEnter4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEnter4ActionPerformed
    //I added this TextField to enter the speed, time or distance, depending on the selected element in the ComboBox.
    }//GEN-LAST:event_jtxtEnter4ActionPerformed

    private void jlblResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblResultActionPerformed
    // this text field shows the response of the speed or time or distance, depending on the selected element in the ComboBox.
    }//GEN-LAST:event_jlblResultActionPerformed

    private void jtxtEnter3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jtxtEnter3ActionPerformed
    //I added this TextField to enter the speed, time or distance, depending on the selected element in the ComboBox.
    }//GEN-LAST:event_jtxtEnter3ActionPerformed

    private void jlblDisplay4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblDisplay4ActionPerformed
    // This TextField displays the calculation based on the selected element in the ComboBox
    }//GEN-LAST:event_jlblDisplay4ActionPerformed

    private void jlblDisplay3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblDisplay3ActionPerformed
    // This TextField displays the calculation based on the selected element in the ComboBox
    }//GEN-LAST:event_jlblDisplay3ActionPerformed

    private void jlblDisplay5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jlblDisplay5ActionPerformed
    // This TextField displays the calculation based on the selected element in the ComboBox
    }//GEN-LAST:event_jlblDisplay5ActionPerformed

    // This button calculates for "time, speed, distance" issues.
    private void ConvertActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConvertActionPerformed
        
    //the condition in an if statement is a Boolean expression which evaluates to either true or false
        if ((jtxtEnter3.getText().equals("")) && (jtxtEnter4.getText().equals(""))) /*This code is intended to display a message to the user 
                                                                                    when it is run without entering a number in TextField.*/
            {
        //This code is given to show to the user the message inside the brackets when it is run without entering a number in TextField.
        JOptionPane.showMessageDialog(null,"You must enter value to compute", "DST System", JOptionPane.INFORMATION_MESSAGE);           
            } 
        
      //this code is applied after selecting the Distance in the ComboBox in order to find the Distance  
      else if(jCDistance1.getSelectedItem().equals("Distance")) 
      { 
          double dst1 = Double.parseDouble(jtxtEnter3.getText()); //this code shows the time or speed to find the distance. 
          double dst2 = Double.parseDouble(jtxtEnter4.getText()); //this code shows the time or speed to find the distance.
          double dst3; // This code shows the distance.
          
          jlblDisplay4.setText("Distance = "); //this setText, a TextField named jlblDisplay4 also shows the expression inside the brackets.
          jlblDisplay3.setText("Speed *"); //this setText, a TextField named jlblDisplay3 also shows the expression inside the brackets
          jlblDisplay5.setText("Time"); //this setText, a TextField named jlblDisplay5 also shows the expression inside the brackets
          dst3 = dst1 * dst2; // This code multiplies the speed to time in order to find the distance.
          String value = String.format("%.2f", dst3); // This code calculates the dst3 operation. 
          jlblResult.setText(value); // This code shows the result on the TextField.
      }
      
       
     
        

    //the condition in an if statement is a Boolean expression which evaluates to either true or false     
          if ((jtxtEnter3.getText().equals("")) && (jtxtEnter4.getText().equals(""))) /*This code is intended to display a message to the user 
                                                                                      when it is run without entering a number in TextField.*/
            { 
        //This code is given to show to the user the message inside the brackets when it is run without entering a number in TextField.        
        JOptionPane.showMessageDialog(null,"You must enter value to compute", "DST System", JOptionPane.INFORMATION_MESSAGE); 
            }
          
      //this code is applied after selecting the Speed in the ComboBox in order to find the Speed   
      else if(jCDistance1.getSelectedItem().equals("Speed")) 
      {  
          double speed1 = Double.parseDouble(jtxtEnter3.getText()); //this code shows the time or distance to find the speed.
          double speed2 = Double.parseDouble(jtxtEnter4.getText()); //this code shows the time or distance to find the speed.
          double speed3; // This code shows the speed.
          
          jlblDisplay4.setText("Speed = "); //this setText, a TextField named jlblDisplay4 also shows the expression inside the brackets.
          jlblDisplay3.setText("Distance /"); //this setText, a TextField named jlblDisplay3 also shows the expression inside the brackets.
          jlblDisplay5.setText("Time"); //this setText, a TextField named jlblDisplay5 also shows the expression inside the brackets.
          speed3 = speed1 / speed2; //In order to calculate speed, this code divided time by distance.
          String speedvalue = String.format("%.2f", speed3); // This code calculates the speed3 operation. 
          jlblResult.setText(speedvalue); // This code shows the result on the TextField.
      }
         
        //the condition in an if statement is a Boolean expression which evaluates to either true or false 
          if ((jtxtEnter3.getText().equals("")) && (jtxtEnter4.getText().equals(""))) /*This code is intended to display a message to the user 
                                                                                      when it is run without entering a number in TextField.*/
              
            { 
        //This code is given to show to the user the message inside the brackets when it is run without entering a number in TextField.            
        JOptionPane.showMessageDialog(null,"You must enter value to compute", 
                "DST System", JOptionPane.INFORMATION_MESSAGE); 
            }
      //this code is applied after selecting the Time in the ComboBox in order to find the Time  
      else if(jCDistance1.getSelectedItem().equals("Time")) 
      {  
          double time1 = Double.parseDouble(jtxtEnter3.getText()); //this code shows the speed or distance to find the time.
          double time2 = Double.parseDouble(jtxtEnter4.getText()); //this code shows the speed or distance to find the time.
          double time3; // This code shows the time.
          
          jlblDisplay4.setText("Time = "); //this setText, a TextField named jlblDisplay4 also shows the expression inside the brackets.
          jlblDisplay3.setText("Distance /"); //this setText, a TextField named jlblDisplay3 also shows the expression inside the brackets.
          jlblDisplay5.setText("Speed"); //this setText, a TextField named jlblDisplay5 also shows the expression inside the brackets.
          time3 = time1 / time2; //In order to calculate time, this code divided speed by distance.
          String timevalue = String.format("%.2f", time3); // This code calculates the time3 operation. 
          jlblResult.setText(timevalue); // This code shows the result on the TextField.
      }
         
    }//GEN-LAST:event_ConvertActionPerformed
        // This is a reset button that removes all SetTexts.
    private void ResetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ResetActionPerformed
       
        jlblResult.setText(null); //This code clears setText(jlblResult)
        jlblDisplay3.setText(null);//This code clears setText(jlblDisplay3)
        jlblDisplay4.setText(null);//This code clears setText(jlblDisplay4)
        jlblDisplay5.setText(null);//This code clears setText(jlblDisplay5)
        jtxtEnter3.setText(null);//This code clears setText(jtxtEnter3)
        jtxtEnter4.setText(null);//This code clears setText(jtxtEnter4)
        jCDistance1.getSelectedItem().equals("Select an option");////This code clears ComboBox
        
    }//GEN-LAST:event_ResetActionPerformed

    private void jTextField1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jTextField1ActionPerformed
    // Memorized operations are shown in this text verb
    private void memorydisplayActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_memorydisplayActionPerformed
    //The operations recorded in memory are cleared, memorized, and presented on the screen in this textfield thanks to this code.
    }//GEN-LAST:event_memorydisplayActionPerformed
   
    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ScientificCalculatorbyRahim().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton Convert;
    private javax.swing.JButton Reset;
    private javax.swing.JButton add;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton clear;
    private javax.swing.JButton cos;
    private javax.swing.JButton cubed;
    private javax.swing.JButton cuberoot;
    private javax.swing.JButton decpoint;
    private javax.swing.JRadioButton degrees;
    private javax.swing.JTextField display1;
    private javax.swing.JTextField display2;
    private javax.swing.JButton divide;
    private javax.swing.JButton eight;
    private javax.swing.JButton equals;
    private javax.swing.JButton five;
    private javax.swing.JButton four;
    private javax.swing.JComboBox<String> jCDistance1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jlblDisplay3;
    private javax.swing.JTextField jlblDisplay4;
    private javax.swing.JTextField jlblDisplay5;
    private javax.swing.JTextField jlblResult;
    private javax.swing.JTextField jtxtEnter3;
    private javax.swing.JTextField jtxtEnter4;
    private javax.swing.JButton memoryclear;
    private javax.swing.JTextField memorydisplay;
    private javax.swing.JButton memoryread;
    private javax.swing.JButton memorysave;
    private javax.swing.JButton multply;
    private javax.swing.JButton negate;
    private javax.swing.JButton nine;
    private javax.swing.JButton one;
    private javax.swing.JButton onedividedbyx;
    private javax.swing.JButton percent;
    private javax.swing.JButton pi;
    private javax.swing.JRadioButton radians;
    private javax.swing.JButton reset;
    private javax.swing.JButton seven;
    private javax.swing.JToggleButton shift;
    private javax.swing.JButton sin;
    private javax.swing.JButton six;
    private javax.swing.JButton squared;
    private javax.swing.JButton squareroot;
    private javax.swing.JButton subtract;
    private javax.swing.JButton tan;
    private javax.swing.JButton three;
    private javax.swing.JButton two;
    private javax.swing.JButton zero;
    // End of variables declaration//GEN-END:variables
}
