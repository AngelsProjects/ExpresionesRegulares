package expresionesregulares;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View extends javax.swing.JFrame {

    JFileChooser seleccionado = new JFileChooser();
    File archivo;
    File tokens;
    Archivos files = new Archivos();
    ArrayList<Ejemplos> contentFile;
    ArrayList<Tokens> contentToken;

    public View() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        groupTokens = new javax.swing.ButtonGroup();
        groupFile = new javax.swing.ButtonGroup();
        openFile = new javax.swing.JButton();
        pathFile = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        showResult = new javax.swing.JButton();
        df = new javax.swing.JRadioButton();
        cf = new javax.swing.JRadioButton();
        fileSearch = new javax.swing.JLabel();
        fileSearch1 = new javax.swing.JLabel();
        openToken = new javax.swing.JButton();
        pathToken = new javax.swing.JTextField();
        dt = new javax.swing.JRadioButton();
        ct = new javax.swing.JRadioButton();
        save = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        openFile.setText("Browse");
        openFile.setEnabled(false);
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });

        pathFile.setEnabled(false);
        pathFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathFileActionPerformed(evt);
            }
        });

        contenido.setEditable(false);
        contenido.setColumns(20);
        contenido.setRows(5);
        jScrollPane1.setViewportView(contenido);

        showResult.setText("Show");
        showResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultActionPerformed(evt);
            }
        });

        groupFile.add(df);
        df.setSelected(true);
        df.setText("Default");
        df.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfActionPerformed(evt);
            }
        });

        groupFile.add(cf);
        cf.setText("Custom");
        cf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfActionPerformed(evt);
            }
        });

        fileSearch.setText("File: ");

        fileSearch1.setText("Tokens: ");

        openToken.setText("Browse");
        openToken.setEnabled(false);
        openToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTokenActionPerformed(evt);
            }
        });

        pathToken.setEnabled(false);

        groupTokens.add(dt);
        dt.setSelected(true);
        dt.setText("Default");
        dt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtActionPerformed(evt);
            }
        });

        groupTokens.add(ct);
        ct.setText("Custom");
        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });

        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileSearch1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(dt)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(ct)
                        .addGap(30, 30, 30)
                        .addComponent(pathToken, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openToken))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(fileSearch)
                        .addGap(53, 53, 53)
                        .addComponent(df)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cf)
                        .addGap(30, 30, 30)
                        .addComponent(pathFile, javax.swing.GroupLayout.PREFERRED_SIZE, 172, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(openFile)))
                .addGap(77, 77, 77))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(65, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 513, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(62, 62, 62))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(showResult)
                        .addGap(90, 90, 90)
                        .addComponent(save)
                        .addGap(208, 208, 208))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(fileSearch1)
                    .addComponent(pathToken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openToken)
                    .addComponent(dt)
                    .addComponent(ct))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(openFile)
                    .addComponent(df)
                    .addComponent(cf)
                    .addComponent(fileSearch))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 310, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showResult)
                    .addComponent(save))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
