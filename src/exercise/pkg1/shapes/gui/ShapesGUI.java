package exercise.pkg1.shapes.gui;

/**
 *
 * @author clydemacabangon
 */
public class ShapesGUI extends javax.swing.JFrame {

    /**
     * Creates new form ShapesGUI
     */
    public ShapesGUI() {
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

        entry1 = new javax.swing.JTextField();
        createButton = new javax.swing.JButton();
        shapeComboBox = new javax.swing.JComboBox<>();
        entry2 = new javax.swing.JTextField();
        entryLabel1 = new javax.swing.JLabel();
        entryLabel2 = new javax.swing.JLabel();
        areaButton = new javax.swing.JButton();
        areaTextField = new javax.swing.JTextField();
        entryColor = new javax.swing.JTextField();
        colorLabel = new javax.swing.JLabel();
        shapeLabel = new javax.swing.JLabel();
        errorLabel = new javax.swing.JLabel();
        formulaLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        entry1.setSize(new java.awt.Dimension(75, 23));
        entry1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry1ActionPerformed(evt);
            }
        });

        createButton.setText("Create");
        createButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                createButtonActionPerformed(evt);
            }
        });

        shapeComboBox.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Rectangle", "Triangle" }));
        shapeComboBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                shapeComboBoxActionPerformed(evt);
            }
        });

        entry2.setSize(new java.awt.Dimension(75, 23));
        entry2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                entry2ActionPerformed(evt);
            }
        });

        entryLabel1.setText("Length (Integer)");

        entryLabel2.setText("Width (Integer)");

        areaButton.setText("Calculate Area");
        areaButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                areaButtonActionPerformed(evt);
            }
        });

        areaTextField.setEditable(false);
        areaTextField.setFocusable(false);

        colorLabel.setText("Color");

        shapeLabel.setText("Shape Type");

        errorLabel.setForeground(new java.awt.Color(255, 0, 51));
        errorLabel.setText("          ");

        formulaLabel.setText("Length * Width");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(entryLabel1)
                                    .addComponent(entry1, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createButton))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(errorLabel))
                            .addComponent(shapeLabel)
                            .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(3, 3, 3)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(entryLabel2)
                            .addComponent(entry2, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(colorLabel)
                            .addComponent(entryColor, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(formulaLabel)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(areaButton)))))
                .addContainerGap(53, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(22, 22, 22)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel)
                    .addComponent(shapeLabel))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(shapeComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entryColor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entryLabel1)
                    .addComponent(entryLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(entry1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(entry2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(createButton, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(errorLabel))
                .addGap(36, 36, 36)
                .addComponent(areaButton)
                .addGap(18, 18, 18)
                .addComponent(areaTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(formulaLabel)
                .addContainerGap(22, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void entry1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry1ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entry1ActionPerformed

    private void entry2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_entry2ActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_entry2ActionPerformed

    private void shapeComboBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_shapeComboBoxActionPerformed
        String s = (String)shapeComboBox.getSelectedItem();
        if(s.equals("Rectangle")){
            entryLabel1.setText("Length (Integer)");
            entryLabel2.setText("Width (Integer)");
            formulaLabel.setText("Length * Width");
        } else if(s.equals("Triangle")){
            entryLabel1.setText("Base (Double)");
            entryLabel2.setText("Height (Double)");
            formulaLabel.setText("1/2 * Base * Height");
        }
    }//GEN-LAST:event_shapeComboBoxActionPerformed

    private void areaButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_areaButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_areaButtonActionPerformed

    private void createButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_createButtonActionPerformed
        String s = (String)shapeComboBox.getSelectedItem();
        try{
            if(!entry1.getText().equals("") && !entry2.getText().equals("") && !entryColor.getText().equals("")){
                if(s.equals("Rectangle")){
                    String color = entryColor.getText();
                    int length = Integer.parseInt(entry1 .getText());
                    int width = Integer.parseInt(entry2.getText());
                    Rectangle box = new Rectangle(color, length, width);
                    areaTextField.setText(String.valueOf(box.getArea()));

                } else if(s.equals("Triangle")){
                    String color = entryColor.getText();
                    double base = Double.parseDouble(entry1.getText());
                    double height = Double.parseDouble(entry2.getText());
                    Triangle tri = new Triangle(color, base, height);
                    areaTextField.setText(String.valueOf(tri.getArea()));
                }
                errorLabel.setText("");
            } else {
                errorLabel.setText("Incomplete fields");
            }
        } catch(Exception e){
            errorLabel.setText("Invalid input");
        }
        
    }//GEN-LAST:event_createButtonActionPerformed

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
            java.util.logging.Logger.getLogger(ShapesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ShapesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ShapesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ShapesGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ShapesGUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton areaButton;
    private javax.swing.JTextField areaTextField;
    private javax.swing.JLabel colorLabel;
    private javax.swing.JButton createButton;
    private javax.swing.JTextField entry1;
    private javax.swing.JTextField entry2;
    private javax.swing.JTextField entryColor;
    private javax.swing.JLabel entryLabel1;
    private javax.swing.JLabel entryLabel2;
    private javax.swing.JLabel errorLabel;
    private javax.swing.JLabel formulaLabel;
    private javax.swing.JComboBox<String> shapeComboBox;
    private javax.swing.JLabel shapeLabel;
    // End of variables declaration//GEN-END:variables
}
