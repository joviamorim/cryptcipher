/*
* mainFrame.java
*
* Created on January 21, 2006, 4:41 PM
* Cryptography tool 1.0
*/

import java.io.File;
import java.io.*;
import java.security.MessageDigest;
import java.util.Enumeration;
import javax.crypto.KeyGenerator;
import javax.crypto.SecretKey;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
/**
*
* @author Nick Pullman
*/
public class CryptMain extends javax.swing.JFrame {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String pathname = new String(); //pathname of file that we will be working on
	String MD5Digest = new String(); //Digest of file using MD5 hash
	String SHA1Digest = new String(); //Digest of file using SHA1
	String keyFilePath = new String(); //Absolute pathname to keystore
	String password = new String(); //Password to be used for keystore

	//Variables declaration - do not modify
	private javax.swing.JCheckBox chkHexMD5;
	private javax.swing.JCheckBox chkHexSHA1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu5;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenu jMenu7;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JMenuItem menuItemAddKey;
    private javax.swing.JMenuItem menuItemCompMD5;
    private javax.swing.JMenuItem menuItemCompSHA1;
    private javax.swing.JMenuItem menuItemCreateKeyStore;
    private javax.swing.JMenuItem menuItemDecryptFile;
    private javax.swing.JMenuItem menuItemDeleteKey;
    private javax.swing.JMenuItem menuItemEncryptFile;
    private javax.swing.JMenuItem menuItemExit;
    private javax.swing.JMenuItem menuItemGetBoth;
    private javax.swing.JMenuItem menuItemGetMD5;
    private javax.swing.JMenuItem menuItemGetSHA1;
    private javax.swing.JMenuItem menuItemOpenFile;
    private javax.swing.JMenuItem menuItemSaveMD5;
    private javax.swing.JMenuItem menuItemSaveSHA1;
    private javax.swing.JMenuItem menuItemViewAliases;
    private javax.swing.JTextArea txtAliases;
    private javax.swing.JTextField txtInFilePathName;
    private javax.swing.JTextField txtKeyStorePath;
    private javax.swing.JTextField txtMD5;
    private javax.swing.JTextField txtSHA1;
    // End of variables declaration

    /** Creates new form mainFrame */
    public CryptMain() {
    	initComponents();
    }
    
