
package atm;

import java.awt.Toolkit;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class atmpro extends javax.swing.JFrame {
    
    static Connection c;
    static PreparedStatement s;
    static String query;
    static ResultSet r;
    
    private String password;
    public atmpro() throws SQLException {
        initComponents();
        setLocationRelativeTo(null);
        setIconImage();

    }
    
    public static boolean check(String p,int v) throws SQLException{
        query="select mon from cust where pass='"+p+"'";
        s=c.prepareStatement(query);
        r=s.executeQuery(query);
        r.next();
        int  check= r.getInt("mon");
        
          if(check>=v)
              return true;
          else
              return false;
    }
    
    public static void wd(int v ,String p) throws SQLException{
         query="update cust set mon=mon+'"+(v*(-1))+"' where pass='"+p+"' and mon>='"+v+"'";
         s=c.prepareStatement(query);
         s.execute(query);
    }
    public static String  print_mon(String p) throws SQLException{
       query="select mon from cust where pass='"+p+"'";
        s=c.prepareStatement(query);
        r=s.executeQuery(query);
        r.next();
        String x= r.getString("mon");
        return x;
   }
    
   public static void update_password(String v,String v1) throws SQLException{
        query="update cust set pass= '"+v1+"' where pass= '"+v+"'";
        s=c.prepareStatement(query);
        s.execute(query);
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel7 = new javax.swing.JPanel();
        At = new javax.swing.JLabel();
        atm_photo = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        fulltab = new javax.swing.JTabbedPane();
        login_tab = new javax.swing.JPanel();
        logIn = new javax.swing.JButton();
        photo = new javax.swing.JLabel();
        enterpssword = new javax.swing.JLabel();
        pass = new javax.swing.JPasswordField();
        insider_tab = new javax.swing.JPanel();
        jPanel4 = new javax.swing.JPanel();
        Home = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        WD = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        Deposit = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        Exit = new javax.swing.JButton();
        jLabel10 = new javax.swing.JLabel();
        Password = new javax.swing.JButton();
        jLabel13 = new javax.swing.JLabel();
        Donation = new javax.swing.JButton();
        insidertab = new javax.swing.JTabbedPane();
        home = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        Balance = new javax.swing.JLabel();
        jLabel15 = new javax.swing.JLabel();
        wd = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        getWD = new javax.swing.JTextField();
        OKWD = new javax.swing.JButton();
        jLabel17 = new javax.swing.JLabel();
        dep = new javax.swing.JPanel();
        OKdesposit = new javax.swing.JButton();
        jLabel14 = new javax.swing.JLabel();
        getDesposit = new javax.swing.JTextField();
        jLabel21 = new javax.swing.JLabel();
        donation = new javax.swing.JPanel();
        okdonation = new javax.swing.JButton();
        jLabel16 = new javax.swing.JLabel();
        getdonation = new javax.swing.JTextField();
        jLabel24 = new javax.swing.JLabel();
        ch_pass = new javax.swing.JPanel();
        apply = new javax.swing.JButton();
        jLabel18 = new javax.swing.JLabel();
        jLabel19 = new javax.swing.JLabel();
        oldpass = new javax.swing.JPasswordField();
        newpass = new javax.swing.JPasswordField();
        jLabel25 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setMaximumSize(new java.awt.Dimension(750, 750));
        setResizable(false);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel7.setBackground(new java.awt.Color(18, 168, 157));

        At.setFont(new java.awt.Font("Tahoma", 1, 48)); // NOI18N
        At.setForeground(new java.awt.Color(255, 255, 255));
        At.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        At.setText("ATM");

        atm_photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/531881-256.png"))); // NOI18N

        javax.swing.GroupLayout jPanel7Layout = new javax.swing.GroupLayout(jPanel7);
        jPanel7.setLayout(jPanel7Layout);
        jPanel7Layout.setHorizontalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(137, 137, 137)
                .addComponent(atm_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 197, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(At)
                .addGap(0, 279, Short.MAX_VALUE))
        );
        jPanel7Layout.setVerticalGroup(
            jPanel7Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel7Layout.createSequentialGroup()
                .addGap(8, 8, 8)
                .addComponent(atm_photo, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel7Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(At)
                .addGap(33, 33, 33))
        );

        getContentPane().add(jPanel7, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 750, 130));

        jPanel2.setBackground(new java.awt.Color(18, 168, 157));
        jPanel2.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());
        getContentPane().add(jPanel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 713, 750, 72));

        login_tab.setBackground(new java.awt.Color(255, 255, 255));

        logIn.setBackground(new java.awt.Color(51, 129, 124));
        logIn.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        logIn.setForeground(new java.awt.Color(255, 255, 255));
        logIn.setText("LOG IN");
        logIn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logInActionPerformed(evt);
            }
        });

        photo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/33.png"))); // NOI18N

        enterpssword.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        enterpssword.setForeground(new java.awt.Color(230, 116, 106));
        enterpssword.setText("Enter password : ");

        pass.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        javax.swing.GroupLayout login_tabLayout = new javax.swing.GroupLayout(login_tab);
        login_tab.setLayout(login_tabLayout);
        login_tabLayout.setHorizontalGroup(
            login_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_tabLayout.createSequentialGroup()
                .addGap(233, 233, 233)
                .addGroup(login_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 247, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(login_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(pass)
                        .addComponent(enterpssword)
                        .addComponent(logIn, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE)))
                .addContainerGap(208, Short.MAX_VALUE))
        );
        login_tabLayout.setVerticalGroup(
            login_tabLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(login_tabLayout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addComponent(photo, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(enterpssword, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pass, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addComponent(logIn, javax.swing.GroupLayout.PREFERRED_SIZE, 60, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(55, 55, 55))
        );

        fulltab.addTab("tab1", login_tab);

        insider_tab.setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jPanel4.setBackground(new java.awt.Color(18, 168, 157));

        Home.setBackground(new java.awt.Color(18, 168, 157));
        Home.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Home.setForeground(new java.awt.Color(255, 255, 255));
        Home.setText("Home");
        Home.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Home.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                HomeActionPerformed(evt);
            }
        });

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel3.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel4.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/wd2.png"))); // NOI18N

        jLabel7.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel7.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/hom1.png"))); // NOI18N

        WD.setBackground(new java.awt.Color(18, 168, 157));
        WD.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        WD.setForeground(new java.awt.Color(255, 255, 255));
        WD.setText("Withdrawal");
        WD.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        WD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                WDActionPerformed(evt);
            }
        });

        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/dep2.png"))); // NOI18N

        Deposit.setBackground(new java.awt.Color(18, 168, 157));
        Deposit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Deposit.setForeground(new java.awt.Color(255, 255, 255));
        Deposit.setText("Deposit");
        Deposit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Deposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DepositActionPerformed(evt);
            }
        });

        jLabel9.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/exit1 l.png"))); // NOI18N

        Exit.setBackground(new java.awt.Color(18, 168, 157));
        Exit.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Exit.setForeground(new java.awt.Color(255, 255, 255));
        Exit.setText("Exit");
        Exit.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Exit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ExitActionPerformed(evt);
            }
        });

        jLabel10.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/set1.png"))); // NOI18N

        Password.setBackground(new java.awt.Color(18, 168, 157));
        Password.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Password.setForeground(new java.awt.Color(255, 255, 255));
        Password.setText("password");
        Password.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Password.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                PasswordActionPerformed(evt);
            }
        });

        jLabel13.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel13.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/donat.png"))); // NOI18N

        Donation.setBackground(new java.awt.Color(18, 168, 157));
        Donation.setFont(new java.awt.Font("Tahoma", 1, 20)); // NOI18N
        Donation.setForeground(new java.awt.Color(255, 255, 255));
        Donation.setText("Donation");
        Donation.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2));
        Donation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DonationActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Exit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Password, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                        .addGroup(jPanel4Layout.createSequentialGroup()
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel7, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(2, 2, 2)
                            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(Deposit, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(WD, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)))
                        .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel4Layout.createSequentialGroup()
                            .addGap(73, 73, 73)
                            .addComponent(jLabel2)))
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel13)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Donation, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(Home, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(26, 26, 26)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(WD))
                .addGap(10, 10, 10)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Deposit))
                .addGap(18, 18, 18)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(Donation)))
                .addGap(26, 26, 26)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 163, Short.MAX_VALUE)
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel4Layout.createSequentialGroup()
                        .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(Exit)))
                    .addComponent(Password))
                .addGap(36, 36, 36))
        );

        insider_tab.add(jPanel4, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, -10, 220, 600));

        insidertab.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        home.setBackground(new java.awt.Color(255, 255, 255));

        jLabel5.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(230, 116, 106));
        jLabel5.setText("Your Balance:");

        Balance.setBackground(new java.awt.Color(255, 255, 255));
        Balance.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        Balance.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 137, 245), 2));

        jLabel15.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel15.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/h2.png"))); // NOI18N

        javax.swing.GroupLayout homeLayout = new javax.swing.GroupLayout(home);
        home.setLayout(homeLayout);
        homeLayout.setHorizontalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, homeLayout.createSequentialGroup()
                .addContainerGap(110, Short.MAX_VALUE)
                .addComponent(jLabel5)
                .addGap(18, 18, 18)
                .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(54, 54, 54))
            .addGroup(homeLayout.createSequentialGroup()
                .addGap(226, 226, 226)
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        homeLayout.setVerticalGroup(
            homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(homeLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel15, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(187, 187, 187)
                .addGroup(homeLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Balance, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(homeLayout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel5)))
                .addContainerGap(202, Short.MAX_VALUE))
        );

        insidertab.addTab("Home", home);

        wd.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(230, 116, 106));
        jLabel1.setText("Enter number:");

        getWD.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getWD.setText("0");

        OKWD.setBackground(new java.awt.Color(51, 129, 124));
        OKWD.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OKWD.setForeground(new java.awt.Color(255, 255, 255));
        OKWD.setText("OK");
        OKWD.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKWDActionPerformed(evt);
            }
        });

        jLabel17.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel17.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/w3.png"))); // NOI18N

        javax.swing.GroupLayout wdLayout = new javax.swing.GroupLayout(wd);
        wd.setLayout(wdLayout);
        wdLayout.setHorizontalGroup(
            wdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wdLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(wdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(OKWD, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(getWD, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(161, 161, 161))
            .addGroup(wdLayout.createSequentialGroup()
                .addGap(220, 220, 220)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 149, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(221, Short.MAX_VALUE))
        );
        wdLayout.setVerticalGroup(
            wdLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(wdLayout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addComponent(jLabel17, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(104, 104, 104)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(getWD, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(OKWD, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(100, Short.MAX_VALUE))
        );

        insidertab.addTab("Wd", wd);

        dep.setBackground(new java.awt.Color(255, 255, 255));

        OKdesposit.setBackground(new java.awt.Color(51, 129, 124));
        OKdesposit.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        OKdesposit.setForeground(new java.awt.Color(255, 255, 255));
        OKdesposit.setText("OK");
        OKdesposit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                OKdespositActionPerformed(evt);
            }
        });

        jLabel14.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel14.setForeground(new java.awt.Color(230, 116, 106));
        jLabel14.setText("Enter number:");

        getDesposit.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getDesposit.setText("0");

        jLabel21.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel21.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/d3.png"))); // NOI18N

        javax.swing.GroupLayout depLayout = new javax.swing.GroupLayout(dep);
        dep.setLayout(depLayout);
        depLayout.setHorizontalGroup(
            depLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(depLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(OKdesposit, javax.swing.GroupLayout.DEFAULT_SIZE, 231, Short.MAX_VALUE)
                    .addComponent(getDesposit, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(161, 161, 161))
            .addGroup(depLayout.createSequentialGroup()
                .addGap(206, 206, 206)
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 170, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(214, Short.MAX_VALUE))
        );
        depLayout.setVerticalGroup(
            depLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(depLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel21, javax.swing.GroupLayout.PREFERRED_SIZE, 152, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(100, 100, 100)
                .addComponent(jLabel14)
                .addGap(18, 18, 18)
                .addComponent(getDesposit, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(95, 95, 95)
                .addComponent(OKdesposit, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(80, Short.MAX_VALUE))
        );

        insidertab.addTab("Ch_Pass", dep);

        donation.setBackground(new java.awt.Color(255, 255, 255));

        okdonation.setBackground(new java.awt.Color(51, 129, 124));
        okdonation.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        okdonation.setForeground(new java.awt.Color(255, 255, 255));
        okdonation.setText("OK");
        okdonation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                okdonationActionPerformed(evt);
            }
        });

        jLabel16.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel16.setForeground(new java.awt.Color(230, 116, 106));
        jLabel16.setText("Enter number to donate:");

        getdonation.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        getdonation.setText("0");

        jLabel24.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel24.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/dt1.png"))); // NOI18N

        javax.swing.GroupLayout donationLayout = new javax.swing.GroupLayout(donation);
        donation.setLayout(donationLayout);
        donationLayout.setHorizontalGroup(
            donationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donationLayout.createSequentialGroup()
                .addContainerGap(166, Short.MAX_VALUE)
                .addGroup(donationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addComponent(okdonation, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel16, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(getdonation, javax.swing.GroupLayout.Alignment.LEADING))
                .addGap(161, 161, 161))
            .addGroup(donationLayout.createSequentialGroup()
                .addGap(197, 197, 197)
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        donationLayout.setVerticalGroup(
            donationLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(donationLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel24, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(90, 90, 90)
                .addComponent(jLabel16)
                .addGap(18, 18, 18)
                .addComponent(getdonation, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(87, 87, 87)
                .addComponent(okdonation, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(107, Short.MAX_VALUE))
        );

        insidertab.addTab("tab5", donation);

        ch_pass.setBackground(new java.awt.Color(255, 255, 255));

        apply.setBackground(new java.awt.Color(51, 129, 124));
        apply.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        apply.setForeground(new java.awt.Color(255, 255, 255));
        apply.setText("apply");
        apply.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                applyActionPerformed(evt);
            }
        });

        jLabel18.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel18.setForeground(new java.awt.Color(230, 116, 106));
        jLabel18.setText("Enter old password:");

        jLabel19.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel19.setForeground(new java.awt.Color(230, 116, 106));
        jLabel19.setText("Enter new password:");

        oldpass.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        newpass.setFont(new java.awt.Font("Tahoma", 0, 20)); // NOI18N

        jLabel25.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel25.setIcon(new javax.swing.ImageIcon(getClass().getResource("/atm/st1.png"))); // NOI18N

        javax.swing.GroupLayout ch_passLayout = new javax.swing.GroupLayout(ch_pass);
        ch_pass.setLayout(ch_passLayout);
        ch_passLayout.setHorizontalGroup(
            ch_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, ch_passLayout.createSequentialGroup()
                .addContainerGap(198, Short.MAX_VALUE)
                .addGroup(ch_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(ch_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(apply, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel19, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(newpass)
                        .addComponent(jLabel18)
                        .addComponent(oldpass)))
                .addGap(167, 167, 167))
        );
        ch_passLayout.setVerticalGroup(
            ch_passLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(ch_passLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel25, javax.swing.GroupLayout.PREFERRED_SIZE, 143, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(80, 80, 80)
                .addComponent(jLabel18)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(oldpass, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel19)
                .addGap(18, 18, 18)
                .addComponent(newpass, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(apply, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(76, Short.MAX_VALUE))
        );

        insidertab.addTab("Dep", ch_pass);

        insider_tab.add(insidertab, new org.netbeans.lib.awtextra.AbsoluteConstraints(86, -4, 670, 590));

        fulltab.addTab("tab2", insider_tab);

        getContentPane().add(fulltab, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 94, 750, 620));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void logInActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logInActionPerformed
       if(evt.getSource() ==logIn ) {
           String s= pass.getText().toString();
           try {
                PreparedStatement ps=c.prepareStatement("Select pass from cust");
                ResultSet r=ps.executeQuery();
                boolean f1=true;
                while(r.next()){
                    if( r.getString("pass").equalsIgnoreCase(pass.getText())){
                        f1=false;
                        break;
                    }
                }
                if(f1==true){
                    JOptionPane.showMessageDialog(null, "invalid password", "Error", JOptionPane.CANCEL_OPTION);
                    pass.setText("");
                }
                else{
                   password=s;
                   fulltab.setSelectedIndex(1);
                   insidertab.setSelectedIndex(0);
                   pass.setText("");
                   String x=print_mon(password);
                   Balance.setText(x); 
               }
           } catch (SQLException ex) {
               System.out.println(ex.getMessage());
           }
       }
    }//GEN-LAST:event_logInActionPerformed

    private void OKWDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKWDActionPerformed
        if(evt.getSource()==OKWD){
            int s1=Integer.parseInt(getWD.getText());
            try {
                if(check(password, s1)){
                    wd(s1,password);
                    JOptionPane.showMessageDialog(null, "Withdrawal is successfully", "Withdrawal", JOptionPane.INFORMATION_MESSAGE);
                }else
                    JOptionPane.showMessageDialog(null, "Can't do opertion !!, check your balance", "Error", JOptionPane.CANCEL_OPTION);
                
                String x=print_mon(password);
                 Balance.setText(x);
                 insidertab.setSelectedIndex(0);
                 getWD.setText("0");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_OKWDActionPerformed

    private void OKdespositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_OKdespositActionPerformed
        if(evt.getSource()== OKdesposit){
            long s2=Integer.parseInt(getDesposit.getText());
            try {
                query="update cust set mon=mon+'"+(s2)+"' where pass='"+password+"'";
                s=c.prepareStatement(query);
                s.execute(query);

                JOptionPane.showMessageDialog(null, "Deposit is successfully", "Deposit", JOptionPane.INFORMATION_MESSAGE);

                String x=print_mon(password);
                Balance.setText(x);
                insidertab.setSelectedIndex(0);
                getDesposit.setText("0");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_OKdespositActionPerformed

    private void okdonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_okdonationActionPerformed
        if(evt.getSource()==okdonation){
            int s3=Integer.parseInt(getdonation.getText());
            try {
                
                 if(check(password, s3)){
                    wd(s3,password);
                     JOptionPane.showMessageDialog(null, "Donation is successfully", "Donation", JOptionPane.INFORMATION_MESSAGE);
                }else
                   JOptionPane.showMessageDialog(null, "Can't dow opertion !!, check your balance", "Error", JOptionPane.CANCEL_OPTION);
                
                String x=print_mon(password);
                Balance.setText(x);
                insidertab.setSelectedIndex(0);
                getdonation.setText("0");

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_okdonationActionPerformed

    private void applyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_applyActionPerformed

        if(evt.getSource()==apply){
            String s4= oldpass.getText().toString();
            String s5=newpass.getText().toString();
            try {
                    if(newpass.getText().equalsIgnoreCase("") || oldpass.getText().equalsIgnoreCase("")){
                        
                         JOptionPane.showMessageDialog(null, "You must fill all fields", "Error", JOptionPane.CANCEL_OPTION);
                         
                    }else{
                            PreparedStatement ps=c.prepareStatement("Select pass from cust");
                            ResultSet r=ps.executeQuery();
                            boolean f1=true,f2=true;
                            while(r.next()){
                                if( r.getString("pass").equalsIgnoreCase(newpass.getText())){
                                    f1=false;
                                    break;
                                }
                            }
                            PreparedStatement pss=c.prepareStatement("Select pass from cust");
                            ResultSet r2=pss.executeQuery();
                            while(r2.next()){
                                if( r2.getString("pass").equalsIgnoreCase(oldpass.getText())){
                                    f2=false;
                                    break;
                                }
                            }
                            
                            
                            if(f1==false){
                                JOptionPane.showMessageDialog(null, "password reserved", "Error", JOptionPane.CANCEL_OPTION);
                                newpass.setText("");
                            }
                            if(f2==true){
                                JOptionPane.showMessageDialog(null, "invalid Old password", "Error", JOptionPane.CANCEL_OPTION);
                                oldpass.setText("");
                            }
                            
                            if(f1==true && f2== false){
                                update_password(s4, s5);
                                JOptionPane.showMessageDialog(null, "Update is successfully", "Edit", JOptionPane.INFORMATION_MESSAGE);
                                oldpass.setText("");
                                newpass.setText("");
                                password=s5;
                                insidertab.setSelectedIndex(0);
                            }
                    }

            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
    }//GEN-LAST:event_applyActionPerformed

    private void HomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_HomeActionPerformed
        insidertab.setSelectedIndex(0);
    }//GEN-LAST:event_HomeActionPerformed

    private void WDActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_WDActionPerformed
        insidertab.setSelectedIndex(1);
    }//GEN-LAST:event_WDActionPerformed

    private void DepositActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DepositActionPerformed
        insidertab.setSelectedIndex(2);
    }//GEN-LAST:event_DepositActionPerformed

    private void ExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ExitActionPerformed
        fulltab.setSelectedIndex(0);
        Balance.setText("");
        oldpass.setText("");
        newpass.setText("");
        getDesposit.setText("");
        getDesposit.setText("");
        getdonation.setText("");
    }//GEN-LAST:event_ExitActionPerformed

    private void PasswordActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_PasswordActionPerformed
        insidertab.setSelectedIndex(4);
    }//GEN-LAST:event_PasswordActionPerformed

    private void DonationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DonationActionPerformed
        insidertab.setSelectedIndex(3);
    }//GEN-LAST:event_DonationActionPerformed

    public static void main(String args[]) {
        
        Sec c1= new Sec();
         try{
            c=c1.connect();
             System.out.println("conected");
        }catch(SQLException e){
            System.out.println(e.getMessage());
        }
       
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    new atmpro().setVisible(true);
                } catch (SQLException ex) {
                    Logger.getLogger(atmpro.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel At;
    private javax.swing.JLabel Balance;
    private javax.swing.JButton Deposit;
    private javax.swing.JButton Donation;
    private javax.swing.JButton Exit;
    private javax.swing.JButton Home;
    private javax.swing.JButton OKWD;
    private javax.swing.JButton OKdesposit;
    private javax.swing.JButton Password;
    private javax.swing.JButton WD;
    private javax.swing.JButton apply;
    private javax.swing.JLabel atm_photo;
    private javax.swing.JPanel ch_pass;
    private javax.swing.JPanel dep;
    private javax.swing.JPanel donation;
    private javax.swing.JLabel enterpssword;
    private javax.swing.JTabbedPane fulltab;
    private javax.swing.JTextField getDesposit;
    private javax.swing.JTextField getWD;
    private javax.swing.JTextField getdonation;
    private javax.swing.JPanel home;
    private javax.swing.JPanel insider_tab;
    private javax.swing.JTabbedPane insidertab;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel15;
    private javax.swing.JLabel jLabel16;
    private javax.swing.JLabel jLabel17;
    private javax.swing.JLabel jLabel18;
    private javax.swing.JLabel jLabel19;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel24;
    private javax.swing.JLabel jLabel25;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel7;
    private javax.swing.JButton logIn;
    private javax.swing.JPanel login_tab;
    private javax.swing.JPasswordField newpass;
    private javax.swing.JButton okdonation;
    private javax.swing.JPasswordField oldpass;
    private javax.swing.JPasswordField pass;
    private javax.swing.JLabel photo;
    private javax.swing.JPanel wd;
    // End of variables declaration//GEN-END:variables

    private void setIconImage() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("500.png")));
    }
}
