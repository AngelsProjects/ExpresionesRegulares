package expresionesregulares;

import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;

public class View extends javax.swing.JFrame {

    JFileChooser seleccionado;
    File archivo;
    File tokens;
    Archivos files;
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
        pathToken = new javax.swing.JTextField();
        openFile = new javax.swing.JButton();
        dt = new javax.swing.JRadioButton();
        pathFile = new javax.swing.JTextField();
        ct = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        contenido = new javax.swing.JTextArea();
        save = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        showResult = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        df = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        cf = new javax.swing.JRadioButton();
        fileSearch = new javax.swing.JLabel();
        fileSearch1 = new javax.swing.JLabel();
        openToken = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        pathToken.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        pathToken.setEnabled(false);

        openFile.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        openFile.setText("Browse");
        openFile.setEnabled(false);
        openFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openFileActionPerformed(evt);
            }
        });

        groupTokens.add(dt);
        dt.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        dt.setSelected(true);
        dt.setText("Default");
        dt.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dtActionPerformed(evt);
            }
        });

        pathFile.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        pathFile.setEnabled(false);
        pathFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pathFileActionPerformed(evt);
            }
        });

        groupTokens.add(ct);
        ct.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        ct.setText("Custom");
        ct.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ctActionPerformed(evt);
            }
        });

        contenido.setEditable(false);
        contenido.setColumns(20);
        contenido.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        contenido.setRows(5);
        contenido.setBorder(null);
        jScrollPane1.setViewportView(contenido);

        save.setBackground(new java.awt.Color(255, 255, 255));
        save.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        save.setText("Save");
        save.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/folder.jpg"))); // NOI18N

        showResult.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        showResult.setText("OK");
        showResult.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showResultActionPerformed(evt);
            }
        });

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/files.jpg"))); // NOI18N

        groupFile.add(df);
        df.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        df.setSelected(true);
        df.setText("Default");
        df.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                dfActionPerformed(evt);
            }
        });

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/imagenes/fe.jpg"))); // NOI18N

        groupFile.add(cf);
        cf.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        cf.setText("Custom");
        cf.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cfActionPerformed(evt);
            }
        });

        fileSearch.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        fileSearch.setText("File: ");

        fileSearch1.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        fileSearch1.setText("Tokens: ");

        openToken.setBackground(new java.awt.Color(255, 255, 255));
        openToken.setFont(new java.awt.Font("Helvetica", 0, 14)); // NOI18N
        openToken.setText("Browse");
        openToken.setEnabled(false);
        openToken.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                openTokenActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fileSearch)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(df)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(cf)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(pathFile, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addGap(102, 102, 102)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(openFile, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addGap(24, 24, 24))))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 593, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(fileSearch1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(dt)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(ct)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(pathToken, javax.swing.GroupLayout.PREFERRED_SIZE, 229, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(openToken, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(showResult, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(save, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(openToken)
                    .addComponent(pathToken, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ct)
                    .addComponent(dt)
                    .addComponent(fileSearch1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(pathFile, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(df)
                    .addComponent(cf)
                    .addComponent(fileSearch)
                    .addComponent(openFile))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(showResult)
                    .addComponent(save))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void openFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openFileActionPerformed
        seleccionado = new JFileChooser();
        archivo = null;
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

    private void dtActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dtActionPerformed
        proveToken();
    }//GEN-LAST:event_dtActionPerformed

    private void pathFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pathFileActionPerformed

    }//GEN-LAST:event_pathFileActionPerformed

    private void ctActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ctActionPerformed
        proveToken();
    }//GEN-LAST:event_ctActionPerformed

    private void saveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveActionPerformed
        files = new Archivos();
        seleccionado = new JFileChooser();
        if (!contenido.getText().trim().equals("")) {
            if (seleccionado.showDialog(null, "Save File") == JFileChooser.APPROVE_OPTION) {
                archivo = seleccionado.getSelectedFile();
                if (archivo.getName().endsWith("txt")) {
                    String cont = contenido.getText();
                    String respuesta = files.SaveText(archivo, contentFile);
                    JOptionPane.showMessageDialog(null, respuesta);
                } else {
                    JOptionPane.showMessageDialog(null, "The file most be saved as .txt extenssion");
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Sorry... You have to select correct tokens and sample files first ☺");
        }
    }//GEN-LAST:event_saveActionPerformed

    private void showResultActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_showResultActionPerformed
        contenido.setText(null);
        contentFile = new ArrayList<>();
        files = new Archivos();
        if (dt.isSelected()) {
            contentToken = files.OpenToken("src/recursos/Tokens.txt");
            checkFileContent();
        } else if (pathToken.getText().endsWith("txt")) {
            if (files.canread(pathToken.getText())) {
                contentToken = files.OpenToken(pathToken.getText());
            } else {
                JOptionPane.showMessageDialog(null, "Please write a correct path directory for token");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please write a correct path directory for token");
        }
    }//GEN-LAST:event_showResultActionPerformed

    private void dfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_dfActionPerformed
        proveFile();
    }//GEN-LAST:event_dfActionPerformed

    private void cfActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cfActionPerformed
        proveFile();
    }//GEN-LAST:event_cfActionPerformed

    private void openTokenActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_openTokenActionPerformed
        archivo = null;
        seleccionado = new JFileChooser();
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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
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
            int tamanio=contentToken.size();
            int y=0;
            while(flag==false&&y<tamanio){
                if (result.getDefinicion().matches(contentToken.get(y).getExpression())) {
                    flag = true;
                    names = contentToken.get(y).getName();
                }
                y++;
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

    private void checkFileContent() {
        if (df.isSelected()) {
            contentFile = files.OpenFile("src/recursos/Entrada.txt");
            if (contentToken == null) {
                JOptionPane.showMessageDialog(null, "wrong tokens");
            } else {
                verificarTokens();
            }
        } else if (pathFile.getText().endsWith("txt")) {
            if (files.canread(pathFile.getText())) {
                contentFile = files.OpenFile(pathFile.getText());
                if (contentToken == null) {
                    JOptionPane.showMessageDialog(null, "wrong tokens");
                } else {
                    verificarTokens();
                }
            } else {
                JOptionPane.showMessageDialog(null, "Please write a correct path directory for file");
            }
        } else {
            JOptionPane.showMessageDialog(null, "Please write a correct path directory for file");
        }
    }

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
}