    /** main method */
	public static void main(String args[]) {
		java.awt.EventQueue.invokeLater(new Runnable() {
			public void run() {
				new CryptMain().setVisible(true);
			}
		});
	}
    
/** This method is called from within the constructor to
* initialize the form.
* WARNING: Do NOT modify this code. The content of this method is
* always regenerated by the Form Editor.
*/
    // <editor-fold defaultstate="collapsed" desc=" Generated Code ">
    private void initComponents() {
    	txtInFilePathName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        chkHexMD5 = new javax.swing.JCheckBox();
        txtMD5 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        chkHexSHA1 = new javax.swing.JCheckBox();
        txtSHA1 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtKeyStorePath = new javax.swing.JTextField();
        txtAliases = new javax.swing.JTextArea();
        jLabel4 = new javax.swing.JLabel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        menuItemOpenFile = new javax.swing.JMenuItem();
        menuItemExit = new javax.swing.JMenuItem();
        jMenu2 = new javax.swing.JMenu();
        jMenu3 = new javax.swing.JMenu();
        menuItemGetSHA1 = new javax.swing.JMenuItem();
        menuItemGetMD5 = new javax.swing.JMenuItem();
        menuItemGetBoth = new javax.swing.JMenuItem();
        jMenu4 = new javax.swing.JMenu();
        menuItemSaveSHA1 = new javax.swing.JMenuItem();
        menuItemSaveMD5 = new javax.swing.JMenuItem();
        jMenu5 = new javax.swing.JMenu();
        menuItemCompSHA1 = new javax.swing.JMenuItem();
        menuItemCompMD5 = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        menuItemCreateKeyStore = new javax.swing.JMenuItem();
        menuItemAddKey = new javax.swing.JMenuItem();
        menuItemDeleteKey = new javax.swing.JMenuItem();
        menuItemViewAliases = new javax.swing.JMenuItem();
        jMenu7 = new javax.swing.JMenu();
        menuItemEncryptFile = new javax.swing.JMenuItem();
        menuItemDecryptFile = new javax.swing.JMenuItem();
        getContentPane().setLayout(null);
        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cryptographic Tool");
        setName("frame");
        txtInFilePathName.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtInFilePathName.setEnabled(false);
        getContentPane().add(txtInFilePathName);
        txtInFilePathName.setBounds(10, 40, 720, 20);
        jLabel3.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel3.setText("Filename:");
        getContentPane().add(jLabel3);
        jLabel3.setBounds(10, 20, 100, 14);
        jPanel1.setLayout(null);
        jPanel4.setLayout(null);
        jPanel4.setBorder(new javax.swing.border.EtchedBorder());
        chkHexMD5.setText("Hex");
        chkHexMD5.setIconTextGap(8);
        chkHexMD5.addActionListener(new java.awt.event.ActionListener() {
        	public void actionPerformed(java.awt.event.ActionEvent evt) {
        		chkHexMD5ActionPerformed(evt);
        	}
        });
        jPanel4.add(chkHexMD5);
        chkHexMD5.setBounds(230, 180, 60, 23);
        txtMD5.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtMD5.setEnabled(false);
        jPanel4.add(txtMD5);
        txtMD5.setBounds(220, 150, 360, 19);
        jLabel2.setText("MD5");
        jPanel4.add(jLabel2);
        jLabel2.setBounds(180, 150, 30, 20);
        chkHexSHA1.setText("Hex");
        chkHexSHA1.setIconTextGap(8);
        chkHexSHA1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
	             chkHexSHA1ActionPerformed(evt);
            }
        });
        jPanel4.add(chkHexSHA1);
        chkHexSHA1.setBounds(230, 90, 60, 23);
        txtSHA1.setAutoscrolls(false);
        txtSHA1.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtSHA1.setEnabled(false);
        jPanel4.add(txtSHA1);
        txtSHA1.setBounds(220, 60, 360, 19);
        jLabel1.setText("SHA1");
        jPanel4.add(jLabel1);
        jLabel1.setBounds(180, 60, 40, 20);
        jPanel1.add(jPanel4);
        jPanel4.setBounds(10, 50, 680, 270);
        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel7.setText("Message Digest");
        jPanel1.add(jLabel7);
        jLabel7.setBounds(30, 20, 120, 20);
        jTabbedPane1.addTab("Message Digest", jPanel1);
        jPanel2.setLayout(null);
        jPanel3.setLayout(null);
        jPanel3.setBorder(new javax.swing.border.EtchedBorder());
        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel5.setText("Filename:");
        jPanel3.add(jLabel5);
        jLabel5.setBounds(30, 40, 110, 20);
        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14));
        jLabel6.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel6.setText("Aliases:");
        jPanel3.add(jLabel6);
        jLabel6.setBounds(490, 10, 150, 20);
        txtKeyStorePath.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtKeyStorePath.setEnabled(false);
        jPanel3.add(txtKeyStorePath);
        txtKeyStorePath.setBounds(20, 70, 360, 19);
        txtAliases.setBorder(new javax.swing.border.EtchedBorder());
        txtAliases.setDisabledTextColor(new java.awt.Color(0, 0, 0));
        txtAliases.setEnabled(false);
        jPanel3.add(txtAliases);
        txtAliases.setBounds(490, 30, 150, 230);
        jPanel2.add(jPanel3);
        jPanel3.setBounds(10, 40, 680, 280);
        jLabel4.setFont(new java.awt.Font("Tahoma", 1, 14));
        jLabel4.setText("Key Store");
        jPanel2.add(jLabel4);
        jLabel4.setBounds(20, 10, 110, 20);
        jTabbedPane1.addTab("Key Store", jPanel2);
        getContentPane().add(jTabbedPane1);
        jTabbedPane1.setBounds(10, 80, 720, 370);
        jMenu1.setMnemonic('f');
        jMenu1.setText("File");
        menuItemOpenFile.setMnemonic('o');
        menuItemOpenFile.setText("Open File...");
        menuItemOpenFile.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemOpenFileActionPerformed(evt);
	      }
	    });
	    jMenu1.add(menuItemOpenFile);
	    menuItemExit.setMnemonic('x');
	    menuItemExit.setText("Exit");
	    menuItemExit.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemExitActionPerformed(evt);
	      }
	    });
	    jMenu1.add(menuItemExit);
	    jMenuBar1.add(jMenu1);
	    jMenu2.setMnemonic('d');
	    jMenu2.setText("Digest");
	    jMenu3.setText("Get Digest");
	    menuItemGetSHA1.setText("SHA1");
	    menuItemGetSHA1.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemGetSHA1ActionPerformed(evt);
	      }
	    });
	    jMenu3.add(menuItemGetSHA1);
	    menuItemGetMD5.setText("MD5");
	    menuItemGetMD5.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemGetMD5ActionPerformed(evt);
	      }
	    });
	    jMenu3.add(menuItemGetMD5);
	    menuItemGetBoth.setText("MD5 & SHA1");
	    menuItemGetBoth.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemGetBothActionPerformed(evt);
	      }
	    });
	    jMenu3.add(menuItemGetBoth);
	    jMenu2.add(jMenu3);
	    jMenu4.setText("Save Digest");
	    menuItemSaveSHA1.setText("Save SHA1...");
	    menuItemSaveSHA1.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemSaveSHA1ActionPerformed(evt);
	      }
	    });
	    jMenu4.add(menuItemSaveSHA1);
	    menuItemSaveMD5.setText("Save MD5...");
	    menuItemSaveMD5.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemSaveMD5ActionPerformed(evt);
	      }
	    });
	    jMenu4.add(menuItemSaveMD5);
	    jMenu2.add(jMenu4);
	    jMenu5.setText("Compare Digest");
	    menuItemCompSHA1.setText("SHA1 to File...");
	    menuItemCompSHA1.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemCompSHA1ActionPerformed(evt);
	      }
	    });
	    jMenu5.add(menuItemCompSHA1);
	    menuItemCompMD5.setText("MD5 to File...");
	    menuItemCompMD5.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemCompMD5ActionPerformed(evt);
	      }
	    });
	    jMenu5.add(menuItemCompMD5);
	    jMenu2.add(jMenu5);
	    jMenuBar1.add(jMenu2);
	    jMenu6.setMnemonic('k');
	    jMenu6.setText("KeyStore");
	    menuItemCreateKeyStore.setMnemonic('c');
	    menuItemCreateKeyStore.setText("Create Keystore...");
	    menuItemCreateKeyStore.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemCreateKeyStoreActionPerformed(evt);
	      }
	    });
	    jMenu6.add(menuItemCreateKeyStore);
	    menuItemAddKey.setMnemonic('a');
	    menuItemAddKey.setText("Add Key to Keystore...");
	    menuItemAddKey.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemAddKeyActionPerformed(evt);
	      }
	    });
	    jMenu6.add(menuItemAddKey);
	    menuItemDeleteKey.setMnemonic('d');
	    menuItemDeleteKey.setText("Delete Key from Keystore...");
	    menuItemDeleteKey.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemDeleteKeyActionPerformed(evt);
	      }
	    });
	    jMenu6.add(menuItemDeleteKey);
	    menuItemViewAliases.setMnemonic('v');
	    menuItemViewAliases.setText("View Aliases...");
	    menuItemViewAliases.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemViewAliasesActionPerformed(evt);
	      }
	    });
	    jMenu6.add(menuItemViewAliases);
	    jMenuBar1.add(jMenu6);
	    jMenu7.setMnemonic('c');
	    jMenu7.setText("Cipher");	 
	    menuItemEncryptFile.setMnemonic('e');
	    menuItemEncryptFile.setText("Encrypt File...");
	    menuItemEncryptFile.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemEncryptFileActionPerformed(evt);
	      }
	    });
	    jMenu7.add(menuItemEncryptFile);
	    menuItemDecryptFile.setMnemonic('d');
	    menuItemDecryptFile.setText("Decrypt File...");
	    menuItemDecryptFile.addActionListener(new java.awt.event.ActionListener() {
	    public void actionPerformed(java.awt.event.ActionEvent evt) {
	      menuItemDecryptFileActionPerformed(evt);
	      }
	    });
	    jMenu7.add(menuItemDecryptFile);
	    jMenuBar1.add(jMenu7);
	    setJMenuBar(jMenuBar1);
	    java.awt.Dimension screenSize =
	    java.awt.Toolkit.getDefaultToolkit().getScreenSize();
	    setBounds((screenSize.width-761)/2, (screenSize.height-516)/2, 761, 516);
    }
	 
    // </editor-fold>
	
    /**Delete a key from a keystore */
	
    private void menuItemDeleteKeyActionPerformed(java.awt.event.ActionEvent evt) {
    	String keyStorePath = new String(); //key store path with local scope (i.e. this method)
	    KeyGenerator kg = null;
	    SecretKey sKey = null;
	    JFileChooser chooser = new JFileChooser();
	    File defaultFile = new File("default.keystore");
	    chooser.setSelectedFile(defaultFile);
	    int returnVal = chooser.showOpenDialog(null);
	    if (returnVal == chooser.CANCEL_OPTION){ //exit method if user selects "Cancel"
	     return;
	    }
	    keyStorePath = chooser.getSelectedFile().getAbsolutePath(); //set pathname for file to work with
	    txtKeyStorePath.setText(keyFilePath); //set key store text box to key path
	    password = JOptionPane.showInputDialog("Please input the keystore password");
	    String alias = JOptionPane.showInputDialog("Please input an alias for the key that you want to delete");
	    CryptKeyStore keyStore = new CryptKeyStore();
	    int result = keyStore.deleteKey(keyStorePath, password, alias);
	    if (result == 1){
	     JOptionPane.showMessageDialog(null,"Key Successfully Deleted","Keystore",JOptionPane.INFORMATION_MESSAGE); //Now update the aliases text box to show the new set of aliases.
	     Enumeration aliases = keyStore.getAliases(keyStorePath, password);
	     StringBuffer strAliases = new StringBuffer();
	     for (int i = 0; aliases.hasMoreElements(); i++){
	      strAliases.append(aliases.nextElement() + "\n"); //Load StringBuffer with all aliases of the given KeyStore
	     }
	     String kStoreAliases = strAliases.toString();
	     txtAliases.setText(kStoreAliases);
	    }else{		
	    	JOptionPane.showMessageDialog(null,"Key Deletion Failed","Keystore",JOptionPane.WARNING_MESSAGE);				 
	    }  
    }
		
    /** Get the aliases of the keystore */
				 
    private void menuItemViewAliasesActionPerformed(java.awt.event.ActionEvent evt) {
				 JFileChooser chooser = new JFileChooser();
				 File defaultFile = new File("default.keystore");
				 chooser.setSelectedFile(defaultFile);
				 int returnVal = chooser.showOpenDialog(null);
				 if (returnVal == chooser.CANCEL_OPTION){ //exit method if user selects "Cancel"
				 return;
				 }
				 keyFilePath = chooser.getSelectedFile().getAbsolutePath(); //set pathname for file to work with
				 txtKeyStorePath.setText(keyFilePath); //set key store text box to key path
				 password = JOptionPane.showInputDialog("Please input a password");
				 CryptKeyStore keyStore = new CryptKeyStore();
				 Enumeration aliases = keyStore.getAliases(keyFilePath, password);
				 StringBuffer strAliases = new StringBuffer();
				 for (int i = 0; aliases.hasMoreElements(); i++){
				 strAliases.append(aliases.nextElement() + "\n");
				 //Load StringBuffer with all aliases of the given KeyStore
				 }
				 String kStoreAliases = strAliases.toString();
				 txtAliases.setText(kStoreAliases);
	
    }
    
    /** This method gets a secret key from a keystore and encrypts a file*/				 
    private void menuItemEncryptFileActionPerformed(java.awt.event.ActionEvent evt) {
				 //*******************************************
				 //** Get pathname to save the encrypted file
				 //*******************************************
				 JFileChooser chooser = new JFileChooser();
				 File DESDir = new File(pathname);
				 File DESOutputFileTemp = new File(pathname, DESDir.getName() + ".ENCRYPTED");
				 chooser.setCurrentDirectory(DESDir);
				 chooser.setSelectedFile(DESOutputFileTemp);
				 int returnVal = chooser.showSaveDialog(null);
				 File DESOutputFile = new File(chooser.getSelectedFile().getAbsolutePath());
				 String outFile = chooser.getSelectedFile().getAbsolutePath();
				 //Check to see if file exists and if it does ask user if he/she indeed wants to overwrite file
				 if (DESOutputFile.isFile()){
				 if(JOptionPane.showConfirmDialog(null, "File Exists. Overwrite File?",
				 "Confim", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
				 this.menuItemSaveSHA1ActionPerformed(evt);
				 return;
				 }
				 }
				 if (returnVal == chooser.CANCEL_OPTION){
				 return;
				 }
				 //***********************************************
				 //* Get pathname, alias, and password of the KeyStore File
				 //***********************************************
				 JFileChooser keyStoreChooser = new JFileChooser();
				 File defaultFile = new File("default.keystore");
				 keyStoreChooser.setSelectedFile(defaultFile);
				 int returnVal2 = keyStoreChooser.showOpenDialog(null);
				 if (returnVal2 == keyStoreChooser.CANCEL_OPTION){ //exit method if user selects "Cancel"
					 return;
					 }
					 String keyStorePath = keyStoreChooser.getSelectedFile().getAbsolutePath();
					 //set pathname for file to work with
					 txtKeyStorePath.setText(keyFilePath); //set key store text box to key path
					 password = JOptionPane.showInputDialog("Please input the keystore password");
					 String alias = JOptionPane.showInputDialog("Please input an alias for this key");
					 //***********************************************
					 //* Get secret key from keystore using keyStorePath
					 //***********************************************
					 CryptKeyStore keyStore = new CryptKeyStore();
					 SecretKey sKey = keyStore.getKey(keyStorePath, password, alias);
					 CryptCipher cipher = new CryptCipher();
					 int result = cipher.encrypt(pathname, outFile, sKey);
					 if (result == 1){
					 JOptionPane.showMessageDialog(null,"File Successfully Encrypted","Cipher",JOptionPane.INFORMATION_MESSAGE);
					 }else{
					 JOptionPane.showMessageDialog(null,"File Encryption was not Successful","Cipher",JOptionPane.WARNING_MESSAGE);
					 }
					 
    }
					 
    /** This method gets a secret key from a keystore and decrypts a file*/					 
    private void menuItemDecryptFileActionPerformed(java.awt.event.ActionEvent evt) {
					 //*******************************************
					 //** Get pathname of the encrypted input file
					 //*******************************************
					 JFileChooser encryptedChooser = new JFileChooser();
					 int returnVal0 = encryptedChooser.showOpenDialog(null);
					 if (returnVal0 == encryptedChooser.CANCEL_OPTION){ //exit method if user selects "Cancel"
					 return;
					 }
					 String encryptedPath = encryptedChooser.getSelectedFile().getAbsolutePath();
					 //set pathname for file to work with
					 //*******************************************
					 //** Get pathname to save the decrypted file
					 //*******************************************
					 JFileChooser chooser = new JFileChooser();
					 File DESDir = new File(encryptedChooser.getCurrentDirectory().getAbsolutePath());
					 File DESOutputFileTemp = new
					 File(encryptedChooser.getCurrentDirectory().getAbsolutePath(), encryptedPath.substring(0,
					 encryptedPath.lastIndexOf(".")) + ".DECRYPTED");
					 chooser.setCurrentDirectory(DESDir);
					 chooser.setSelectedFile(DESOutputFileTemp);
					 int returnVal = chooser.showSaveDialog(null);
					 File DESOutputFile = new File(chooser.getSelectedFile().getAbsolutePath());
					 String outFile = chooser.getSelectedFile().getAbsolutePath();
					 //Check to see if file exists and if it does ask user if he/she indeed wants to overwrite file
					 if (DESOutputFile.isFile()){
					 if(JOptionPane.showConfirmDialog(null, "File Exists. Overwrite File?",
					 "Confim", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
					 this.menuItemSaveSHA1ActionPerformed(evt);
					 return;
					 }
					 }
					 if (returnVal == chooser.CANCEL_OPTION){
						 return;
					 }
					 //***********************************************
					 //* Get pathname, alias, and password of the KeyStore File
					 //***********************************************
					 JFileChooser keyStoreChooser = new JFileChooser();
					 File defaultFile = new File("default.keystore");
					 keyStoreChooser.setSelectedFile(defaultFile);
					 int returnVal2 = keyStoreChooser.showOpenDialog(null);
					 if (returnVal2 == keyStoreChooser.CANCEL_OPTION){ //exit method if user selects "Cancel"
					 return;
					 }
					 String keyStorePath = keyStoreChooser.getSelectedFile().getAbsolutePath();
					 //set pathname for file to work with
					 txtKeyStorePath.setText(keyFilePath); //set key store text box to key path
					 password = JOptionPane.showInputDialog("Please input the keystore password");
					 String alias = JOptionPane.showInputDialog("Please input an alias for this key");
					 //***********************************************
					 //* Get secret key from keystore using keyStorePath
					 //***********************************************
					 CryptKeyStore keyStore = new CryptKeyStore();
					 SecretKey sKey = keyStore.getKey(keyStorePath, password, alias);
					 CryptCipher cipher = new CryptCipher();
					 int result = cipher.decrypt(encryptedPath, outFile, sKey);
					 if (result == 1){
					 JOptionPane.showMessageDialog(null,"File Successfully Decrypted","Cipher",JOptionPane.INFORMATION_MESSAGE);
					 }else{
					 JOptionPane.showMessageDialog(null,"File Decryption was not Successful","Cipher",JOptionPane.WARNING_MESSAGE);
					 }					 
    }
					 
    /** This method adds an item to a keystore*/					 
    private void menuItemAddKeyActionPerformed(java.awt.event.ActionEvent evt) {
					 String keyStorePath = new String(); //key store path with local scope (i.e. this method)
					 KeyGenerator kg = null;
					 SecretKey sKey = null;
					 JFileChooser chooser = new JFileChooser();
					 File defaultFile = new File("default.keystore");
					 chooser.setSelectedFile(defaultFile);
					 int returnVal = chooser.showOpenDialog(null);
					 if (returnVal == chooser.CANCEL_OPTION){ //exit method if user selects "Cancel"
					 return;
					 }
					 keyStorePath = chooser.getSelectedFile().getAbsolutePath(); //set pathname for file to work with
					 txtKeyStorePath.setText(keyFilePath); //set key store text box to key path
					 password = JOptionPane.showInputDialog("Please input the keystore password");
					 String alias = JOptionPane.showInputDialog("Please input an alias for this key");
					 CryptKeyStore keyStore = new CryptKeyStore();
					 try {
					 kg = KeyGenerator.getInstance("DES");
					 sKey = kg.generateKey();
					 }catch (Exception e){
					 System.out.println(e);
					 }
					 int result = keyStore.addKey(keyStorePath, password, sKey, alias);
					 if (result == 1){
					 JOptionPane.showMessageDialog(null,"Key Successfully Added","Keystore",JOptionPane.INFORMATION_MESSAGE);
					 Enumeration aliases = keyStore.getAliases(keyStorePath, password);
					 StringBuffer strAliases = new StringBuffer();
					 for (int i = 0; aliases.hasMoreElements(); i++){
					 strAliases.append(aliases.nextElement() + "\n");
					 //Load StringBuffer with all aliases of the given KeyStore
					 }
					 String kStoreAliases = strAliases.toString();
					 txtAliases.setText(kStoreAliases);
					 }else{
					 JOptionPane.showMessageDialog(null,"Key Addition Failed","Keystore",JOptionPane.WARNING_MESSAGE);
					 }
					 
    }
					 
    /** This method creates a keystore */					 
    private void menuItemCreateKeyStoreActionPerformed(java.awt.event.ActionEvent evt) {
					 JFileChooser chooser = new JFileChooser();
					 File defaultFile = new File("default.keystore");
					 chooser.setSelectedFile(defaultFile);
					 int returnVal = chooser.showOpenDialog(null);
					 if (returnVal == chooser.CANCEL_OPTION){ //exit method if user selects "Cancel"
					 return;
					 }
					 keyFilePath = chooser.getSelectedFile().getAbsolutePath(); //set pathname for file to work with
					 txtKeyStorePath.setText(keyFilePath); //set key store text box to key path
					 password = JOptionPane.showInputDialog("Please input a password");
					 CryptKeyStore keyStore = new CryptKeyStore();
					 int result = keyStore.createKeystore(keyFilePath, password);
					 if (result == 1){
					 JOptionPane.showMessageDialog(null,"Key Store Successfully Created","Keystore",JOptionPane.INFORMATION_MESSAGE);
					 }else{
					 JOptionPane.showMessageDialog(null,"Key Store Creation Failed","Keystore",JOptionPane.WARNING_MESSAGE);
					 }
					 
    }
					 
    /** This method fires both events to get the MD5 digest and the SHA1 digest */					 
    private void menuItemGetBothActionPerformed(java.awt.event.ActionEvent evt) {
					 this.menuItemGetMD5ActionPerformed(evt); //Get MD5 Digest
					 this.menuItemGetSHA1ActionPerformed(evt); //Get SHA1 Digest
					 
    }
					 
    /**This method compares the current MD5 digest with a SHA1 digest
					 * that is located in a file */				 
    private void menuItemCompMD5ActionPerformed(java.awt.event.ActionEvent evt) {
					 JFileChooser chooser = new JFileChooser();
					 File MD5Dir = new File(pathname);
					 File MD5OutputFileTemp = new File(pathname, MD5Dir.getName() + ".MD5");
					 chooser.setCurrentDirectory(MD5Dir);
					 chooser.setSelectedFile(MD5OutputFileTemp);
					 int returnVal = chooser.showOpenDialog(null);
					 if (returnVal == chooser.CANCEL_OPTION){
					 return;
					 }
					 StringBuffer contents = new StringBuffer();
					 BufferedReader input = null;
					 try {
						 input = new BufferedReader( new
								 FileReader(chooser.getSelectedFile().getAbsolutePath()));
								 String line = null; //not declared within while loop
								 while (( line = input.readLine()) != null){
								 contents.append(line);
								 }
								 }catch (FileNotFoundException ex) {
								 ex.printStackTrace();
								 }catch (IOException ex){
								 ex.printStackTrace();
								 }
								 finally {
								 try {
								 if (input!= null) {
								 //flush and close both "input" and its underlying FileReader
								 input.close();
								 }
								 }catch (IOException ex) {
								 ex.printStackTrace();
								 }
								 }
								 MessageDigest md = null;
								 boolean equalDigest;
								 try{
								 MessageDigest.getInstance("MD5");
								 equalDigest = md.isEqual(MD5Digest.getBytes(), contents.toString().getBytes());
								 if (equalDigest == true){
								 JOptionPane.showMessageDialog(null,"They are equal","MD5 Compare",JOptionPane.INFORMATION_MESSAGE);
								 } else {
								 JOptionPane.showMessageDialog(null,"They are not equal","SHA1 Compare",JOptionPane.WARNING_MESSAGE);
								 }
								 } catch (Exception e){
								 System.out.println(e);								 
								 }					 
    }
								 
    /**This method compares the current SHA1 digest with a SHA1 digest
								 * that is located in a file */	
    private void menuItemCompSHA1ActionPerformed(java.awt.event.ActionEvent evt) {
								 JFileChooser chooser = new JFileChooser();
								 File SHA1Dir = new File(pathname);
								 File SHA1OutputFileTemp = new File(pathname, SHA1Dir.getName() + ".SHA");
								 chooser.setCurrentDirectory(SHA1Dir);
								 chooser.setSelectedFile(SHA1OutputFileTemp);
								 int returnVal = chooser.showOpenDialog(null);
								 if (returnVal == chooser.CANCEL_OPTION){
								 return;
								 }
								 StringBuffer contents = new StringBuffer();
								 BufferedReader input = null;
								 try {
								 input = new BufferedReader( new
								 FileReader(chooser.getSelectedFile().getAbsolutePath()));
								 String line = null; //not declared within while loop
								 while (( line = input.readLine()) != null){
								 contents.append(line);
								 }
								 }catch (FileNotFoundException ex) {
								 ex.printStackTrace();
								 }catch (IOException ex){
								 ex.printStackTrace();
								 }
								 finally {
								 try {
									 if (input!= null) {
										//flush and close both "input" and its underlying FileReader
										input.close();
										}
										}catch (IOException ex) {
										ex.printStackTrace();
										}
										}
										MessageDigest md = null;
										boolean equalDigest;
										try{
										MessageDigest.getInstance("SHA1");
										equalDigest = md.isEqual(SHA1Digest.getBytes(),contents.toString().getBytes());
										if (equalDigest == true){
										JOptionPane.showMessageDialog(null,"The digests match","SHA1 Compare",JOptionPane.INFORMATION_MESSAGE);
										} else {
										JOptionPane.showMessageDialog(null,"The digests do not match","SHA1 Compare",JOptionPane.WARNING_MESSAGE);
										}
										} catch (Exception e){
										System.out.println(e);
										}
										
    }
										
    /** This method saves the MD5 digest to a file */
										
    private void menuItemSaveMD5ActionPerformed(java.awt.event.ActionEvent evt) {
										JFileChooser chooser = new JFileChooser();
										File MD5Dir = new File(pathname);
										File MD5OutputFileTemp = new File(pathname, MD5Dir.getName() + ".MD5");
										chooser.setCurrentDirectory(MD5Dir);
										chooser.setSelectedFile(MD5OutputFileTemp);
										int returnVal = chooser.showSaveDialog(null);
										File MD5OutputFile = new File(chooser.getSelectedFile().getAbsolutePath());
										//Check to see if file exists and if it does ask user if he/she indeed wants to overwrite file
										if (MD5OutputFile.isFile()){
										if(JOptionPane.showConfirmDialog(null, "File Exists. Overwrite File?",
										"Confim", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
										this.menuItemSaveMD5ActionPerformed(evt);
										return;
										}
										}
										//If user cancels, then just return
										if (returnVal == chooser.CANCEL_OPTION){
										return;
										}
										//Write throws eoutput file
										try {
										BufferedWriter out = new BufferedWriter(new
										FileWriter(chooser.getSelectedFile().getAbsolutePath()));
										out.write(MD5Digest);
										out.close();
										} catch (IOException e) {
										System.out.println(e);
										}
	
    }
    
    /** This method saves the SHA1 digest to a file */										
    private void menuItemSaveSHA1ActionPerformed(java.awt.event.ActionEvent evt) {
										JFileChooser chooser = new JFileChooser();
										File SHA1Dir = new File(pathname);
										File SHA1OutputFileTemp = new File(pathname, SHA1Dir.getName() + ".SHA");
										chooser.setCurrentDirectory(SHA1Dir);
										chooser.setSelectedFile(SHA1OutputFileTemp);
										int returnVal = chooser.showSaveDialog(null);
										File SHA1OutputFile = new File(chooser.getSelectedFile().getAbsolutePath());
										//Check to see if file exists and if it does ask user if he/she indeed wants to overwrite file
										if (SHA1OutputFile.isFile()){
										if(JOptionPane.showConfirmDialog(null, "File Exists. Overwrite File?",
										"Confim", JOptionPane.YES_NO_OPTION) != JOptionPane.YES_OPTION){
										this.menuItemSaveSHA1ActionPerformed(evt);
										return;
										}
										}
										if (returnVal == chooser.CANCEL_OPTION){
										return;
										}
										try {
										BufferedWriter out = new BufferedWriter(new
										FileWriter(chooser.getSelectedFile().getAbsolutePath()));
										out.write(SHA1Digest);
										out.close();
										} catch (IOException e) {
										System.out.println(e);
										}
	
    }
										
    /** This method closes the application */										
    private void menuItemExitActionPerformed(java.awt.event.ActionEvent evt) {
										System.exit(0);
										
    }
										
    /** This method changes the MD5 text box to hex or back */										
    private void chkHexMD5ActionPerformed(java.awt.event.ActionEvent evt) {
										if(chkHexMD5.isSelected()){
										txtMD5.setText("?");
												// CryptUtil.byteArray2Hex(txtMD5.getText()));
										}else {
										txtMD5.setText(MD5Digest);
										}
										
    }
    										
    /** This method changes the SHA1 text box to hex or back */										
    private void chkHexSHA1ActionPerformed(java.awt.event.ActionEvent evt) {
										if(chkHexSHA1.isSelected()){
										txtSHA1.setText("?");
												// CryptUtil.byteArray2Hex(txtSHA1.getText()));
										}else {
										txtSHA1.setText(SHA1Digest);
										}										
    }
										
										
    /** This method gets the MD5 of the file loaded */										
    private void menuItemGetMD5ActionPerformed(java.awt.event.ActionEvent evt) {
										CryptDigest myDigest = new CryptDigest();
										MD5Digest = myDigest.computeDigest(pathname, "MD5");
										txtMD5.setText(MD5Digest);
										
    }
										
    /** This method gets the SHA1 of the file loaded */										
    private void menuItemGetSHA1ActionPerformed(java.awt.event.ActionEvent evt) {
										CryptDigest myDigest = new CryptDigest();
										SHA1Digest = myDigest.computeDigest(pathname, "SHA1");
										txtSHA1.setText(SHA1Digest);
										
    }
										
    /** This method gets an input file from the user with a JFileChooser */										
    private void menuItemOpenFileActionPerformed(java.awt.event.ActionEvent evt) {
										JFileChooser chooser = new JFileChooser();
										int returnVal = chooser.showOpenDialog(null);
										if (returnVal == chooser.CANCEL_OPTION){ //exit method if user selects "Cancel"
										return;
										}
										pathname = chooser.getSelectedFile().getAbsolutePath(); //set pathname for file to work with
										//reset digest values and text box values to null when we select a new file
										txtInFilePathName.setText(pathname);
										txtMD5.setText(null);
										txtSHA1.setText(null);
										MD5Digest = null;
										SHA1Digest = null;
										
    }
									 
}
