package igu;

import javax.swing.JOptionPane;
import logica.Controladora;

public class Pantalla extends javax.swing.JFrame {

    Controladora control;
    
    public Pantalla(Controladora control) {
        initComponents();
        this.control = control;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        panel_General = new javax.swing.JPanel();
        panel_Form = new javax.swing.JPanel();
        input_numCliente = new javax.swing.JTextField();
        input_raza = new javax.swing.JTextField();
        input_nombre = new javax.swing.JTextField();
        input_color = new javax.swing.JTextField();
        numCliente = new javax.swing.JLabel();
        raza = new javax.swing.JLabel();
        nombre = new javax.swing.JLabel();
        color = new javax.swing.JLabel();
        comboBoxAtencionEspecial = new javax.swing.JComboBox<>();
        alergico = new javax.swing.JLabel();
        atencionEspecial = new javax.swing.JLabel();
        comboBoxAlergico = new javax.swing.JComboBox<>();
        input_nombreDuenio = new javax.swing.JTextField();
        input_celDuenio = new javax.swing.JTextField();
        nombreDuenio = new javax.swing.JLabel();
        celDuenio = new javax.swing.JLabel();
        observaciones = new javax.swing.JLabel();
        agregaInfo = new javax.swing.JScrollPane();
        input_observaciones = new javax.swing.JTextArea();
        btnLimpiar = new javax.swing.JButton();
        btnGuardar = new javax.swing.JButton();
        panel_Imagen = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        titulo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(204, 204, 204));

        panel_General.setBackground(new java.awt.Color(204, 204, 204));

        panel_Form.setBackground(new java.awt.Color(204, 204, 204));

        input_numCliente.setBackground(new java.awt.Color(204, 255, 255));
        input_numCliente.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        input_numCliente.setForeground(new java.awt.Color(0, 0, 0));
        input_numCliente.setDisabledTextColor(new java.awt.Color(102, 102, 102));
        input_numCliente.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        input_numCliente.setSelectionColor(new java.awt.Color(153, 153, 255));

        input_raza.setBackground(new java.awt.Color(204, 255, 255));
        input_raza.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        input_raza.setForeground(new java.awt.Color(0, 0, 0));
        input_raza.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        input_raza.setSelectionColor(new java.awt.Color(153, 153, 255));

        input_nombre.setBackground(new java.awt.Color(204, 255, 255));
        input_nombre.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        input_nombre.setForeground(new java.awt.Color(0, 0, 0));
        input_nombre.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        input_nombre.setSelectionColor(new java.awt.Color(153, 153, 255));

        input_color.setBackground(new java.awt.Color(204, 255, 255));
        input_color.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        input_color.setForeground(new java.awt.Color(0, 0, 0));
        input_color.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        input_color.setSelectionColor(new java.awt.Color(153, 153, 255));

        numCliente.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        numCliente.setForeground(new java.awt.Color(0, 0, 0));
        numCliente.setText("N° cliente:");

        raza.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        raza.setForeground(new java.awt.Color(0, 0, 0));
        raza.setText("Raza: ");

        nombre.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        nombre.setForeground(new java.awt.Color(0, 0, 0));
        nombre.setText("Nombre:");

        color.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        color.setForeground(new java.awt.Color(0, 0, 0));
        color.setText("Color:");

        comboBoxAtencionEspecial.setBackground(new java.awt.Color(204, 204, 204));
        comboBoxAtencionEspecial.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxAtencionEspecial.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sí", "No" }));
        comboBoxAtencionEspecial.setPreferredSize(new java.awt.Dimension(45, 31));

        alergico.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        alergico.setForeground(new java.awt.Color(0, 0, 0));
        alergico.setText("Alérgico:");

        atencionEspecial.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        atencionEspecial.setForeground(new java.awt.Color(0, 0, 0));
        atencionEspecial.setText("Atención Especial: ");

