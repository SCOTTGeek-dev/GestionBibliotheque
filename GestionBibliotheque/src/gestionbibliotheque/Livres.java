package gestionbibliotheque;

import java.awt.Image;
import java.io.File;
import java.io.FileInputStream;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.swing.ImageIcon;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.table.DefaultTableModel;
import net.proteanit.sql.DbUtils;

/**
 *
 * @author Youness
 */
public class Livres extends javax.swing.JFrame {

private static final long serialVersionUID = 1L;
Connection Con = null;
PreparedStatement Pst=null;
ResultSet Rs = null;
Statement St = null;
    
    public Livres() {
        initComponents();
        AfficherLivres();
    }

    private void AfficherLivres() {
    	try {
        Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
        St= Con.createStatement();
        Rs= St.executeQuery("select * from livre");
        TableLivre.setModel(DbUtils.resultSetToTableModel(Rs));
        TableLivre.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TableLivreMouseClicked(evt);
            }
        });
    	
    	
    	} catch(Exception e) {
    		
    	}
    }  
                           
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jLabel10 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        TitreLivre = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        AuteurLivre = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        PrixLivre = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        CouvertureLivre = new javax.swing.JLabel();
        ParcourirLivreBtn = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TableLivre = new javax.swing.JTable();
        EnregistrerLivreBtn = new javax.swing.JButton();
        SupprimerLivreBtn = new javax.swing.JButton();
        ModifierLivreBtn = new javax.swing.JButton();
        jPanel9 = new javax.swing.JPanel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        QuantiteLivre = new javax.swing.JTextField();
        jLabel14 = new javax.swing.JLabel();
        GenreLivre = new javax.swing.JTextField();
        AnneePubLivre = new com.toedter.calendar.JYearChooser();
        RetourBtn = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setUndecorated(true);

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
                .addGap(22, 22, 22)
                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(206, 206, 206)
                .addComponent(jLabel2)
                .addContainerGap(260, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        TitreLivre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TitreLivre.setToolTipText("");
        TitreLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                TitreLivreActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(51, 153, 0));
        jLabel5.setText("Titre du livre");

        jLabel6.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(51, 153, 0));
        jLabel6.setText("Auteur");

        AuteurLivre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        AuteurLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AuteurLivreActionPerformed(evt);
            }
        });

        jLabel7.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(51, 153, 0));
        jLabel7.setText("Prix");

        PrixLivre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        PrixLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PrixLivreActionPerformed(evt);
            }
        });

        jLabel8.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel8.setForeground(new java.awt.Color(51, 153, 0));
        jLabel8.setText("Quantité");

        CouvertureLivre.setText("BookCover");

        ParcourirLivreBtn.setText("Parcourir..");
        ParcourirLivreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ParcourirLivreBtnActionPerformed(evt);
            }
        });

        jLabel9.setFont(new java.awt.Font("Serif", 1, 18)); // NOI18N
        jLabel9.setForeground(new java.awt.Color(51, 153, 0));
        jLabel9.setText("Couverture du livre");

        jLabel4.setFont(new java.awt.Font("Serif", 1, 30)); // NOI18N
        jLabel4.setText("Enregistrer les livres");

        TableLivre.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "ID", "Titre ", "Auteur", "Prix", "Quantité", "Année publication", "Cover"
            }
        ));
        jScrollPane1.setViewportView(TableLivre);

        EnregistrerLivreBtn.setText("Enregistrer livre");
        EnregistrerLivreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EnregistrerLivreBtnActionPerformed(evt);
            }
        });

        SupprimerLivreBtn.setText("Supprimer livre");
        SupprimerLivreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                SupprimerLivreBtnActionPerformed(evt);
            }
        });

        ModifierLivreBtn.setText("Modifier livre");
        ModifierLivreBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ModifierLivreBtnActionPerformed(evt);
            }
        });

        jPanel9.setBackground(new java.awt.Color(102, 255, 102));

        jLabel12.setText("Ecole Marocaine Des Sciences De L'ingénieur 2024 ©");

        javax.swing.GroupLayout jPanel9Layout = new javax.swing.GroupLayout(jPanel9);
        jPanel9.setLayout(jPanel9Layout);
        jPanel9Layout.setHorizontalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 310, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(375, 375, 375))
        );
        jPanel9Layout.setVerticalGroup(
            jPanel9Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel9Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel12)
                .addContainerGap())
        );

        jLabel13.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel13.setForeground(new java.awt.Color(51, 153, 0));
        jLabel13.setText("Année publication");

        QuantiteLivre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        QuantiteLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                QuantiteLivreActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Serif", 1, 14)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(51, 153, 0));
        jLabel14.setText("Genre");

        GenreLivre.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        GenreLivre.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GenreLivreActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jPanel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(AnneePubLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(53, 53, 53))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel14)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(GenreLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel8)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(QuantiteLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(AuteurLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(PrixLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(TitreLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 177, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(CouvertureLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addComponent(ParcourirLivreBtn)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SupprimerLivreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(EnregistrerLivreBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(ModifierLivreBtn, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(112, 112, 112))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(118, 118, 118)
                        .addComponent(EnregistrerLivreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(ModifierLivreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(15, 15, 15)
                                        .addComponent(SupprimerLivreBtn, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(49, 49, 49)
                                        .addComponent(ParcourirLivreBtn)))
                                .addGap(118, 118, 118))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel6)
                                    .addComponent(AuteurLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(20, 20, 20)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel7)
                                    .addComponent(PrixLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(16, 16, 16)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel8)
                                    .addComponent(QuantiteLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(22, 22, 22)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(GenreLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel14))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 21, Short.MAX_VALUE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel13, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(AnneePubLivre, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(23, 23, 23))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(jLabel9)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TitreLivre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel5)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(14, 14, 14)
                                .addComponent(CouvertureLivre, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 236, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jPanel9, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
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
        setLocationRelativeTo(null);
    }// </editor-fold>                        

    private void TitreLivreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    private void AuteurLivreActionPerformed(java.awt.event.ActionEvent evt) {                                            
        // TODO add your handling code here:
    }                                           

    private void PrixLivreActionPerformed(java.awt.event.ActionEvent evt) {                                          
        // TODO add your handling code here:
    }                                         
    public ImageIcon ResizeCover(String ImagePath,byte[] pic)
    {
        ImageIcon MyImage = null;
        if(ImagePath != null)
        {
            MyImage = new ImageIcon(ImagePath);
        }else{
            MyImage = new ImageIcon(pic);
        }
        Image img = MyImage.getImage();
        Image newImg = img.getScaledInstance(CouvertureLivre.getWidth(),CouvertureLivre.getHeight(),Image.SCALE_SMOOTH);
        ImageIcon image = new ImageIcon(newImg);
        return image;    
        
    }
    
    String imgPath;
    private void ParcourirLivreBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        // Parcourir image
        JFileChooser file = new JFileChooser();
        file.setCurrentDirectory(new File(System.getProperty("user.home")));
        FileNameExtensionFilter filter = new FileNameExtensionFilter(null,"*.Images","jpg","gif","png");
        file.addChoosableFileFilter(filter);
        int result = file.showSaveDialog(file);
        
        if(result == JFileChooser.APPROVE_OPTION)
        {
            File selectedFile = file.getSelectedFile();
            String path = selectedFile.getAbsolutePath();
            CouvertureLivre.setIcon(ResizeCover(path,null));
             imgPath = path;
        }
        else if(result == JFileChooser.CANCEL_OPTION){
            JOptionPane.showMessageDialog(this, "Aucun fichier n'a été sélectionné !");
        }
        
    }                                                 

    private void EnregistrerLivreBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                    
       if(TitreLivre.getText().isEmpty() || AuteurLivre.getText().isEmpty() || PrixLivre.getText().isEmpty() || QuantiteLivre.getText().isEmpty() ||  
           GenreLivre.getText().isEmpty()){
           
           JOptionPane.showMessageDialog(this,"Informations manquantes !!");         
      }else{
           
           try{
               Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
               /*PreparedStatement Save = Con.prepareStatement("insert into livre values(?,?,?,?,?,?,?,?");
               Save.setInt(1, 1);
               Save.setString(2, TitreLivre.getText());
               Save.setString(3, AuteurLivre.getText());
               Save.setString(4, PrixLivre.getText());
               Save.setString(5, QuantiteLivre.getText());
               InputStream img = new FileInputStream(imgPath);
               Save.setBlob(6, img);
               Save.setString(7, String.valueOf(AnneePubLivre));
               Save.setString(8, GenreLivre.getText());
               */
               PreparedStatement Save = Con.prepareStatement("insert into livre (LivreNom,Auteur,Prix,Quantite,Cover, AnneePub, Genre) values(?,?,?,?,?,?,?)");
               Save.setString(1, TitreLivre.getText());
               Save.setString(2, AuteurLivre.getText());
               Save.setString(3, PrixLivre.getText());
               Save.setString(4, QuantiteLivre.getText());
               InputStream img = new FileInputStream(imgPath);
               Save.setBlob(5, img);
               Save.setString(6, String.valueOf(AnneePubLivre.getValue()));
               Save.setString(7, GenreLivre.getText());

               int row = Save.executeUpdate();
               JOptionPane.showMessageDialog(this,"Livre ajouté avec succés !");   
               Con.close();
               AfficherLivres();
              
           }catch(Exception ex) {
               JOptionPane.showMessageDialog(this,ex);   
           }
           
           
           
       }
    }                                                   

    private void SupprimerLivreBtnActionPerformed(java.awt.event.ActionEvent evt) {                                                  
        if(Key == 0) {
        	
        	JOptionPane.showMessageDialog(this,"Sélectionner un livre !!!");
        	
        }else {
        	try {
        		Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
        		String Query = "delete from livre where LivreID ="+Key;
        		Statement Del = Con.createStatement();
        		Del.executeUpdate(Query);
        		JOptionPane.showMessageDialog(this, "Livre supprimé avec succés !!!");
        		AfficherLivres();
        		
        	}catch(Exception e) {
        		
        	}
        		
        }
        
    }                                                 

    private void ModifierLivreBtnActionPerformed(java.awt.event.ActionEvent evt) {        
    	if(imgPath != null) {
    		
    		try {
    			InputStream img = new FileInputStream(imgPath);
    			String UpdateQuery = "update livre set LivreNom=?,Auteur=?,Prix=?,Quantite=?,Cover=?,AnneePub=?,Genre=? where LivreID=?";
    			Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
    			PreparedStatement Save = Con.prepareStatement(UpdateQuery);
    			 Save.setInt(8, Key);
    			Save.setString(1, TitreLivre.getText());
                Save.setString(2, AuteurLivre.getText());
                Save.setString(3, PrixLivre.getText());
                Save.setString(4, QuantiteLivre.getText());
                Save.setBlob(5, img);
                Save.setString(6, String.valueOf(AnneePubLivre.getValue()));
                Save.setString(7, GenreLivre.getText());
                
                
                if(Save.executeUpdate() == 1) 
                {
                	
                	AfficherLivres();
                	JOptionPane.showMessageDialog(this,"Livre mis à jour avec succés !!");
                }else {
                	JOptionPane.showMessageDialog(this,"Information manquante !!!");
                }
                
    		}catch(Exception e) {
    		   	JOptionPane.showMessageDialog(this,"Information manquante !!!");
    		}
    	}else {
    		JOptionPane.showMessageDialog(this,"Pas de couverture sélectionnée !!");
    	} 
    	imgPath=null;
    }                                                

    private void GetCouvertureLivre() {
    	
    	String Query = "select Cover from livre where LivreID="+Key;
    	Statement St;
    	ResultSet Rs;
    	try {
    		Con= DriverManager.getConnection("jdbc:mysql://localhost:3306/librarydb","root","");
    		St=Con.createStatement();
    		Rs=St.executeQuery(Query);
    		if(Rs.next()) {
    			CouvertureLivre.setIcon(ResizeCover(null,Rs.getBytes("Cover")));
    		}
    			
    	}catch(Exception e) {
    		
    		
    	}
    	
    	
    }
    
  int Key=0;
  private void TableLivreMouseClicked(java.awt.event.MouseEvent evt) {
	   DefaultTableModel model = (DefaultTableModel) TableLivre.getModel();
	    int MyIndex = TableLivre.getSelectedRow();
	    Key = Integer.valueOf(model.getValueAt(MyIndex, 0).toString());
	    TitreLivre.setText(model.getValueAt(MyIndex, 1).toString());
	    AuteurLivre.setText(model.getValueAt(MyIndex, 2).toString());
	    PrixLivre.setText(model.getValueAt(MyIndex, 3).toString());
	    QuantiteLivre.setText(model.getValueAt(MyIndex, 4).toString());
	    AnneePubLivre.setValue((int) model.getValueAt(MyIndex, 6));
	    GenreLivre.setText(model.getValueAt(MyIndex, 7).toString());
	    
	    GetCouvertureLivre();
	}

    
    private void QuantiteLivreActionPerformed(java.awt.event.ActionEvent evt) {                                              
        // TODO add your handling code here:
    }                                             

    private void GenreLivreActionPerformed(java.awt.event.ActionEvent evt) {                                           
        // TODO add your handling code here:
    }                                          

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
     
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Livres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Livres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Livres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Livres.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Livres().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify                     
    private com.toedter.calendar.JYearChooser AnneePubLivre;
    private javax.swing.JTextField AuteurLivre;
    private javax.swing.JLabel CouvertureLivre;
    private javax.swing.JButton EnregistrerLivreBtn;
    private javax.swing.JTextField GenreLivre;
    private javax.swing.JButton ModifierLivreBtn;
    private javax.swing.JButton ParcourirLivreBtn;
    private javax.swing.JTextField PrixLivre;
    private javax.swing.JTextField QuantiteLivre;
    private javax.swing.JButton SupprimerLivreBtn;
    private javax.swing.JButton RetourBtn;
    private javax.swing.JTable TableLivre;
    private javax.swing.JTextField TitreLivre;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel9;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration                   
}
