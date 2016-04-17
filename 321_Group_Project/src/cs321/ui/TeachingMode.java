/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cs321.ui;

import java.awt.Color;
import java.awt.Font;
import java.io.*;
import java.util.ArrayList;
import cs321.other.*;
import java.util.Arrays;
import javax.swing.JOptionPane;

/**
 *
 * @author Joshua
 */
public class TeachingMode extends javax.swing.JFrame {

    /**
     * Set's this instances reference to a SettingsConfigurator instance.
     *
     * @param s Reference to a SettingsConfigurator instance.
     */
    protected void setSettingsInstance(SettingsConfigurator s) {
        settings = s;
    }

    /**
     * Creates new form TeachingMode
     */
    private TeachingMode() {
        initComponents();
    }

    /**
     * Get a reference to the instance of TeachingMode.
     *
     * @return Reverence to the instance of TeachingMode.
     */
    public static TeachingMode getInstance() {
        if (instance == null) {
            instance = new TeachingMode();
        }
        return instance;
    }

    /**
     * setAssignment will configure teachingMode with the passed in assignment.
     *
     * @param a is an Assignment object that will be used for teachingMode.
     */
    public void setAssignment(Assignment a) {
        currentAssignment = a;

        // Clear the instructions textArea
        instructionTextArea.setText("");
        for (String tempLine : currentAssignment.getInstruction()) {
            instructionTextArea.append(tempLine);
        }

        // Clear the sampleCode textArea
        sampleCodeTextArea.setText("");
        for (String tempLine : currentAssignment.getMasterCode()) {
            sampleCodeTextArea.append(tempLine);
        }

        // Clear the tpyedCode textArea
        typedCodeTextArea.setText("");

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        instructionScrollPane = new javax.swing.JScrollPane();
        instructionTextArea = new javax.swing.JTextArea();
        sampleCodeScrollPane = new javax.swing.JScrollPane();
        sampleCodeTextArea = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        SubmitButton = new javax.swing.JButton();
        ExitMainMenuButton = new javax.swing.JButton();
        typedCodeScrollPane = new javax.swing.JScrollPane();
        typedCodeTextArea = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        fileMenu = new javax.swing.JMenu();
        ExitToMainMenuMenutItem = new javax.swing.JMenuItem();
        ExitMenuItem = new javax.swing.JMenuItem();
        editMenu = new javax.swing.JMenu();
        SettingsMenuItem = new javax.swing.JMenuItem();
        helpMenu = new javax.swing.JMenu();
        AboutMenuItem = new javax.swing.JMenuItem();

        instructionTextArea.setEditable(false);
        instructionTextArea.setColumns(20);
        instructionTextArea.setRows(5);
        instructionTextArea.setTabSize(4);
        instructionTextArea.setText("In Java you declare a variable by typing a variable type, and then a name for that \nvariable. The primitive data types are bool, int, short, long, float.\nYou would create an int by typing int and then a space and the name of a variable.\nExample:\nint x;");
        instructionScrollPane.setViewportView(instructionTextArea);

        sampleCodeScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        sampleCodeScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_NEVER);

        sampleCodeTextArea.setEditable(false);
        sampleCodeTextArea.setColumns(20);
        sampleCodeTextArea.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        sampleCodeTextArea.setRows(5);
        sampleCodeTextArea.setTabSize(4);
        sampleCodeTextArea.setText("1234567892123456789312345678941234567895123456789612345678971234567898000000000000000000000000000000000000000000000000000\n2        0         0         0         0         0         0         0\n3\n4\n5\n6\n7\n8\n9\n10\n1\n2\n3\n4\n5\n6\n7\n8\n9\n20\n1\n2\n3\n4\n5\n6\n7\n8\n9\n30");
        sampleCodeScrollPane.setViewportView(sampleCodeTextArea);

        jLabel1.setText("Code to enter:");

        SubmitButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        SubmitButton.setText("Submit");
        SubmitButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SubmitButtonActionPerformed(evt);
            }
        });

        ExitMainMenuButton.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N
        ExitMainMenuButton.setText("Exit to Main Menu");
        ExitMainMenuButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMainMenuButtonActionPerformed(evt);
            }
        });

        typedCodeScrollPane.setHorizontalScrollBarPolicy(javax.swing.ScrollPaneConstants.HORIZONTAL_SCROLLBAR_ALWAYS);
        typedCodeScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);

        typedCodeTextArea.setColumns(20);
        typedCodeTextArea.setFont(new java.awt.Font("Courier New", 0, 12)); // NOI18N
        typedCodeTextArea.setRows(5);
        typedCodeTextArea.setTabSize(4);
        typedCodeTextArea.setText("1234567892123456789312345678941234567895123456789612345678971234567898\n2        0         0         0         0         0         0         0\n3\n4\n5\n6\n7\n8\n9\n10\n1\n2\n3\n4\n5\n6\n7\n8\n9\n20\n1\n2\n3\n4\n5\n6\n7\n8\n9\n30");
        typedCodeScrollPane.setViewportView(typedCodeTextArea);

        jLabel2.setText("Enter code here:");

        fileMenu.setText("File");

        ExitToMainMenuMenutItem.setText("Exit to Main Menu");
        ExitToMainMenuMenutItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitToMainMenuMenutItemActionPerformed(evt);
            }
        });
        fileMenu.add(ExitToMainMenuMenutItem);

        ExitMenuItem.setText("Exit");
        ExitMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitMenuItemActionPerformed(evt);
            }
        });
        fileMenu.add(ExitMenuItem);

        jMenuBar1.add(fileMenu);

        editMenu.setText("Edit");

        SettingsMenuItem.setText("Settings");
        SettingsMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SettingsMenuItemActionPerformed(evt);
            }
        });
        editMenu.add(SettingsMenuItem);

        jMenuBar1.add(editMenu);

        helpMenu.setText("Help");

        AboutMenuItem.setText("About");
        AboutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AboutMenuItemActionPerformed(evt);
            }
        });
        helpMenu.add(AboutMenuItem);

        jMenuBar1.add(helpMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(instructionScrollPane)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(typedCodeScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 661, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(sampleCodeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 660, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 91, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(484, 484, 484)
                        .addComponent(ExitMainMenuButton)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addComponent(instructionScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(typedCodeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(sampleCodeScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 417, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 50, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ExitMainMenuButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SubmitButton, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        instructionScrollPane.setVerticalScrollBarPolicy(javax.swing.ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
        sampleCodeScrollPane.getVerticalScrollBar().setModel(typedCodeScrollPane.getVerticalScrollBar().getModel());

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ExitMainMenuButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMainMenuButtonActionPerformed
        // TODO add your handling code here:

        this.setVisible(false);


    }//GEN-LAST:event_ExitMainMenuButtonActionPerformed

    private void SubmitButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SubmitButtonActionPerformed
        // TODO add your handling code here:
        if (typedCodeTextArea.getText().equals(sampleCodeTextArea.getText())) {
            JOptionPane.showMessageDialog(rootPane, "Your typed code is correct!");
            exportCode();
        } else {
            // JOptionPane.showMessageDialog(rootPane, "Your typed code is incorrect. Please try again.");
        }
        
        // Send typed code back to ArrayList for typedCode
        moveTypedCodeBackToArrayList();
        
        // Check assignment with checker
//        Checker aChecker = new Checker(currentAssignment);
//        typedCodeTextArea = aChecker.checkAssignment();

        
    }//GEN-LAST:event_SubmitButtonActionPerformed

    private void ExitToMainMenuMenutItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitToMainMenuMenutItemActionPerformed
        // TODO add your handling code here:
        this.setVisible(false);
    }//GEN-LAST:event_ExitToMainMenuMenutItemActionPerformed

    private void ExitMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitMenuItemActionPerformed
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_ExitMenuItemActionPerformed

    private void SettingsMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_SettingsMenuItemActionPerformed
        // TODO add your handling code here:

        //Open Settings Menu
        settings.setVisible(true);
    }//GEN-LAST:event_SettingsMenuItemActionPerformed

    private void AboutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AboutMenuItemActionPerformed
        // TODO add your handling code here:
        aboutMenu.setVisible(true);
    }//GEN-LAST:event_AboutMenuItemActionPerformed

    /**
     * The main method of the class TeachingMode.
     *
     * @param args the command line arguments
     */
    public static void main(String args[]) {
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
            java.util.logging.Logger.getLogger(TeachingMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TeachingMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TeachingMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TeachingMode.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new TeachingMode().setVisible(true);
            }
        });
    }

    private void moveTypedCodeBackToArrayList() {
        String s[] = typedCodeTextArea.getText().split("\\r?\\n");
        for(int i = 0; i < s.length-1; i++) {
            s[i] = s[i] + "\n";
        }
        ArrayList<String> arrList = new ArrayList<>(Arrays.asList(s));
//        System.out.println(arrList);
//        System.out.println(currentAssignment.getMasterCode());
    }

    private void exportCode() {
        // Export the code

        // Get String containing the Class name of the code typed in.
        String filename = new String(JOptionPane.showInputDialog(
                "Enter the name of your classe. This is case sensitive!")
                + ".java");

        // Create a print writer for writing to the file
        try {
            PrintWriter out = new PrintWriter(new FileWriter(filename));

            // output tpyed code to file
//            for (String line : typedCode) {
//                out.println(line);
//            }
            out.println(typedCodeTextArea.getText());

            out.close();

        } catch (IOException e1) {
            System.out.println("Error during file writing.");
            e1.printStackTrace();
        }

    }

    /**
     * setFontOptions allows the fonts to be customized in the TeachingMode
     * window.
     *
     * @param font String containing the name of the font.
     * @param fontSize String containing the value of the size to display the
     * font.
     * @param textColor Color object that will set the color of the text.
     * <br>&nbsp;&nbsp;&nbsp;&nbsp;Possible colors are: White, Black, Red, Blue,
     * Green, and Purple
     * @param backgroundColor Color object that will set the color of the
     * background.
     * <br>&nbsp;&nbsp;&nbsp;&nbsp;Possible colors are: White, Black, Red, Blue,
     * Green, and Purple
     */
    protected void setFontOptions(String font, String fontSize, Color textColor,
            Color backgroundColor) {
        String fontDecode = font + '-' + fontSize;
        String fontDecodeCode = "Courier New-" + fontSize;

        // Set font properties of instructionTextArea
        instructionTextArea.setFont(Font.decode(fontDecode));
        instructionTextArea.setForeground(textColor);
        instructionTextArea.setBackground(backgroundColor);

        // Set font propterties of sampleCodeTextArea and typedCodeTextArea
        // Font will stay as Courier New
        sampleCodeTextArea.setFont(Font.decode(fontDecodeCode));
        typedCodeTextArea.setFont(Font.decode(fontDecodeCode));
        sampleCodeTextArea.setForeground(textColor);
        sampleCodeTextArea.setBackground(backgroundColor);
        typedCodeTextArea.setForeground(textColor);
        typedCodeTextArea.setBackground(backgroundColor);

    }


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem AboutMenuItem;
    private javax.swing.JButton ExitMainMenuButton;
    private javax.swing.JMenuItem ExitMenuItem;
    private javax.swing.JMenuItem ExitToMainMenuMenutItem;
    private javax.swing.JMenuItem SettingsMenuItem;
    private javax.swing.JButton SubmitButton;
    private javax.swing.JMenu editMenu;
    private javax.swing.JMenu fileMenu;
    private javax.swing.JMenu helpMenu;
    private javax.swing.JScrollPane instructionScrollPane;
    private javax.swing.JTextArea instructionTextArea;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JScrollPane sampleCodeScrollPane;
    private javax.swing.JTextArea sampleCodeTextArea;
    private javax.swing.JScrollPane typedCodeScrollPane;
    private javax.swing.JTextArea typedCodeTextArea;
    // End of variables declaration//GEN-END:variables

    // User Variables declaration
    private ArrayList<String> instructions;
    private ArrayList<String> typedCode;
    private ArrayList<String> masterCode;
    private static TeachingMode instance = null;
    private SettingsConfigurator settings;
    private About aboutMenu = About.getInstance();

    private Assignment currentAssignment;
}
