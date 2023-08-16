/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package appjavaejercicio4;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author Carlos
 */
public class ConsultasPorPrecio extends javax.swing.JInternalFrame {
private DefaultTableModel modelo = new DefaultTableModel();
public boolean isCellEditable(int f, int c){
    return false;
};
    /**
     * Creates new form ConsultasPorPrecio
     */
    public ConsultasPorPrecio() {
        initComponents();
        armarCabecera();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jtfPrecio1 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jtfPrecio2 = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtPrecios = new javax.swing.JTable();

        setClosable(true);

        jLabel1.setBackground(new java.awt.Color(255, 255, 255));
        jLabel1.setFont(new java.awt.Font("Gill Sans MT", 3, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 0));
        jLabel1.setText("Listado de productos por Precios");

        jLabel2.setText("Entre $");

        jtfPrecio1.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPrecio1KeyReleased(evt);
            }
        });

        jLabel3.setText("y");

        jtfPrecio2.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                jtfPrecio2KeyReleased(evt);
            }
        });

        jtPrecios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jtPrecios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(63, 63, 63)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jtfPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 12, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jtfPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, 53, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 371, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(17, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtfPrecio1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3)
                    .addComponent(jtfPrecio2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 271, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jtfPrecio1KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecio1KeyReleased
        // TODO add your handling code here:
        eliminarFilas();
            if(!(this.jtfPrecio1.getText().isEmpty()) && this.jtfPrecio2.getText().isEmpty()){
               for(Producto prod:Menu.listaProductos){
                 // if(prod.getPrecio() >= Double.valueOf.(this.jtfPrecio1.getText())){
                 if (prod.getPrecio() >= Double.valueOf(this.jtfPrecio1.getText())) {
                   modelo.addRow(new Object[]{prod.getCodigo(), prod.getDescripcion(), prod.getPrecio(), prod.getStock()});

                  } 
            }
        }
            if(!this.jtfPrecio1.getText().isEmpty() && !this.jtfPrecio2.getText().isEmpty()){
                for(Producto prod: Menu.listaProductos){
                    if(){
                        
                    }
                }
            }
    }//GEN-LAST:event_jtfPrecio1KeyReleased

    private void jtfPrecio2KeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_jtfPrecio2KeyReleased
        // TODO add your handling code here:
        eliminarFilas();
    }//GEN-LAST:event_jtfPrecio2KeyReleased


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jtPrecios;
    private javax.swing.JTextField jtfPrecio1;
    private javax.swing.JTextField jtfPrecio2;
    // End of variables declaration//GEN-END:variables
        private void armarCabecera(){
        modelo.addColumn("Codigo");
        modelo.addColumn("Descripcion");
        modelo.addColumn("Precio");
        modelo.addColumn("Stock");
        jtPrecios.setModel(modelo);
    }
        
        private void eliminarFilas(){
            while (modelo.getRowCount() > 0){
                int i = modelo.getRowCount();
                modelo.removeRow(i - 1);
            }
        }
}