public void proveToken() {
        if (dt.isSelected()) {
            pathToken.setEnabled(false);
            openToken.setEnabled(false);
        } else {
            pathToken.setEnabled(true);
            openToken.setEnabled(true);
        }
    }

    public void proveFile() {
        if (df.isSelected()) {
            pathFile.setEnabled(false);
            openFile.setEnabled(false);
        } else {
            pathFile.setEnabled(true);
            openFile.setEnabled(true);
        }
    }

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        if (seleccionado.showDialog(null, "Open File") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.canRead() && archivo.getName().endsWith("txt")) {
                pathFile.setText(seleccionado.getSelectedFile().getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "Please select a file text ");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a file text");
        }
    }//GEN-LAST:event_openFileActionPerformed

    private void showResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultActionPerformed
        contenido.setText(null);
        contentFile = new ArrayList<>();
        if (dt.isSelected()) {
            contentToken = files.OpenToken("src/recursos/Tokens.txt");
        } else if (pathToken.getText().endsWith("txt")) {
            if (files.canread(pathToken.getText())) {
                contentToken = files.OpenToken(pathToken.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Please write a correct path directory for token");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please first select a .txt file");
        }
        if (df.isSelected()) {
            contentFile = files.OpenFile("src/recursos/Entrada.txt");
            verificarTokens();
        } else if (pathFile.getText().endsWith("txt")) {

            if (files.canread(pathFile.getText())) {
                contentFile = files.OpenFile(pathFile.getText());
                verificarTokens();
            } else {
                JOptionPane.showMessageDialog(null, "Please write a correct path directory for file");
            }

        } else {
            JOptionPane.showMessageDialog(null, "Please first select a file");
        }
    }//GEN-LAST:event_showResultActionPerformed

    private void openTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTokenActionPerformed
        if (seleccionado.showDialog(null, "Open File") == JFileChooser.APPROVE_OPTION) {
            tokens = seleccionado.getSelectedFile();
            if (tokens.canRead() && tokens.getName().endsWith("txt")) {
                pathToken.setText(seleccionado.getSelectedFile().getAbsolutePath());
            } else {
                JOptionPane.showMessageDialog(null, "Please select a file text");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please select a file text");
        }
    }//GEN-LAST:event_openTokenActionPerformed

    private void dtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtActionPerformed
        proveToken();
    }//GEN-LAST:event_dtActionPerformed

    private void pathFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathFileActionPerformed
    }//GEN-LAST:event_pathFileActionPerformed

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctActionPerformed
        proveToken();
    }//GEN-LAST:event_ctActionPerformed

    private void dfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfActionPerformed
        proveFile();
    }//GEN-LAST:event_dfActionPerformed

    private void cfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfActionPerformed
        proveFile();
    }//GEN-LAST:event_cfActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        if(!contenido.getText().trim().equals("")){
            if (seleccionado.showDialog(null, "Save File") == JFileChooser.APPROVE_OPTION) {
            archivo = seleccionado.getSelectedFile();
            if (archivo.getName().endsWith("txt")) {
                String cont=contenido.getText();
                String respuesta=files.SaveText(archivo, contentFile);
                    JOptionPane.showMessageDialog(null, respuesta);
            } else {
                JOptionPane.showMessageDialog(null, "El archivo se debe guardar como .txt");
            }
        }
        }else{
            JOptionPane.showMessageDialog(null, "Debe seleccionar un archivo txt primero");
        }
        
    }//GEN-LAST:event_saveActionPerformed

    public static void main(String args[]) {
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(View.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        java.awt.EventQueue.invokeLater(() -> {
            new View().setVisible(true);
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JRadioButton cf;
    private javax.swing.JTextArea contenido;
    private javax.swing.JRadioButton ct;
    private javax.swing.JRadioButton df;
    private javax.swing.JRadioButton dt;
    private javax.swing.JLabel fileSearch;
    private javax.swing.JLabel fileSearch1;
    private javax.swing.ButtonGroup groupFile;
    private javax.swing.ButtonGroup groupTokens;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton openFile;
    private javax.swing.JButton openToken;
    private javax.swing.JTextField pathFile;
    private javax.swing.JTextField pathToken;
    private javax.swing.JButton save;
    private javax.swing.JButton showResult;
    // End of variables declaration//GEN-END:variables

    private void verificarTokens() {
        contentFile.stream().map((result) -> {
            boolean flag = false;
            String names = null;
            for (int x = 0; x < contentToken.size(); x++) {
                if (result.getDefinicion().matches(contentToken.get(x).getExpression())) {
                    flag = true;
                    names = contentToken.get(x).getName();
                }
            }
            if (flag == true) {
                result.setResultado(names);
            } else {
                result.setResultado("Error");
            }
            return result;
        }).forEach((result) -> {
            contenido.append(result.getDefinicion() + "\t" + result.getResultado() + "\n");
        });
    }
}
