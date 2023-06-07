/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package proyectofinal;
import Conexion.Conex;
import com.itextpdf.text.BadElementException;
import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Element;
import com.itextpdf.text.Phrase;
import com.itextpdf.text.pdf.PdfWriter;
import java.awt.*;
import javax.swing.*;
import java.awt.event.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.table.DefaultTableModel;
import com.itextpdf.text.Image;

/**
 *
 * @author uriel
 */
public class InerfazVenta extends javax.swing.JFrame {
    InterfazLogIn IL = new InterfazLogIn();
    DefaultTableModel model = new DefaultTableModel();   
    
    int i=0;
    int PD;
    double PREC=0;
    String PROD="";
    int ContP=0;
    String[] prodar;
    String[] cantidadto;
    String TotalPDF;
    String CliFrec, NoCom;
    
    public InerfazVenta() {
        initComponents();   
        try {
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
            Statement st;
            ResultSet rs;
            st=con.createStatement();
            rs=st.executeQuery("select * from articulos");    
            while (rs.next()) {                
                cbProd.addItem(rs.getString("Nombre"));       
            }    
            con.close();
        }catch (Exception e) {
            System.out.println("Error: "+e);
            JOptionPane.showMessageDialog(null,"Error al mostrar tabla","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
        }

        model.addColumn("Articulo");
        model.addColumn("Precio");
        model.addColumn("Cantidad");
        tbAgAr.setModel(model);

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblCant = new javax.swing.JLabel();
        lblProd = new javax.swing.JLabel();
        lblTotal = new javax.swing.JLabel();
        tfCant = new javax.swing.JTextField();
        tfTotal = new javax.swing.JTextField();
        btnConfirm = new javax.swing.JButton();
        btnAgCar = new javax.swing.JButton();
        btnBackMenu = new javax.swing.JButton();
        cbProd = new javax.swing.JComboBox<>();
        lblPrec = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbAgAr = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblCant.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblCant.setText("Cantidad: ");

        lblProd.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblProd.setText("Produicto: ");

        lblTotal.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblTotal.setText("Total: ");

        tfCant.setText("0");
        tfCant.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                tfCantActionPerformed(evt);
            }
        });

        tfTotal.setText("0");

        btnConfirm.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnConfirm.setText("Confirmar compra");
        btnConfirm.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfirmActionPerformed(evt);
            }
        });

        btnAgCar.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        btnAgCar.setText("Agregar al carrito");
        btnAgCar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAgCarActionPerformed(evt);
            }
        });

        btnBackMenu.setText("Regresar al menu");
        btnBackMenu.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBackMenuActionPerformed(evt);
            }
        });

        cbProd.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbProdActionPerformed(evt);
            }
        });

        lblPrec.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 36)); // NOI18N
        jLabel1.setText("REALIZAR COMPRA");

        tbAgAr.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Articulo", "Precio", "Cantidad"
            }
        ));
        jScrollPane1.setViewportView(tbAgAr);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(lblTotal)
                            .addComponent(lblCant))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(291, 291, 291)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 321, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(btnBackMenu)
                                .addGap(54, 54, 54))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(tfCant, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addComponent(btnAgCar, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE))
                                            .addGroup(layout.createSequentialGroup()
                                                .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(2, 2, 2)))
                                        .addGap(117, 117, 117)
                                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblProd)
                        .addGap(27, 27, 27)
                        .addComponent(cbProd, javax.swing.GroupLayout.PREFERRED_SIZE, 183, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                        .addComponent(lblPrec, javax.swing.GroupLayout.PREFERRED_SIZE, 184, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(615, 615, 615))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnBackMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblPrec, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(lblProd)
                        .addComponent(cbProd, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblCant)
                    .addComponent(tfCant, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(45, 45, 45)
                        .addComponent(btnAgCar, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(33, 33, 33)
                        .addComponent(lblTotal)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 28, Short.MAX_VALUE)
                        .addComponent(tfTotal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnConfirm, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(45, 45, 45))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 281, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnConfirmActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfirmActionPerformed
     
        String tTot = tfTotal.getText();
        
        String IDC="";
        String IDA="";
        
        
        if(tTot.length()==0 || tTot.equals("0")){
           JOptionPane.showMessageDialog(null,"Faltan datos","ALERTA",JOptionPane.INFORMATION_MESSAGE);   
        }else{
            Object[] options = { "Confirmar", "CANCELAR" };
            int x =JOptionPane.showOptionDialog(null, "¿Desea confirmar la compra?", "Confirmar Compra",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
            System.out.println(x);
            
            if(x==0){
                try {
                    Connection con;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
                    Statement st;
                    ResultSet rs;
                    st=con.createStatement();
                    rs=st.executeQuery("SELECT IDCliente FROM clientes WHERE NomUsu='"+IL.Usuarioe+"'");    
                    while (rs.next()) { 
                        IDC=rs.getString("IDCliente");               
                    }
                    st=con.createStatement();
                    rs=st.executeQuery("SELECT NoCompras FROM clientes WHERE NomUsu='"+IL.Usuarioe+"'"); 

                    while (rs.next()) { 
                        NoCom=rs.getString("NoCompras");               
                    }

                    int NC=Integer.parseInt(NoCom);
                    NC++;

                    st=con.createStatement();
                    st.executeUpdate("UPDATE clientes SET NoCompras  = '"+NC+"' WHERE NomUsu='"+IL.Usuarioe+"'");

                    if(NC==5){
                        st=con.createStatement();
                        st.executeUpdate("UPDATE clientes SET ClienteFrec = 'Si' WHERE NomUsu='"+IL.Usuarioe+"'");
                    }

                    con.close();
                }catch (Exception e) {
                    System.out.println("Error: "+e);
                    JOptionPane.showMessageDialog(null,"Error al mostrar tabla","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
                }
                
                for (int j = 0; j < model.getRowCount(); j++) {
                    String art;
                    int canti=0;
                    String ex;
                    int exis=0;
                    String exisa;
                    try {
                        Connection con;
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
                        Statement st;
                        ResultSet rs;
                        st=con.createStatement();
                        rs=st.executeQuery("select * from articulos WHERE Nombre='"+prodar[j]+"'");  
                        
                        art=prodar[j];
                        canti=Integer.parseInt(cantidadto[j]);
                        
                        
                        while (rs.next()) { 
                            IDA=rs.getString("IDArticulo");     
                            ex=rs.getString("NoExistencias"); 
                            exis=Integer.parseInt(ex);
                        }   
                        
                        exis=exis-canti;
                        exisa=String.valueOf(exis);
                        
                        st=con.createStatement();
                        st.executeUpdate("UPDATE articulos SET NoExistencias = '"+exisa+"' WHERE Nombre='"+art+"'");
                                
                        System.out.println(IDA); 
                        st=con.createStatement();
                        st.executeUpdate("INSERT INTO clixart (IDCliente, IDArticulo, Cantidad) VALUES ('"+IDC+"','"+IDA+"','"+cantidadto[j]+"')");
   
                        con.close();
                    }catch (Exception e) {
                        System.out.println("Error: "+e);
                        JOptionPane.showMessageDialog(null,"Error al mostrar tabla","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
                    }              
                }         
            }
            try {
                Connection con;
                Class.forName("com.mysql.cj.jdbc.Driver");
                con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
                Statement st;
                ResultSet rs;

                st=con.createStatement();
                rs=st.executeQuery("SELECT NoCompras FROM clientes WHERE NomUsu='"+IL.Usuarioe+"'"); 
                while (rs.next()) { 
                    NoCom=rs.getString("NoCompras");               
                }
                int NC=Integer.parseInt(NoCom);
                if(NC>=5){
                    JOptionPane.showMessageDialog(null,"Eres un cliente frecuente, por loq ue tienes un 50% de descuento: $"+TotalPDF+"","ALERTA",JOptionPane.INFORMATION_MESSAGE);
                }
                    con.close();
            }catch (Exception e) {
                System.out.println("Error: "+e);
                JOptionPane.showMessageDialog(null,"Error al mostrar tabla","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
            }
            
            String IDUsuT="";
            String NombreT="";
            String ApellidoT="";
            String RFCT="";
            String CorreoT="";
            
            String NomPT="";
            String PreT="";
            String MarcT="";
            
            int y =JOptionPane.showOptionDialog(null, "¿Desea si ticket de compra?", "Ticket",JOptionPane.DEFAULT_OPTION, JOptionPane.WARNING_MESSAGE,null, options, options[0]);
            System.out.println(y);
            if(y==0){
                try {
                    Connection con;
                    Class.forName("com.mysql.cj.jdbc.Driver");
                    con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
                    Statement st;
                    ResultSet rs;
                    st=con.createStatement();
                    rs=st.executeQuery("select * from clientes WHERE IDCliente='"+IDC+"'");    
                    while (rs.next()) { 
                        IDUsuT=rs.getString("IDCliente");
                        NombreT = rs.getString("NombreCli"); 
                        ApellidoT=rs.getString("ApellidosCli");
                        RFCT=rs.getString("RFC");
                        CorreoT=rs.getString("CorreoEle");
                    } 

                    con.close();
                }catch (Exception e) {
                    System.out.println("Error: "+e);
                    JOptionPane.showMessageDialog(null,"Error al mostrar tabla","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
                }

                Document document = new Document();
                String destino = "PDF/ticket_"+NombreT+".pdf";
                try {
                    PdfWriter.getInstance(document, new FileOutputStream(destino));
                    document.open();
                    Phrase p = new Phrase("Ticket de Compra\n\nID: "+IDUsuT+"\nNombre: "+NombreT+" "+ApellidoT+"\nRFC: "+RFCT+"\nCorreo Electronico: "+CorreoT+"\n ");
                    document.add(p);
                    
                    for (int j = 0; j < model.getRowCount(); j++) {
                    try {
                        Connection con;
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
                        Statement st;
                        ResultSet rs;
                        st=con.createStatement();
                        rs=st.executeQuery("select * from articulos WHERE Nombre='"+prodar[j]+"'");    
                        while (rs.next()) {               
                            NomPT=rs.getString("Nombre"); 
                            PreT=rs.getString("Precio"); 
                            MarcT=rs.getString("Marca"); 
                        } 
                        con.close();
                    }catch (Exception e) {
                        System.out.println("Error: "+e);
                        JOptionPane.showMessageDialog(null,"Error al mostrar tabla","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
                    }
                    Phrase pa = new Phrase("\nProducto: "+NomPT+"\tMarca: "+MarcT+"\t$"+PreT+"\tCantidad: "+tbAgAr.getValueAt(j,2)+"\n ");
                    document.add(pa);
                }
                    Phrase pt = new Phrase("\nTotal: $"+TotalPDF+" ");
                    document.add(pt);
                    Image imagen = Image.getInstance("groovemusiclogo.jpg");
                    imagen.scalePercent(25f);//esto es opcional para definir el tamaño de la imagen.
                    imagen.setAlignment(Element.ALIGN_CENTER);
                    document.add(imagen);

                    System.out.println("PDF creado");
                    document.close();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(InerfazVenta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (DocumentException ex) {
                    Logger.getLogger(InerfazVenta.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(InerfazVenta.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
            
            
            
        }
        
        
    }//GEN-LAST:event_btnConfirmActionPerformed

    private void btnAgCarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAgCarActionPerformed
        String tC = tfCant.getText();
        String tTo = tfTotal.getText();
        
        String tT;
        int cantidad=0;
        double total=0; 
        
        total=Double.parseDouble(tTo);
        cantidad=Integer.parseInt(tC);
        
        int filaActual=0;

        if(tC.length()==0 || tC.equals("0")){
           JOptionPane.showMessageDialog(null,"Faltan datos","ALERTA",JOptionPane.INFORMATION_MESSAGE);   
        }else{
            
        PREC=PREC*cantidad;
        total+=PREC;

        try {
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
            Statement st;
            ResultSet rs;

            st=con.createStatement();
            rs=st.executeQuery("SELECT NoCompras FROM clientes WHERE NomUsu='"+IL.Usuarioe+"'"); 
            while (rs.next()) { 
                NoCom=rs.getString("NoCompras");               
            }
            int NC=Integer.parseInt(NoCom);
            if(NC>=5){
                total=total*0.5;
            }
            con.close();
        }catch (Exception e) {
            System.out.println("Error: "+e);
            JOptionPane.showMessageDialog(null,"Error al mostrar tabla","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
        }
            
            tT = String.valueOf(total); 
            tfTotal.setText(tT);
            TotalPDF=tT;
            
            String [] datos = new String[3]; 
            datos[0]=PROD;          
            datos[1]=String.valueOf(PREC);
            datos[2]=String.valueOf(cantidad);
       
            model.addRow(datos);           
            ContP++;
        }
        prodar = new String[model.getRowCount()];
        cantidadto = new String[model.getRowCount()];
        
        for (int j = 0; j < model.getRowCount(); j++) {
            prodar[j]=(String)model.getValueAt(j, 0);
            cantidadto[j]=(String)model.getValueAt(j, 2);
            System.out.println(prodar[j]);
            System.out.println(cantidadto[j]);
        }
        
    }//GEN-LAST:event_btnAgCarActionPerformed

    private void btnBackMenuActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBackMenuActionPerformed
        MenuOpcionesVentas bm= new MenuOpcionesVentas();
        bm.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_btnBackMenuActionPerformed

    private void cbProdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbProdActionPerformed
        PD=cbProd.getSelectedIndex();
        String Nom=cbProd.getSelectedItem().toString();
        double prec=0;
        String prod="";
        System.out.println(PD);
        int cont=0;
        try {
            Connection con;
            Class.forName("com.mysql.cj.jdbc.Driver");
            con=DriverManager.getConnection("jdbc:mysql://localhost:4306/groovemusic","root","");
            Statement st;
            ResultSet rs;
            st=con.createStatement();
            rs=st.executeQuery("select * from articulos WHERE Nombre='"+Nom+"';");    
            while (rs.next()) {    
                prec=Double.parseDouble(rs.getString("Precio")); 
                prod=rs.getString("Nombre");
                PREC=prec;
                PROD=prod;
                lblPrec.setText("Precio: $"+rs.getString("Precio"));
            }    
            con.close();
        }catch (Exception e) {
            System.out.println("Error: "+e);
            JOptionPane.showMessageDialog(null,"Error al mostrar tabla","ALERTA",JOptionPane.INFORMATION_MESSAGE); 
        }
        //System.out.println(prec);
        
    }//GEN-LAST:event_cbProdActionPerformed

    private void tfCantActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_tfCantActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_tfCantActionPerformed

    /**
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
            java.util.logging.Logger.getLogger(InerfazVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(InerfazVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(InerfazVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(InerfazVenta.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new InerfazVenta().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAgCar;
    private javax.swing.JButton btnBackMenu;
    private javax.swing.JButton btnConfirm;
    private javax.swing.JComboBox<String> cbProd;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblCant;
    private javax.swing.JLabel lblPrec;
    private javax.swing.JLabel lblProd;
    private javax.swing.JLabel lblTotal;
    public javax.swing.JTable tbAgAr;
    private javax.swing.JTextField tfCant;
    private javax.swing.JTextField tfTotal;
    // End of variables declaration//GEN-END:variables
}