        comboBoxAlergico.setBackground(new java.awt.Color(204, 204, 204));
        comboBoxAlergico.setForeground(new java.awt.Color(0, 0, 0));
        comboBoxAlergico.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "-", "Sí", "No" }));
        comboBoxAlergico.setPreferredSize(new java.awt.Dimension(45, 31));

        input_nombreDuenio.setBackground(new java.awt.Color(204, 255, 255));
        input_nombreDuenio.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        input_nombreDuenio.setForeground(new java.awt.Color(0, 0, 0));
        input_nombreDuenio.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        input_nombreDuenio.setSelectionColor(new java.awt.Color(153, 153, 255));

        input_celDuenio.setBackground(new java.awt.Color(204, 255, 255));
        input_celDuenio.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        input_celDuenio.setForeground(new java.awt.Color(0, 0, 0));
        input_celDuenio.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        input_celDuenio.setSelectionColor(new java.awt.Color(153, 153, 255));

        nombreDuenio.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        nombreDuenio.setForeground(new java.awt.Color(0, 0, 0));
        nombreDuenio.setText("Nombre Dueño: ");

        celDuenio.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        celDuenio.setForeground(new java.awt.Color(0, 0, 0));
        celDuenio.setText("Cel. Dueño: ");

        observaciones.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        observaciones.setForeground(new java.awt.Color(0, 0, 0));
        observaciones.setText("Observaciones: ");

        input_observaciones.setBackground(new java.awt.Color(204, 255, 255));
        input_observaciones.setColumns(20);
        input_observaciones.setFont(new java.awt.Font("Segoe Print", 0, 12)); // NOI18N
        input_observaciones.setForeground(new java.awt.Color(0, 0, 0));
        input_observaciones.setLineWrap(true);
        input_observaciones.setRows(5);
        input_observaciones.setBorder(null);
        input_observaciones.setSelectedTextColor(new java.awt.Color(0, 0, 0));
        input_observaciones.setSelectionColor(new java.awt.Color(153, 153, 255));
        agregaInfo.setViewportView(input_observaciones);

        btnLimpiar.setBackground(new java.awt.Color(204, 204, 204));
        btnLimpiar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnLimpiar.setForeground(new java.awt.Color(0, 0, 0));
        btnLimpiar.setText("Limpiar");
        btnLimpiar.setOpaque(false);
        btnLimpiar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimpiarActionPerformed(evt);
            }
        });

        btnGuardar.setBackground(new java.awt.Color(204, 204, 204));
        btnGuardar.setFont(new java.awt.Font("Segoe Print", 1, 14)); // NOI18N
        btnGuardar.setForeground(new java.awt.Color(0, 0, 0));
        btnGuardar.setText("Guardar");
        btnGuardar.setOpaque(false);
        btnGuardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnGuardarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout panel_FormLayout = new javax.swing.GroupLayout(panel_Form);
        panel_Form.setLayout(panel_FormLayout);
        panel_FormLayout.setHorizontalGroup(
            panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FormLayout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(numCliente, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombre, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(raza, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(color, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(alergico, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(atencionEspecial, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(nombreDuenio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(celDuenio, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(observaciones, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(37, 37, 37)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(panel_FormLayout.createSequentialGroup()
                        .addComponent(btnLimpiar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 63, Short.MAX_VALUE)
                        .addComponent(btnGuardar))
                    .addComponent(input_celDuenio)
                    .addComponent(input_nombreDuenio)
                    .addComponent(input_nombre)
                    .addComponent(input_numCliente)
                    .addComponent(input_raza)
                    .addComponent(input_color)
                    .addComponent(agregaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(comboBoxAtencionEspecial, javax.swing.GroupLayout.Alignment.LEADING, 0, 57, Short.MAX_VALUE)
                        .addComponent(comboBoxAlergico, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap(78, Short.MAX_VALUE))
        );
        panel_FormLayout.setVerticalGroup(
            panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_FormLayout.createSequentialGroup()
                .addGap(64, 64, 64)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_numCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(numCliente))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_nombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombre))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_raza, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(raza))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_color, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(color))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(alergico)
                    .addComponent(comboBoxAlergico, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(atencionEspecial)
                    .addComponent(comboBoxAtencionEspecial, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_nombreDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(nombreDuenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(input_celDuenio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(celDuenio))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(observaciones)
                    .addComponent(agregaInfo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panel_FormLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnLimpiar)
                    .addComponent(btnGuardar))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        panel_Imagen.setBackground(new java.awt.Color(204, 204, 204));

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/img/dalmata.png"))); // NOI18N

        javax.swing.GroupLayout panel_ImagenLayout = new javax.swing.GroupLayout(panel_Imagen);
        panel_Imagen.setLayout(panel_ImagenLayout);
        panel_ImagenLayout.setHorizontalGroup(
            panel_ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ImagenLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel2)
                .addContainerGap(43, Short.MAX_VALUE))
        );
        panel_ImagenLayout.setVerticalGroup(
            panel_ImagenLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_ImagenLayout.createSequentialGroup()
                .addGap(124, 124, 124)
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        titulo.setFont(new java.awt.Font("Segoe UI Black", 1, 44)); // NOI18N
        titulo.setForeground(new java.awt.Color(0, 0, 0));
        titulo.setText("Peluquería Canina");

        javax.swing.GroupLayout panel_GeneralLayout = new javax.swing.GroupLayout(panel_General);
        panel_General.setLayout(panel_GeneralLayout);
        panel_GeneralLayout.setHorizontalGroup(
            panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel_GeneralLayout.createSequentialGroup()
                .addComponent(panel_Form, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(panel_Imagen, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 2, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_GeneralLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(titulo)
                .addGap(269, 269, 269))
        );
        panel_GeneralLayout.setVerticalGroup(
            panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel_GeneralLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(titulo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(panel_GeneralLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(panel_Imagen, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel_Form, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(panel_General, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(panel_General, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnLimpiarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimpiarActionPerformed
        
        input_numCliente.setText("");
        input_nombre.setText("");
        input_raza.setText("");
        input_color.setText("");
        input_nombreDuenio.setText("");
        input_celDuenio.setText("");
        input_observaciones.setText("");
        comboBoxAlergico.setSelectedItem("-");
        comboBoxAtencionEspecial.setSelectedItem("-");
        input_numCliente.setText("");
    }//GEN-LAST:event_btnLimpiarActionPerformed

    private void btnGuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnGuardarActionPerformed
        
        int numcliente = Integer.parseInt(input_numCliente.getText());
        String nombrep = input_nombre.getText();
        String razap = input_raza.getText();
        String colorp = input_color.getText();
        String nombreDueniop = input_nombreDuenio.getText();
        String celDueniop = input_celDuenio.getText();
        String obs = input_observaciones.getText();
        String alerg = comboBoxAlergico.getSelectedItem().toString();
        String atEspecial = comboBoxAtencionEspecial.getSelectedItem().toString();
        
        control.crearCliente(numcliente,nombrep,razap,colorp,alerg,atEspecial,nombreDueniop,celDueniop,obs);
        
        JOptionPane.showMessageDialog(rootPane, "Cliente agregado correctamente!", "Cliente Agregado", JOptionPane.INFORMATION_MESSAGE);
    }//GEN-LAST:event_btnGuardarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JScrollPane agregaInfo;
    private javax.swing.JLabel alergico;
    private javax.swing.JLabel atencionEspecial;
    private javax.swing.JButton btnGuardar;
    private javax.swing.JButton btnLimpiar;
    private javax.swing.JLabel celDuenio;
    private javax.swing.JLabel color;
    private javax.swing.JComboBox<String> comboBoxAlergico;
    private javax.swing.JComboBox<String> comboBoxAtencionEspecial;
    private javax.swing.JTextField input_celDuenio;
    private javax.swing.JTextField input_color;
    private javax.swing.JTextField input_nombre;
    private javax.swing.JTextField input_nombreDuenio;
    private javax.swing.JTextField input_numCliente;
    private javax.swing.JTextArea input_observaciones;
    private javax.swing.JTextField input_raza;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel nombre;
    private javax.swing.JLabel nombreDuenio;
    private javax.swing.JLabel numCliente;
    private javax.swing.JLabel observaciones;
    private javax.swing.JPanel panel_Form;
    private javax.swing.JPanel panel_General;
    private javax.swing.JPanel panel_Imagen;
    private javax.swing.JLabel raza;
    private javax.swing.JLabel titulo;
    // End of variables declaration//GEN-END:variables
}
