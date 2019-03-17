/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;

import java.awt.Color;
import java.util.Random;

/**
 *
 * @author Vaibhav
 */
public class ticTacToe extends javax.swing.JFrame
{
    int x_or_o=0,k=0;
    /**
     * Creates new form NewJFrame
     */
    
    public void computerwin()
    {
        start.setSelected(false);
        start.setText("X WINS");
    }
    
    public boolean defence()
    {
        if((b00.getText().equals("O") && b01.getText().equals("O") && b02.getText().equals("")) || (b22.getText().equals("O") && b12.getText().equals("O") && b02.getText().equals("")) || (b20.getText().equals("O") && b11.getText().equals("O") && b02.getText().equals("")))
        {
            b02.setText("X");
            b02.setForeground(Color.blue);
            result();
            return true;
        }
        else if((b01.getText().equals("O") && b02.getText().equals("O") && b00.getText().equals("")) || (b10.getText().equals("O") && b20.getText().equals("O") && b00.getText().equals("")) || (b22.getText().equals("O") && b11.getText().equals("O") && b00.getText().equals("")))
        {
            b00.setText("X");
            b00.setForeground(Color.blue);
            result();
            return true;
        }
        else if((b21.getText().equals("O") && b22.getText().equals("O") && b20.getText().equals("")) || (b10.getText().equals("O") && b00.getText().equals("O") && b20.getText().equals("")) || (b02.getText().equals("O") && b11.getText().equals("O") && b20.getText().equals("")))
        {
            b20.setText("X");
            b20.setForeground(Color.blue);
            result();
            return true;
        }
        else if((b20.getText().equals("O") && b21.getText().equals("O") && b22.getText().equals("")) || (b12.getText().equals("O") && b02.getText().equals("O") && b22.getText().equals("")) || (b00.getText().equals("O") && b11.getText().equals("O") && b22.getText().equals("")))
        {
            b22.setText("X");
            b22.setForeground(Color.blue);
            result();
            return true;
        }
        else if((b22.getText().equals("O") && b00.getText().equals("O") && b11.getText().equals("")) || (b20.getText().equals("O") && b02.getText().equals("O") && b11.getText().equals("")) || (b10.getText().equals("O") && b12.getText().equals("O") && b11.getText().equals("")) || (b01.getText().equals("O") && b21.getText().equals("O") && b11.getText().equals("")))
        {
            b11.setText("X");
            b11.setForeground(Color.blue);
            result();
            return true;
        }
        else if((b00.getText().equals("O") && b02.getText().equals("O") && b01.getText().equals("")) || (b11.getText().equals("O") && b21.getText().equals("O") && b01.getText().equals("")))
        {
            b01.setText("X");
            b01.setForeground(Color.blue);
            result();
            return true;
        }
        else if((b10.getText().equals("O") && b11.getText().equals("O") && b12.getText().equals("")) || (b02.getText().equals("O") && b22.getText().equals("O") && b12.getText().equals("")))
        {
            b12.setText("X");
            b12.setForeground(Color.blue);
            result();
            return true;
        }
        else if((b20.getText().equals("O") && b22.getText().equals("O") && b21.getText().equals("")) || (b01.getText().equals("O") && b11.getText().equals("O") && b21.getText().equals("")))
        {
            b21.setText("X");
            b21.setForeground(Color.blue);
            result();
            return true;
        }
        else if((b00.getText().equals("O") && b20.getText().equals("O") && b10.getText().equals("")) || (b11.getText().equals("O") && b12.getText().equals("O") && b10.getText().equals("")))
        {
            b10.setText("X");
            b10.setForeground(Color.blue);
            result();
            return true;
        }
        else
            return false;
    }
    
