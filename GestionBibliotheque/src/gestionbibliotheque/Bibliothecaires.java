package gestionbibliotheque;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import net.proteanit.sql.DbUtils;

/**
 *
 * @author Youness
 */
public class Bibliothecaires extends javax.swing.JFrame {


    /**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Bibliothecaires() throws SQLException {
        initComponents();
        AfficherBibliothecaires();
    }

    Connection Con = null;
    PreparedStatement Pst=null;
    ResultSet Rs = null;
    Statement St = null;
   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">                          
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        NomBibliothecaire = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        MdpBibliothecaire = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        TelBibliothecaire = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableBibliothecaire = new javax.swing.JTable();
        EnregistrerBibliothecaireBtn = new javax.swing.JButton();
        SupprimerBibliothecaireBtn = new javax.swing.JButton();
        ModifierBibliothecaireBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jPanel2.setBackground(new java.awt.Color(102, 255, 102));

        jLabel10.setIcon(new javax.swing.ImageIcon("C:\\Users\\HP\\Downloads\\logo-emsi-entry(1).png")); // NOI18N
        jLabel10.setText("jLabel10");

        jLabel2.setFont(new java.awt.Font("SimSun", 1, 24)); // NOI18N
        jLabel2.setText("Système de gestion de bibliothèque");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(209, 209, 209)
                .addComponent(jLabel2)
                .addContainerGap(36, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(35, Short.MAX_VALUE))
        );

        NomBibliothecaire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        NomBibliothecaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NomBibliothecaireActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Nom complet");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Mot de passe");

        MdpBibliothecaire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        MdpBibliothecaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                MdpBibliothecaireActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("Téléphone");

        TelBibliothecaire.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TelBibliothecaire.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TelBibliothecaireActionPerformed(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel4.setText("Gestion des bibliothécaires");

        TableBibliothecaire.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "BiblioID", "BiblioName", "BiblioPassword", "BiblioTelephone"
            }
        ));
        TableBibliothecaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBibliothecaireMouseClicked(evt);
            }
        });
        
        jScrollPane1.setViewportView(TableBibliothecaire);

        EnregistrerBibliothecaireBtn.setText("Enregistrer bibliothécaire");
        EnregistrerBibliothecaireBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerBibliothecaireBtnActionPerformed(evt);
            }
        });

        SupprimerBibliothecaireBtn.setText("Supprimer bibliothécaire");
        SupprimerBibliothecaireBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerBibliothecaireBtnActionPerformed(evt);
            }
        });

        ModifierBibliothecaireBtn.setText("Modifier bibliothécaire");
        ModifierBibliothecaireBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierBibliothecaireBtnActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(102, 255, 102));

        jLabel12.setText("Ecole Marocaine Des Sciences De L'ingénieur 2024 ©");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel9Layout.createSequentialGroup()
                .addGap(296, 296, 296)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(89, 89, 89)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(NomBibliothecaire, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addComponent(MdpBibliothecaire, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(189, 189, 189)
                        .addComponent(EnregistrerBibliothecaireBtn)
                        .addGap(35, 35, 35)
                        .addComponent(ModifierBibliothecaireBtn)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel7)
                            .addComponent(TelBibliothecaire, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(SupprimerBibliothecaireBtn)))
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel4)
                .addGap(235, 235, 235))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel4)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomBibliothecaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(MdpBibliothecaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(TelBibliothecaire, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(34, 34, 34)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(EnregistrerBibliothecaireBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ModifierBibliothecaireBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(SupprimerBibliothecaireBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 345, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>                        

    private void NomBibliothecaireActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void MdpBibliothecaireActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

    private void TelBibliothecaireActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // TODO add your handling code here:
    }                                                 

        private void AfficherBibliothecaires() throws SQLException{
        Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
        St= Con.createStatement();
        Rs= St.executeQuery("select * from bibliothecaire");
        TableBibliothecaire.setModel(DbUtils.resultSetToTableModel(Rs));
        TableBibliothecaire.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableBibliothecaireMouseClicked(evt);
            }
        });
        
    }
    
    
    
    private void EnregistrerBibliothecaireBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                             
        if(NomBibliothecaire.getText().isEmpty() || MdpBibliothecaire.getText().isEmpty() || TelBibliothecaire.getText().isEmpty() ){
           
           JOptionPane.showMessageDialog(this,"Informations manquantes !!");         
      }else{
           
           try{
               Con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
               PreparedStatement Save = Con.prepareStatement("insert into bibliothecaire(BiblioNom,BiblioPassword,BiblioTelephone) values(?,?,?)");
               
               Save.setString(1, NomBibliothecaire.getText());
               Save.setString(2, MdpBibliothecaire.getText());
               Save.setString(3, TelBibliothecaire.getText());
              
               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Bibliothécaire ajouté avec succés !");   
               Con.close();
               AfficherBibliothecaires();
              

           }catch(Exception ex) {
               
               JOptionPane.showMessageDialog(this,ex);   
           }
           
           
       }
                                  
                                                  
    }                                                            

    private void SupprimerBibliothecaireBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                           
if(Key == -1) {
        	
        	JOptionPane.showMessageDialog(this,"Sélectionner un bibliothécaire !!!");
        	
        }else {
        	try {
        		Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
        		String Query = "delete from bibliothecaire where BiblioID ="+Key;
        		Statement Del = Con.createStatement();
        		Del.executeUpdate(Query);
        		JOptionPane.showMessageDialog(this, "Livre supprimé avec succés !!!");
        		AfficherBibliothecaires();
        		
        	}catch(Exception e) {
        		
        	}
        		
        }
    }                                                          

    private void ModifierBibliothecaireBtnActionPerformed(java.awt.event.ActionEvent evt) {
        if (NomBibliothecaire.getText().isEmpty() || MdpBibliothecaire.getText().isEmpty() || TelBibliothecaire.getText().isEmpty()) {
            JOptionPane.showMessageDialog(this, "Information manquante !!");
        } else {
            try (Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb", "root", "")) {
                String updateQuery = "update bibliothecaire set BiblioNom=?, BiblioPassword=?, BiblioTelephone=? where BiblioID=?";
                try (PreparedStatement save = con.prepareStatement(updateQuery)) {
                    save.setString(1, NomBibliothecaire.getText());
                    save.setString(2, MdpBibliothecaire.getText());
                    save.setString(3, TelBibliothecaire.getText());
                    save.setInt(4, Key);

                    int rowsAffected = save.executeUpdate();
                    if (rowsAffected > 0) {
                        AfficherBibliothecaires();
                        JOptionPane.showMessageDialog(this, "Bibliothécaire mis à jour avec succès !!");
                    } else {
                        JOptionPane.showMessageDialog(this, "Aucune mise à jour effectuée. Vérifiez les informations fournies.");
                    }
                }
            } catch (SQLException e) {
                JOptionPane.showMessageDialog(this, "Erreur lors de la mise à jour du bibliothécaire : " + e.getMessage());
            }
        }
    }



    int Key=-1;
    private void TableBibliothecaireMouseClicked(java.awt.event.MouseEvent evt) {                                                 
         DefaultTableModel model = (DefaultTableModel) TableBibliothecaire.getModel();
	    int MyIndex = TableBibliothecaire.getSelectedRow();
	    Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
	    NomBibliothecaire.setText(model.getValueAt(MyIndex, 1).toString());
	    MdpBibliothecaire.setText(model.getValueAt(MyIndex, 2).toString());
	    TelBibliothecaire.setText(model.getValueAt(MyIndex, 3).toString());
	   
    }                            
    public static void main(String args[]) {
        
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Bibliothecaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Bibliothecaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Bibliothecaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Bibliothecaires.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
					new Bibliothecaires().setVisible(true);
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
            }
        });
    }

    // Variables declaration - do not modify                     
    private javax.swing.JButton EnregistrerBibliothecaireBtn;
    private javax.swing.JTextField MdpBibliothecaire;
    private javax.swing.JButton ModifierBibliothecaireBtn;
    private javax.swing.JTextField NomBibliothecaire;
    private javax.swing.JButton SupprimerBibliothecaireBtn;
    private javax.swing.JTable TableBibliothecaire;
    private javax.swing.JTextField TelBibliothecaire;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