    public boolean offence()
    {
        if((b00.getText().equals("X") && b01.getText().equals("X") && b02.getText().equals("")) || (b22.getText().equals("X") && b12.getText().equals("X") && b02.getText().equals("")) || (b20.getText().equals("X") && b11.getText().equals("X") && b02.getText().equals("")))
        {
            b02.setText("X");
            b02.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else if((b01.getText().equals("X") && b02.getText().equals("X") && b00.getText().equals("")) || (b10.getText().equals("X") && b20.getText().equals("X") && b00.getText().equals("")) || (b22.getText().equals("X") && b11.getText().equals("X") && b00.getText().equals("")))
        {
            b00.setText("X");
            b00.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else if((b21.getText().equals("X") && b22.getText().equals("X") && b20.getText().equals("")) || (b10.getText().equals("X") && b00.getText().equals("X") && b20.getText().equals("")) || (b02.getText().equals("X") && b11.getText().equals("X") && b20.getText().equals("")))
        {
            b20.setText("X");
            b20.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else if((b20.getText().equals("X") && b21.getText().equals("X") && b22.getText().equals("")) || (b12.getText().equals("X") && b02.getText().equals("X") && b22.getText().equals("")) || (b00.getText().equals("X") && b11.getText().equals("X") && b22.getText().equals("")))
        {
            b22.setText("X");
            b22.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else if((b22.getText().equals("X") && b00.getText().equals("X") && b11.getText().equals("")) || (b20.getText().equals("X") && b02.getText().equals("X") && b11.getText().equals("")) || (b10.getText().equals("X") && b12.getText().equals("X") && b11.getText().equals("")) || (b01.getText().equals("X") && b21.getText().equals("X") && b11.getText().equals("")))
        {
            b11.setText("X");
            b11.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else if((b00.getText().equals("X") && b02.getText().equals("X") && b01.getText().equals("")) || (b11.getText().equals("X") && b21.getText().equals("X") && b01.getText().equals("")))
        {
            b01.setText("X");
            b01.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else if((b10.getText().equals("X") && b11.getText().equals("X") && b12.getText().equals("")) || (b02.getText().equals("X") && b22.getText().equals("X") && b12.getText().equals("")))
        {
            b12.setText("X");
            b12.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else if((b20.getText().equals("X") && b22.getText().equals("X") && b21.getText().equals("")) || (b01.getText().equals("X") && b11.getText().equals("X") && b21.getText().equals("")))
        {
            b21.setText("X");
            b21.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else if((b00.getText().equals("X") && b20.getText().equals("X") && b10.getText().equals("")) || (b11.getText().equals("X") && b12.getText().equals("X") && b10.getText().equals("")))
        {
            b10.setText("X");
            b10.setForeground(Color.blue);
            computerwin();
            return true;
        }
        else
            return false;
    }
    
    public void nooffence()
    {
        if(b00.getText().equals(""))
        {
            b00.setText("X");
            b00.setForeground(Color.blue);
            result();
        }
        else if(b01.getText().equals(""))
        {
            b01.setText("X");
            b01.setForeground(Color.blue);
            result();
        }
        else if(b02.getText().equals(""))
        {
            b02.setText("X");
            b02.setForeground(Color.blue);
            result();
        }
        else if(b10.getText().equals(""))
        {
            b10.setText("X");
            b10.setForeground(Color.blue);
            result();
        }
        else if(b11.getText().equals(""))
        {
            b11.setText("X");
            b11.setForeground(Color.blue);
            result();
        }
        else if(b12.getText().equals(""))
        {
            b12.setText("X");
            b12.setForeground(Color.blue);
            result();
        }
        else if(b20.getText().equals(""))
        {
            b20.setText("X");
            b20.setForeground(Color.blue);
            result();
        }
        else if(b21.getText().equals(""))
        {
            b21.setText("X");
            b21.setForeground(Color.blue);
            result();
        }
        else if(b22.getText().equals(""))
        {
            b22.setText("X");
            b22.setForeground(Color.blue);
            result();
        }
        ++x_or_o;
    }
    
    public void move()
    {
        //<editor-fold defaultstate="collapsed" desc="second move">
        if(x_or_o == 1)
        {
            if(b11.getText().equals(""))
            {
                b11.setText("X");
                b11.setForeground(Color.blue);
                ++x_or_o;
            }
            else
            {
                Random ran = new Random();
                int f = ran.nextInt(4)+1;
                if(f==0)
                {
                    b00.setText("X");
                    b00.setForeground(Color.blue);
                }
                else if(f==1)
                {
                    b02.setText("X");
                    b02.setForeground(Color.blue);
                }
                else if(f==2)
                {
                    b20.setText("X");
                    b20.setForeground(Color.blue);
                }
                else
                {
                    b22.setText("X");
                    b22.setForeground(Color.blue);
                }
                ++x_or_o;
            }
        }
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="fourth move">
        if(x_or_o==3)
        {
            if(defence())
                ++x_or_o;
            else
            {
                nooffence();
            }
        }
//</editor-fold>
        
        //<editor-fold defaultstate="collapsed" desc="sixth, eighth move">
        if(x_or_o==5 || x_or_o==7)
        {
            if(offence())
            {
                ++x_or_o;
            }
            else
            {
                if(defence())
                {
                    ++x_or_o;
                }
                else
                {
                    nooffence();
                }
            }
        }
//</editor-fold>
                           
    }
    
    public void result()
    {
        if(!b00.getText().equals("") && b00.getText().equals(b01.getText()) && b00.getText().equals(b02.getText())){
            start.setSelected(false);
            start.setText(b00.getText() + " WINS");
        }
        else if(!b10.getText().equals("") && b10.getText().equals(b11.getText()) && b10.getText().equals(b12.getText())){
            start.setSelected(false);
            start.setText(b10.getText() + " WINS");
        }
        else if(!b20.getText().equals("") && b20.getText().equals(b21.getText()) && b20.getText().equals(b22.getText())){
            start.setSelected(false);
            start.setText(b20.getText() + " WINS");            
        }
        else if(!b00.getText().equals("") && b00.getText().equals(b10.getText()) && b00.getText().equals(b20.getText())){
            start.setSelected(false);
            start.setText(b00.getText() + " WINS");            
        }
        else if(!b01.getText().equals("") && b01.getText().equals(b11.getText()) && b01.getText().equals(b21.getText())){
            start.setSelected(false);
            start.setText(b01.getText() + " WINS");            
        }
        else if(!b02.getText().equals("") && b02.getText().equals(b12.getText()) && b02.getText().equals(b22.getText())){
            start.setSelected(false);
            start.setText(b02.getText() + " WINS");            
        }
        else if(!b00.getText().equals("") && b00.getText().equals(b11.getText()) && b00.getText().equals(b22.getText())){
            start.setSelected(false);
            start.setText(b00.getText() + " WINS");            
        }
        else if(!b20.getText().equals("") && b20.getText().equals(b11.getText()) && b20.getText().equals(b02.getText())){
            start.setSelected(false);
            start.setText(b20.getText() + " WINS");            
        }    
        else if(x_or_o==9)
        {
            start.setSelected(false);
            start.setText("DRAW");
        }
    }
    
    
    public ticTacToe() 
    {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {
        bindingGroup = new org.jdesktop.beansbinding.BindingGroup();

        select = new javax.swing.JDialog();
        jPanel3 = new javax.swing.JPanel();
        oneplayer = new javax.swing.JButton();
        twoplayer = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        b00 = new javax.swing.JButton();
        b01 = new javax.swing.JButton();
        b02 = new javax.swing.JButton();
        b22 = new javax.swing.JButton();
        b11 = new javax.swing.JButton();
        b12 = new javax.swing.JButton();
        b21 = new javax.swing.JButton();
        b20 = new javax.swing.JButton();
        b10 = new javax.swing.JButton();
        start = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        reset = new javax.swing.JButton();

        select.setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        select.setBackground(new java.awt.Color(204, 255, 255));
        select.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        select.setLocation(new java.awt.Point(300, 250));
        select.setMinimumSize(new java.awt.Dimension(359, 160));
        select.setPreferredSize(new java.awt.Dimension(359, 140));

        org.jdesktop.beansbinding.Binding binding = org.jdesktop.beansbinding.Bindings.createAutoBinding(org.jdesktop.beansbinding.AutoBinding.UpdateStrategy.READ_WRITE, start, org.jdesktop.beansbinding.ELProperty.create("select"), select, org.jdesktop.beansbinding.BeanProperty.create("title"));
        bindingGroup.addBinding(binding);

        oneplayer.setBackground(new java.awt.Color(51, 153, 255));
        oneplayer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        oneplayer.setText("1-PLAYER");
        oneplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                oneplayerActionPerformed(evt);
            }
        });

        twoplayer.setBackground(new java.awt.Color(51, 153, 255));
        twoplayer.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        twoplayer.setText("2-PLAYERS");
        twoplayer.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                twoplayerActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 153, 255));
        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 24)); // NOI18N
        jLabel1.setText("SELECT YOUR CHOICE");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(oneplayer)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(twoplayer)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(31, 31, 31)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(16, 16, 16)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(oneplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(twoplayer, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        javax.swing.GroupLayout selectLayout = new javax.swing.GroupLayout(select.getContentPane());
        select.getContentPane().setLayout(selectLayout);
        selectLayout.setHorizontalGroup(
            selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, selectLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        selectLayout.setVerticalGroup(
            selectLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(selectLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        b00.setBackground(new java.awt.Color(0, 102, 102));
        b00.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b00.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b00ActionPerformed(evt);
            }
        });

        b01.setBackground(new java.awt.Color(0, 102, 102));
        b01.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b01.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b01ActionPerformed(evt);
            }
        });

        b02.setBackground(new java.awt.Color(0, 102, 102));
        b02.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b02.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b02ActionPerformed(evt);
            }
        });

        b22.setBackground(new java.awt.Color(0, 102, 102));
        b22.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b22.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b22ActionPerformed(evt);
            }
        });

        b11.setBackground(new java.awt.Color(0, 102, 102));
        b11.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b11.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b11ActionPerformed(evt);
            }
        });

        b12.setBackground(new java.awt.Color(0, 102, 102));
        b12.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b12.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b12ActionPerformed(evt);
            }
        });

        b21.setBackground(new java.awt.Color(0, 102, 102));
        b21.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b21.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b21ActionPerformed(evt);
            }
        });

        b20.setBackground(new java.awt.Color(0, 102, 102));
        b20.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b20.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b20ActionPerformed(evt);
            }
        });

        b10.setBackground(new java.awt.Color(0, 102, 102));
        b10.setFont(new java.awt.Font("Tahoma", 1, 36)); // NOI18N
        b10.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                b10ActionPerformed(evt);
            }
        });

        start.setBackground(new java.awt.Color(0, 204, 0));
        start.setFont(new java.awt.Font("Times New Roman", 2, 24)); // NOI18N
        start.setText("START THE GAME");
        start.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                startActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(jPanel1Layout.createSequentialGroup()
                            .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                            .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 81, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 262, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(start, javax.swing.GroupLayout.PREFERRED_SIZE, 62, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 20, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b02, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b01, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b00, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b12, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b11, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b10, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(b22, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b21, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(b20, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        reset.setBackground(new java.awt.Color(51, 51, 255));
        reset.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        reset.setText("RESET");
        reset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                resetActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 146, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(reset, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        bindingGroup.bind();

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void b00ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b00ActionPerformed
    if(b00.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0){
            b00.setText("X");
            b00.setForeground(Color.blue);
        }
        else{
            b00.setText("O");
            b00.setForeground(Color.red);
        }
        ++x_or_o;
        result();
    }
    if(b00.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b00.setText("O");
        b00.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }           // TODO add your handling code here:
    }//GEN-LAST:event_b00ActionPerformed

    private void b01ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b01ActionPerformed
    if(b01.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0)
        {
            b01.setText("X");
            b01.setForeground(Color.blue);
        }
        else
        {
            b01.setText("O");
            b01.setForeground(Color.red);
        }
        ++x_or_o;
        result();
    }    
    if(b01.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b01.setText("O");
        b01.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_b01ActionPerformed

    private void b02ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b02ActionPerformed
    if(b02.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0)
        {
            b02.setText("X");
            b02.setForeground(Color.blue);
        }
        else{
            b02.setText("O");
            b02.setForeground(Color.red);
        }
        ++x_or_o;
        result();
    }    
    if(b02.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b02.setText("O");
        b02.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }
        // TODO add your handling code here:
    }//GEN-LAST:event_b02ActionPerformed

    private void b10ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b10ActionPerformed
    if(b10.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0){
            b10.setText("X");
            b10.setForeground(Color.blue);
        }
        else{
            b10.setText("O");
            b10.setForeground(Color.red);
        }
        ++x_or_o;        
        result();
    }
    if(b10.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b10.setText("O");
        b10.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }
// TODO add your handling code here:
    }//GEN-LAST:event_b10ActionPerformed

    private void b11ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b11ActionPerformed
    if(b11.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0){
            b11.setText("X");
            b11.setForeground(Color.blue);
        }
        else{
            b11.setText("O");
            b11.setForeground(Color.red);
        }
        ++x_or_o;
        result();
    }
    if(b11.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b11.setText("O");
        b11.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }
// TODO add your handling code here:
    }//GEN-LAST:event_b11ActionPerformed

    private void b12ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b12ActionPerformed
    if(b12.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0){
            b12.setText("X");
            b12.setForeground(Color.blue);
        }
        else{
            b12.setText("O");
            b12.setForeground(Color.red);
        }
        ++x_or_o;
        result();
    }
    if(b12.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b12.setText("O");
        b12.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }
// TODO add your handling code here:
    }//GEN-LAST:event_b12ActionPerformed

    private void b22ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b22ActionPerformed
    if(b22.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0){
            b22.setText("X");
            b22.setForeground(Color.blue);
        }
        else{
            b22.setText("O");
            b22.setForeground(Color.red);
        }
        ++x_or_o;
        result();
    }
    if(b22.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b22.setText("O");
        b22.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }
// TODO add your handling code here:
    }//GEN-LAST:event_b22ActionPerformed

    private void b21ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b21ActionPerformed
    if(b21.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0){
            b21.setText("X");
            b21.setForeground(Color.blue);
        }
        else{
            b21.setText("O");
            b21.setForeground(Color.red);
        }
        ++x_or_o;
        result();
    }
    if(b21.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b21.setText("O");
        b21.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }
// TODO add your handling code here:
    }//GEN-LAST:event_b21ActionPerformed

    private void b20ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_b20ActionPerformed
    if(b20.getText().equals("") && start.isSelected() && k==2)
    {
        if(x_or_o%2==0){
            b20.setText("X");
            b20.setForeground(Color.blue);
        }
        else{
            b20.setText("O");
            b20.setForeground(Color.red);
        }
        ++x_or_o;
        result();
    }
    if(b20.getText().equals("") && start.isSelected() && k==1 && x_or_o%2==0 && x_or_o<=8)
    {
        b20.setText("O");
        b20.setForeground(Color.red);
        ++x_or_o;
        result();
        if(start.isSelected())
        move();
    }
// TODO add your handling code here:
    }//GEN-LAST:event_b20ActionPerformed

    private void resetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_resetActionPerformed

        x_or_o=0;
        k=0;
        start.setSelected(false);
        b01.setText("");
        b21.setText("");
        b10.setText("");
        b12.setText("");
        b02.setText("");
        b22.setText("");
        b20.setText("");
        b00.setText("");
        b11.setText("");
        start.setText("START THE GAME");
// TODO add your handling code here:
    }//GEN-LAST:event_resetActionPerformed

    private void startActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_startActionPerformed

        if(start.isSelected() && start.getText().equals("START THE GAME"))
            select.setVisible(true);
        if(!start.isSelected())
            start.setSelected(true);
        
// TODO add your handling code here:
    }//GEN-LAST:event_startActionPerformed

    private void oneplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_oneplayerActionPerformed

        select.setVisible(false);
        k=1;
        // TODO add your handling code here:
    }//GEN-LAST:event_oneplayerActionPerformed

    private void twoplayerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_twoplayerActionPerformed

        select.setVisible(false);
        k=2;
        // TODO add your handling code here:
    }//GEN-LAST:event_twoplayerActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) 
    {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ticTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ticTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ticTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ticTacToe.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater
        (new Runnable() 
        {
            public void run() {
                new ticTacToe().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton b00;
    private javax.swing.JButton b01;
    private javax.swing.JButton b02;
    private javax.swing.JButton b10;
    private javax.swing.JButton b11;
    private javax.swing.JButton b12;
    private javax.swing.JButton b20;
    private javax.swing.JButton b21;
    private javax.swing.JButton b22;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JButton oneplayer;
    private javax.swing.JButton reset;
    private javax.swing.JDialog select;
    private javax.swing.JToggleButton start;
    private javax.swing.JButton twoplayer;
    private org.jdesktop.beansbinding.BindingGroup bindingGroup;
    // End of variables declaration//GEN-END:variables

}
