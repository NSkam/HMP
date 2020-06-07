package hmp_gui;
import data.*;
import java.text.SimpleDateFormat;
import java.util.ArrayList;

/**
 *
 * @author Theodoros Tomadakis
 */

public class Dashboard_Headdoc extends javax.swing.JFrame {
    
            
    /**************     TEST DATA     ***************/
    private Clinic Clinic1 = new Clinic("Παθολογική", 200, 1600, 200, 300); //TEST DATA  gia klinikh
    Doctor d1 = new Doctor(1234, "Γιώργος Οικονόμου" , "Χειρουργός", Clinic1); //TEST DATA gia giatrous
    Doctor d2 = new Doctor(1235, "Αγγελική Παπαδοπούλου" , "Ενδοκρινολόγος", Clinic1);
    Doctor d3 = new Doctor(1237, "Νίκος Σηφάκης" , "Παθολόγος", Clinic1);
    Nosileutis n1 = new Nosileutis(1200,"Νίκος Ευσταθίου", Clinic1,d1); //TEST DATA gia nosileutes
    Nosileutis n2 = new Nosileutis(1201,"Ευάγγελος Μιχαήλ", Clinic1,d2);
    Nosileutis n3 = new Nosileutis(1202,"Μαρία Αθανασοπούλου", Clinic1,d3);
    Nosileutis n4 = new Nosileutis(1203,"Μαρία Γιαννίτση", Clinic1,d1);
    Nosileutis n5 = new Nosileutis(1204,"Χρήστος Χρήστου", Clinic1,d2);
    Patient p1 = new Patient(1100, "Ιωάννης Χρίστου", 14, "Κανένα προυπάρχον νόσημα", "Σχετικά καλά", d3, Patient.status_enum.good); //TEST DATA gia astheneis
    Patient p2 = new Patient(1101, "Λεωνίδας Νικολάου", 15, "Διαβήτης τύπου Α", "Πολύ καλά", d2, Patient.status_enum.good);
    Patient p3 = new Patient(1102, "Μάριος Χρηστίδης", 45, "Κανένα προυπάρχον νόσημα", "Άσχημα", d3, Patient.status_enum.bad);
    Patient p4 = new Patient(1103, "Ελένη Μακρή", 61, "Ζάχαρο", "Πολύ άσχημα", d2, Patient.status_enum.very_bad);
    Patient p5 = new Patient(1104, "Μαρία Λυμπέρη", 11, "Κανένα προυπάρχον νόσημα", "Εξαιρετικά", d3, Patient.status_enum.excellent);
    Patient p6 = new Patient(1105, "Κώσταντίνος Κυρίτσης", 12, "Καρκίνος στους λεμφαδένες", "Επικείμενος θάνατος", d1, Patient.status_enum.life_threatening);
    Patient p7 = new Patient(1106, "Αλέξανδρος Βήρας", 13, "Κανένα προυπάρχον νόσημα", "Εξαιρετικά", d3, Patient.status_enum.excellent);
    Patient p8 = new Patient(1107, "Παναγιώτης Ασωπός", 27, "Υψηλή πίεση, Υψηλή χοληστερίνη", "Πολύ άσχημα", d1, Patient.status_enum.very_bad);
    Patient p9 = new Patient(1108, "Ελεθυθέριος Αναστασίου", 37, "Κανένα προυπάρχον νόσημα", "Πολύ καλά", d3, Patient.status_enum.good);
    Patient p10 = new Patient(1109, "Χριστίνα Πάλλα", 75, "Μη επαρκείς πληροφορίες", "Επικείμενος θάνατος", d1, Patient.status_enum.life_threatening);
    OnCall OnCall_1 = new OnCall("01/07/2020", d1, Clinic1.getClinicName(), 1); //TEST DATA gia efhmeries 
    OnCall OnCall_2 = new OnCall("02/07/2020", d2, Clinic1.getClinicName(), 1);
    OnCall OnCall_3 = new OnCall("03/07/2020", d1, Clinic1.getClinicName(), 2);
    OnCall OnCall_4 = new OnCall("04/07/2020", d2, Clinic1.getClinicName(), 2);
    OnCall OnCall_5 = new OnCall("05/07/2020", d3, Clinic1.getClinicName(), 1); 
    Admission_Application adm1 = new Admission_Application (d3,Application.Type.admission_appl,p1); //TEST DATA gia aithseis eisithriwn
    Admission_Application adm2 = new Admission_Application (d2,Application.Type.admission_appl,p2);
    Admission_Application adm3 = new Admission_Application (d3,Application.Type.admission_appl,p3);
    Admission_Application adm4 = new Admission_Application (d2,Application.Type.admission_appl,p4);
    Admission_Application adm5 = new Admission_Application (d3,Application.Type.admission_appl,p5);
    Discharge_Application dis1 = new Discharge_Application (d1,Application.Type.discharge_appl,p6); //TEST DATA gia aithseis eksithriwn
    Discharge_Application dis2 = new Discharge_Application (d3,Application.Type.discharge_appl,p7);
    Discharge_Application dis3 = new Discharge_Application (d1,Application.Type.discharge_appl,p8);
    Discharge_Application dis4 = new Discharge_Application (d3,Application.Type.discharge_appl,p9);
    Discharge_Application dis5 = new Discharge_Application (d1,Application.Type.discharge_appl,p10);
    ArrayList<OnCall> TempOnCall = new ArrayList <OnCall>(200); //prosorini lista gia efhmeries
    ArrayList<Doctor> TempDoc = new ArrayList <Doctor>(200); //prosorini lista gia giatrous
    ArrayList <Discharge_Application> tempDis = new ArrayList <Discharge_Application> (200); //prosorini lista gia aithseis eksitrhriwn 
    ArrayList <Admission_Application> tempAdms = new ArrayList <Admission_Application> (200); //prosorini lista gia aithseis eisithriwn
    ArrayList<String> tempAdmissJ = new ArrayList <String>(200); //lista eisitiriwn poy tha emfanizetai
    ArrayList<String> tempDisJ = new ArrayList <String>(200); //lista eksitiriwn poy tha emfanizetai
    ArrayList<String> JOnCall_list_str = new ArrayList<String>(200); //lista efhmeriwn poy tha emfanizetai
    ArrayList<String> JComboList1 = new ArrayList<String>(200); //prosorini lista gia to jcombo giatrwn
    ArrayList<String> JComboList2 = new ArrayList<String>(200); //prosorini lista gia to jcombo asthenwn
    ArrayList<String> JComboList3 = new ArrayList<String>(200); //prosorini lista gia to jcombo nosileutwn
    HeadDoctor HD = new HeadDoctor (1600, "Πέτρος Δημόπουλος", "Χειρουργός", this.getClinic(), this.getClinic().getClinicName(), this.returnDocList()); //TEST DATA
    /**
     * Creates new form Dashboard_Headdoc
     */
    public Dashboard_Headdoc() {
        initComponents();
    }
    
    public Clinic getClinic(){ //epistrefei th klinikh tou dashboard
        return this.Clinic1;    
    } 
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Dashboard_Layer = new javax.swing.JLayeredPane();
        Button_Panel = new javax.swing.JPanel();
        logout_button = new javax.swing.JButton();
        Tab_Panel = new javax.swing.JPanel();
        Dashboard_tabs = new javax.swing.JTabbedPane();
        user_info = new javax.swing.JPanel();
        Parath_Plir = new javax.swing.JPanel();
        Plir = new javax.swing.JPanel();
        onomal = new javax.swing.JLabel();
        AMKA = new javax.swing.JLabel();
        eidik = new javax.swing.JLabel();
        klin = new javax.swing.JLabel();
        onoma = new javax.swing.JTextArea();
        this.getOnoma().setText(HD.getName());
        this.getOnoma().setEditable(false);
        amka = new javax.swing.JTextArea();
        String s4 = String.valueOf(HD.getAMKA());
        this.getAMKA().setText(s4);
        this.getAMKA().setEditable(false);
        edikotita = new javax.swing.JTextArea();
        this.getEidik().setText(HD.getSpeciality());
        this.getOnoma().setEditable(false);
        klinikh = new javax.swing.JTextArea();
        this.getKlin().setText(this.getClinic().getClinicName());
        this.getKlin().setEditable(false);
        jLabel5 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        this.epGiatroi();
        jLabel6 = new javax.swing.JLabel();
        jComboBox2 = new javax.swing.JComboBox<>();
        this.epAstheneis();
        jComboBox3 = new javax.swing.JComboBox<>();
        this.epNosileutes();
        jLabel7 = new javax.swing.JLabel();
        applications = new javax.swing.JPanel();
        jLabel2 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jScrollPane2 = new javax.swing.JScrollPane();
        eisitiria = new javax.swing.JList<>();
        this.InitAdmList();
        jScrollPane3 = new javax.swing.JScrollPane();
        eksitiria = new javax.swing.JList<>();
        this.InitDisList();
        jScrollPane4 = new javax.swing.JScrollPane();
        mal12 = new javax.swing.JList<>();
        jScrollPane5 = new javax.swing.JScrollPane();
        jList5 = new javax.swing.JList<>();
        jButton4 = new javax.swing.JButton();
        jButton5 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        DomKlin = new javax.swing.JTextField();
        String s3 = String.valueOf((this.getClinic().getNumOfBeds()) - (this.tempDis.size()));
        this.getDomKlin().setText(s3);
        this.getDomKlin().setEditable(false);
        patient_list = new javax.swing.JPanel();
        day_offs = new javax.swing.JPanel();
        supplies = new javax.swing.JPanel();
        clinic_info = new javax.swing.JPanel();
        on_call = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        OnCallList_J_Pane = new javax.swing.JScrollPane();
        OnCallList_J = new javax.swing.JList<>();
        this.InitOnCalllList();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jButton6 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(153, 204, 255));
        setLocationByPlatform(true);

        Dashboard_Layer.setBackground(new java.awt.Color(153, 204, 255));
        Dashboard_Layer.setForeground(new java.awt.Color(153, 204, 255));

        logout_button.setBackground(new java.awt.Color(255, 0, 0));
        logout_button.setText("Logout");
        logout_button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                logout_buttonActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout Button_PanelLayout = new javax.swing.GroupLayout(Button_Panel);
        Button_Panel.setLayout(Button_PanelLayout);
        Button_PanelLayout.setHorizontalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Button_PanelLayout.createSequentialGroup()
                .addComponent(logout_button, javax.swing.GroupLayout.PREFERRED_SIZE, 84, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        Button_PanelLayout.setVerticalGroup(
            Button_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Button_PanelLayout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(logout_button))
        );

        Dashboard_tabs.setTabPlacement(javax.swing.JTabbedPane.LEFT);

        user_info.setBackground(new java.awt.Color(153, 204, 255));
        user_info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        Parath_Plir.setBackground(new java.awt.Color(153, 204, 255));

        Plir.setBackground(new java.awt.Color(153, 204, 255));
        Plir.setBorder(javax.swing.BorderFactory.createTitledBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(255, 255, 255), 2), "", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Tahoma", 0, 11), new java.awt.Color(255, 255, 255))); // NOI18N

        onomal.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        onomal.setForeground(new java.awt.Color(255, 255, 255));
        onomal.setText("Ονοματεπώνυμο:");

        AMKA.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        AMKA.setForeground(new java.awt.Color(255, 255, 255));
        AMKA.setText("AMKA: ");

        eidik.setBackground(new java.awt.Color(255, 255, 255));
        eidik.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        eidik.setForeground(new java.awt.Color(255, 255, 255));
        eidik.setText("Ειδικότητα:");

        klin.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        klin.setForeground(new java.awt.Color(255, 255, 255));
        klin.setText("Κλινική:");

        onoma.setEditable(false);
        onoma.setColumns(20);
        onoma.setRows(5);

        amka.setEditable(false);
        amka.setColumns(20);
        amka.setRows(5);

        edikotita.setEditable(false);
        edikotita.setColumns(20);
        edikotita.setRows(5);

        klinikh.setEditable(false);
        klinikh.setColumns(20);
        klinikh.setRows(5);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Πληροφορίες Χρήστη");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(255, 255, 255));
        jLabel4.setText("Επ. Ιατροί:");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<String>());
        javax.swing.DefaultComboBoxModel<String> giatroi_list_model = (javax.swing.DefaultComboBoxModel<String>)jComboBox1.getModel();
        for(int x=0; x<JComboList1.size();x++){
            giatroi_list_model.addElement(JComboList1.get(x));
        }

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Επ. Ασθενείς:");

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<String>());
        javax.swing.DefaultComboBoxModel<String> asth_list_model = (javax.swing.DefaultComboBoxModel<String>)jComboBox2.getModel();
        for(int x=0; x<JComboList2.size();x++){
            asth_list_model.addElement(JComboList2.get(x));
        }

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<String>());
        javax.swing.DefaultComboBoxModel<String> nos_list_model = (javax.swing.DefaultComboBoxModel<String>)jComboBox3.getModel();
        for(int x=0; x<JComboList3.size();x++){
            nos_list_model.addElement(JComboList3.get(x));
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(255, 255, 255));
        jLabel7.setText("Eπ. Νοσηλευτές:");

        javax.swing.GroupLayout PlirLayout = new javax.swing.GroupLayout(Plir);
        Plir.setLayout(PlirLayout);
        PlirLayout.setHorizontalGroup(
            PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlirLayout.createSequentialGroup()
                .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(PlirLayout.createSequentialGroup()
                        .addGap(46, 46, 46)
                        .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(klin)
                            .addComponent(eidik)
                            .addComponent(AMKA)
                            .addComponent(onomal)
                            .addComponent(jLabel7)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(klinikh, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(edikotita, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(amka, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(onoma, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 297, Short.MAX_VALUE)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox2, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jComboBox3, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(PlirLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel5)))
                .addContainerGap(228, Short.MAX_VALUE))
        );
        PlirLayout.setVerticalGroup(
            PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(PlirLayout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel5)
                .addGap(29, 29, 29)
                .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(onoma, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(onomal, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(amka, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(AMKA, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(11, 11, 11)
                .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(edikotita, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(eidik, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(klinikh, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
                    .addComponent(klin, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel4)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(172, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout Parath_PlirLayout = new javax.swing.GroupLayout(Parath_Plir);
        Parath_Plir.setLayout(Parath_PlirLayout);
        Parath_PlirLayout.setHorizontalGroup(
            Parath_PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Plir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        Parath_PlirLayout.setVerticalGroup(
            Parath_PlirLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Plir, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout user_infoLayout = new javax.swing.GroupLayout(user_info);
        user_info.setLayout(user_infoLayout);
        user_infoLayout.setHorizontalGroup(
            user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parath_Plir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        user_infoLayout.setVerticalGroup(
            user_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Parath_Plir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp; Χρήστη</html>", user_info);

        applications.setBackground(new java.awt.Color(153, 204, 255));
        applications.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("Αιτήσεις Κλινικής");

        eisitiria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        eisitiria.setModel(new javax.swing.DefaultListModel<String>());
        //Update Default List Model for the Jlist
        javax.swing.DefaultListModel<String> admis_jlist_model = (javax.swing.DefaultListModel<String>)eisitiria.getModel();
        for(int x=0; x<tempAdmissJ.size();x++){
            admis_jlist_model.addElement(tempAdmissJ.get(x));
        }
        jScrollPane2.setViewportView(eisitiria);

        jTabbedPane1.addTab("Αιτήσεις εισιτηρίων", jScrollPane2);

        eksitiria.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        eksitiria.setModel(new javax.swing.DefaultListModel<String>());
        //Update Default List Model for the Jlist
        javax.swing.DefaultListModel<String> dis_jlist_model = (javax.swing.DefaultListModel<String>)eksitiria.getModel();
        for(int x=0; x<tempDisJ.size();x++){
            dis_jlist_model.addElement(tempDisJ.get(x));
        }
        jScrollPane3.setViewportView(eksitiria);

        jTabbedPane1.addTab("Αιτήσεις εξιτηρίων", jScrollPane3);

        mal12.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jScrollPane4.setViewportView(mal12);

        jTabbedPane1.addTab("<html>Αιτήσεις μεταφοράς σε <br>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; άλλη κλινική</html>", jScrollPane4);

        jList5.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        jScrollPane5.setViewportView(jList5);

        jTabbedPane1.addTab("<html>Αιτήσεις για εξέταση<br>&nbsp;&nbsp;&nbsp; σε άλλη κλινική</html>", jScrollPane5);

        jButton4.setText("Επιλογή αίτησης");
        jButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton4ActionPerformed(evt);
            }
        });

        jButton5.setText("Επιστροφή στο προφίλ");
        jButton5.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton5ActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 16)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(255, 255, 255));
        jLabel3.setText("Αριθμός διαθέσιμων δωματίων κλινικής:");

        javax.swing.GroupLayout applicationsLayout = new javax.swing.GroupLayout(applications);
        applications.setLayout(applicationsLayout);
        applicationsLayout.setHorizontalGroup(
            applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicationsLayout.createSequentialGroup()
                .addGroup(applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(applicationsLayout.createSequentialGroup()
                        .addGap(10, 10, 10)
                        .addComponent(jLabel2))
                    .addGroup(applicationsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, applicationsLayout.createSequentialGroup()
                                .addComponent(jButton4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jButton5))
                            .addComponent(jTabbedPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(applicationsLayout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(DomKlin, javax.swing.GroupLayout.PREFERRED_SIZE, 44, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(169, Short.MAX_VALUE))
        );
        applicationsLayout.setVerticalGroup(
            applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(applicationsLayout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 266, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addGroup(applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(DomKlin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(applicationsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton4)
                    .addComponent(jButton5))
                .addGap(70, 70, 70))
        );

        Dashboard_tabs.addTab("Αιτήσεις", applications);

        patient_list.setBackground(new java.awt.Color(153, 204, 255));
        patient_list.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout patient_listLayout = new javax.swing.GroupLayout(patient_list);
        patient_list.setLayout(patient_listLayout);
        patient_listLayout.setHorizontalGroup(
            patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        patient_listLayout.setVerticalGroup(
            patient_listLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp; Ασθενών</html>", patient_list);

        day_offs.setBackground(new java.awt.Color(153, 204, 255));
        day_offs.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout day_offsLayout = new javax.swing.GroupLayout(day_offs);
        day_offs.setLayout(day_offsLayout);
        day_offsLayout.setHorizontalGroup(
            day_offsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        day_offsLayout.setVerticalGroup(
            day_offsLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Διαχείριση<br>&nbsp;&nbsp;Άδειων</html>", day_offs);

        supplies.setBackground(new java.awt.Color(153, 204, 255));

        javax.swing.GroupLayout suppliesLayout = new javax.swing.GroupLayout(supplies);
        supplies.setLayout(suppliesLayout);
        suppliesLayout.setHorizontalGroup(
            suppliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 731, Short.MAX_VALUE)
        );
        suppliesLayout.setVerticalGroup(
            suppliesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 521, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Διαχείριση <br>Ιατρικών<br> Προμηθειών</hmtl>", supplies);

        clinic_info.setBackground(new java.awt.Color(153, 204, 255));
        clinic_info.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        javax.swing.GroupLayout clinic_infoLayout = new javax.swing.GroupLayout(clinic_info);
        clinic_info.setLayout(clinic_infoLayout);
        clinic_infoLayout.setHorizontalGroup(
            clinic_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        clinic_infoLayout.setVerticalGroup(
            clinic_infoLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 519, Short.MAX_VALUE)
        );

        Dashboard_tabs.addTab("<html>Πληροφορίες<br>&nbsp;&nbsp;&nbsp;&nbsp; Κλινικής</html>", clinic_info);

        on_call.setBackground(new java.awt.Color(153, 204, 255));
        on_call.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));

        jLabel1.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("Εφημερίες Κλινικής ");

        OnCallList_J.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 204, 204), 1, true));
        OnCallList_J.setModel(new javax.swing.DefaultListModel<String>());
        //Update Default List Model for the Jlist
        javax.swing.DefaultListModel<String> oncall_jlist_model = (javax.swing.DefaultListModel<String>)OnCallList_J.getModel();
        for(int x=0; x<JOnCall_list_str.size();x++){
            oncall_jlist_model.addElement(JOnCall_list_str.get(x));
        }
        OnCallList_J_Pane.setViewportView(OnCallList_J);

        jButton1.setText("Προσθήκη νέας εφημερίας");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton3.setText("Eπιστροφή στο προφίλ");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jButton2.setText("Επιλογή εφημερίας για ενημέωση");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton6.setText("Διαγραφή εφημερίας");
        jButton6.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton6ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout on_callLayout = new javax.swing.GroupLayout(on_call);
        on_call.setLayout(on_callLayout);
        on_callLayout.setHorizontalGroup(
            on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(on_callLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, on_callLayout.createSequentialGroup()
                            .addComponent(jButton1)
                            .addGap(18, 18, 18)
                            .addComponent(jButton6)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jButton2))
                        .addComponent(OnCallList_J_Pane, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 553, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jButton3)))
                .addContainerGap(157, Short.MAX_VALUE))
        );
        on_callLayout.setVerticalGroup(
            on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(on_callLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addGap(26, 26, 26)
                .addComponent(OnCallList_J_Pane, javax.swing.GroupLayout.PREFERRED_SIZE, 219, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(on_callLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)
                    .addComponent(jButton6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton3)
                .addContainerGap(138, Short.MAX_VALUE))
        );

        Dashboard_tabs.addTab("<html>Διαχείριση<br> Εφημεριών</html>", on_call);

        javax.swing.GroupLayout Tab_PanelLayout = new javax.swing.GroupLayout(Tab_Panel);
        Tab_Panel.setLayout(Tab_PanelLayout);
        Tab_PanelLayout.setHorizontalGroup(
            Tab_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_PanelLayout.createSequentialGroup()
                .addComponent(Dashboard_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 818, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 133, Short.MAX_VALUE))
        );
        Tab_PanelLayout.setVerticalGroup(
            Tab_PanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Tab_PanelLayout.createSequentialGroup()
                .addComponent(Dashboard_tabs, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        Dashboard_Layer.setLayer(Button_Panel, 2);
        Dashboard_Layer.setLayer(Tab_Panel, 1);

        javax.swing.GroupLayout Dashboard_LayerLayout = new javax.swing.GroupLayout(Dashboard_Layer);
        Dashboard_Layer.setLayout(Dashboard_LayerLayout);
        Dashboard_LayerLayout.setHorizontalGroup(
            Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(Dashboard_LayerLayout.createSequentialGroup()
                .addComponent(Button_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dashboard_LayerLayout.createSequentialGroup()
                    .addComponent(Tab_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );
        Dashboard_LayerLayout.setVerticalGroup(
            Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, Dashboard_LayerLayout.createSequentialGroup()
                .addGap(0, 503, Short.MAX_VALUE)
                .addComponent(Button_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(Dashboard_LayerLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(Dashboard_LayerLayout.createSequentialGroup()
                    .addComponent(Tab_Panel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE)))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard_Layer, javax.swing.GroupLayout.PREFERRED_SIZE, 819, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Dashboard_Layer, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    //Otan ginete logout kanei clear to token pou deixnei to eidos xrhsth
    private void clearTokens(){ 
        Login.headdoc_counter = false;
    }
    
    //Logout Function
    private void logout_buttonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_logout_buttonActionPerformed
        clearTokens();
        dispose();
        Login login_page = new Login();
        login_page.setVisible(true);
    }//GEN-LAST:event_logout_buttonActionPerformed

    //Dhmiourgei neo parathuro gia thn prosthikh efhmerias
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        Enhmerwsh_Efhmerias ef1 = new Enhmerwsh_Efhmerias(this);
        ef1.setVisible(true);
        this.setEnabled(false);
    }//GEN-LAST:event_jButton1ActionPerformed
    
    //otan patietai eksodos sth selida twn efhmeriwn, paei sthn arxikh selida tou profil
    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        Dashboard_tabs.setSelectedIndex(0);    
    }//GEN-LAST:event_jButton3ActionPerformed

    //epilogh efhmerias
    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
      if (!(OnCallList_J.isSelectionEmpty())){ //an exei epilegei efhmeria
        int oncall_index = OnCallList_J.getSelectedIndex(); //pare to index toy jlist
        OnCall oc1 = Clinic1.getOnCallList().get(oncall_index); ///dhmiourgise nea efhmeria
        Enhmerwsh_Yparxoysas_Efhmerias en1 = new Enhmerwsh_Yparxoysas_Efhmerias(this, oc1, oncall_index); //dhmiourghse neo parathiro gia enhmerwsh efhmeria me ta parapanw orismata
        en1.ShowOnCallInfo(oc1); //emfanise ta stoixeia ths efhmerias sto neo parathiro
        en1.setVisible(true);
        this.setEnabled(false);
      }else{//an den exei epilegei efhmeria 
        Conditional_Message con1 = new Conditional_Message(this);
        con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Πρέπει να επιλέξετε μια εφημερία!</html>");
        con1.setVisible(true);
        this.setEnabled(false);
      }     
    }//GEN-LAST:event_jButton2ActionPerformed
    
    //otan patietai eksodos sth selida twn aithsewn, paei sthn arxikh selida tou profil 
    private void jButton5ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton5ActionPerformed
        Dashboard_tabs.setSelectedIndex(0); 
    }//GEN-LAST:event_jButton5ActionPerformed
    
    //epilogh aithshs gia dhmiourgia prathurou
    private void jButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton4ActionPerformed
        this.getDomKlin().setEditable(false); //se periptwsh pou exei ginei diorthwsh prin
        if (!(eisitiria.isSelectionEmpty()) && ((jTabbedPane1.getSelectedIndex())==0)){ //an exei epilegei aithsh apo ta eisitiria
            int eis_index = eisitiria.getSelectedIndex();  //pare to index toy jlist twn eisithriwn
            if ((eis_index!=-1)){ //an to index einai egkuro
                Admission_Application app1 = tempAdms.get(eis_index); //pare thn aithsh me to index
                Parathiro_Aithsewn pa1 = new Parathiro_Aithsewn(this, app1, eis_index); //ftiakse neo parathiro gia plhrofores aithshs
                pa1.ShowAppAdmInfo(app1);
                pa1.setVisible(true);
                this.setEnabled(false);
            }
	}else if (!(eksitiria.isSelectionEmpty()) && ((jTabbedPane1.getSelectedIndex())==1)){ //an exei epilegei aithsh apo ta eksitiria
		int eks_index = eksitiria.getSelectedIndex(); //pare to index toy jlist twn eksithriwn
                if((eks_index!=-1) ){ //an to index einai egkuro
                Discharge_Application app2 = tempDis.get(eks_index); //pare thn aithsh me to index
                Parathiro_Aithsewn pa2 = new Parathiro_Aithsewn(this, app2, eks_index); //ftiakse neo parathiro gia plhrofores aithshs
                pa2.ShowAppDisInfo(app2);
                pa2.setVisible(true);
                this.setEnabled(false); 
            }
        }else{//an den exei epilegei aithsh
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Πρέπει να επιλέξετε μια αίτηση!</html>");
            con1.setVisible(true);
            this.setEnabled(false);
        }
    }//GEN-LAST:event_jButton4ActionPerformed

    //gia remove efhmerias
    private void jButton6ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton6ActionPerformed
        if (!(OnCallList_J.isSelectionEmpty())){ //an exei epilegei efhmeria
            int oncall_index = OnCallList_J.getSelectedIndex(); //pare to index toy jlist
            Clinic1.getOnCallList().remove(oncall_index); //kave remove thn efhmeria apo th lista tis kliniks
            javax.swing.DefaultListModel<String>  oncall_jlist_model = (javax.swing.DefaultListModel<String>)this.getOnCall_list().getModel(); //pernume to modelo ths jlist toy dashboard_headdoc
            oncall_jlist_model.removeElementAt(oncall_index); // kanuume remove thn efhmeria pou thelume apo to jlist
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Επιτυχία διαγραφής εφημερίας!</html>");
            con1.setVisible(true);
            this.setEnabled(false);
        }else{//an den exei epilegei efhmeria 
            Conditional_Message con1 = new Conditional_Message(this);
            con1.triggerMsg("<html>&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;Πρέπει να επιλέξετε μια εφημερία!</html>");
            con1.setVisible(true);
            this.setEnabled(false);
        }  
    }//GEN-LAST:event_jButton6ActionPerformed
            
    //Epistrefei thn OnCallList_J
    public javax.swing.JList<String> getOnCall_list(){
        return this.OnCallList_J;
    }
    
    //Epistrefei ta tabs tou parathirou
    public javax.swing.JTabbedPane returnTabs(){
        return  Dashboard_tabs;   
    }
    
    //epistrefei to tab twn aithsewn
    public javax.swing.JTabbedPane returnTabsAit(){
        return  jTabbedPane1;   
    }
    
    //prosthetei tis efhmeries sthn prosorini lista poy ftiaksame kai epistrefei th lista
    public ArrayList<OnCall> returnOnCalls(){      
        TempOnCall.add(OnCall_1); 
        TempOnCall.add(OnCall_2);
        TempOnCall.add(OnCall_3);
        TempOnCall.add(OnCall_4);
        TempOnCall.add(OnCall_5);
        return TempOnCall;
    }
    
    //prosthetei tous giatrous sthn lista giatrwn ths klinikhs kai thn epistrefei
    public ArrayList<Doctor> returnDocList(){
        Clinic1.getPersonnel().add(d1);
        Clinic1.getPersonnel().add(d2);
        Clinic1.getPersonnel().add(d3);
        return Clinic1.getPersonnel();
    }
    
    //prosthetei tous nosileutes sth lista nosileutwn ths klinikhs kai thn epistrefei
    public ArrayList<Nosileutis> returnNosileutes(){
        Clinic1.getNosileutes().add(n1);
        Clinic1.getNosileutes().add(n2);
        Clinic1.getNosileutes().add(n3);
        Clinic1.getNosileutes().add(n4);
        Clinic1.getNosileutes().add(n5);
        return Clinic1.getNosileutes();
    }
    
    //Gia na arxikopoihsoyme tis efhmeries ths klinikhs
    public void InitOnCalllList(){
        this.returnOnCalls();     
        Clinic1.getOnCallList().add(TempOnCall.get(0));
        int j = 1 ;//counter
        for (int i = 1; i<TempOnCall.size(); i++){//checkarume an oi efhmeries sumpeftoun kai an oxi tis prosthetume sth lista ths klinikhs
                if (Clinic1.checkOnCallDate(TempOnCall.get(i).getOnCallDate(),TempOnCall.get(i-1).getOnCallDate())){ //elexgoume an oi hmeromhnies sumpeftoun, h methodos einai sth klash headdoc
                        Clinic1.getOnCallList().add(TempOnCall.get(i)); //an den sumpeftun, tis prosthetw sth lista
                        j++; //to counter einai gia thn jlist
                }
        }
        //Ftiaxnoume to List pou tha kanei display tis Efhmeries sto JList twn Efhmeriwn
         JOnCall_list_str .clear(); //katharizw prwta th jlist
         for(int i=0 ; i<j; i++){ //auto poy tha emfanistei
             this.JOnCall_list_str.add("Ημερομηνία: " + Clinic1.getOnCallList().get(i).getOnCallDate()+ "   " + "Όνομα Γιατρού: " + Clinic1.getOnCallList().get(i).getOnCallDoc().getName()+ "    "+  "ΑΜΚΑ Γιατρού: " + Clinic1.getOnCallList().get(i).getAMKAOnCall() + "   " + "Κλινική: " + Clinic1.getClinicName() + "   " + "Αριθμός Εφημερίας: " + Clinic1.getOnCallList().get(i).getNum_OnCall());
         }
    }
    
    //prosthetei sti prosorini lista twn aithsewn (eks) kai epistrefei th lista 
    public ArrayList<Discharge_Application> returnTempDis(){
        tempDis.add(dis1);
        tempDis.add(dis2);
        tempDis.add(dis3);
        tempDis.add(dis4);
        tempDis.add(dis5);
        return tempDis;
    }
    
    //prosthetei sti prosorini lista twn aithsewn (eis) kai epistrefei th lista 
    public ArrayList<Admission_Application> returnTempAdms(){
        tempAdms.add(adm1);
        tempAdms.add(adm2);
        tempAdms.add(adm3);
        tempAdms.add(adm4);
        tempAdms.add(adm5); 
        return tempAdms;
    }
   
    //gia na arxikopoishsoyme th lista twn aithsewn eksitiriwn
    public void InitDisList(){
        this.returnTempDis();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //formatter gia date 
        //Ftiaxnoume to List pou tha kanei display tis aithseis eksitiriwn sto JList twn Aithsewn twn eksitiriwn
        tempDisJ.clear(); //katharizw prwta th jlist
        for (int i=0; i<tempDis.size(); i++){
            this.tempDisJ.add("ID Αίτησης: " + tempDis.get(i).getID() +"    " + "Υποβλήθηκε από: " + tempDis.get(i).getDoctor().getName() + "    " + "Ημερομηνία: " + formatter.format(tempDis.get(i).getDate()) + "    " + "Ασθενής: " + tempDis.get(i).getPatient().getName() + "    " + "Κατάσταση: " + tempDis.get(i).getStatus());     
        }
    }
    
    //gia na arxikopoihsoyme h lista twn aithsewn eisitiriwn
    public void InitAdmList(){
        this.returnTempAdms();
        SimpleDateFormat formatter = new SimpleDateFormat("dd/MM/yyyy"); //formateter gia date 
        tempAdmissJ.clear(); //katharizw prwta th jlist
        
        //Ftiaxnoume to List pou tha kanei display tis aithseis eisitiriwn sto JList twn Aithsewn twn eisitiriwn
        for (int i=0; i<tempAdms.size(); i++){
            this.tempAdmissJ.add("ID Αίτησης: " + tempAdms.get(i).getID() +"    " + "Υποβλήθηκε από: " + tempAdms.get(i).getDoctor().getName() + "    " + "Ημερομηνία: " + formatter.format(tempAdms.get(i).getDate()) + "    " + "Ασθενής: " + tempAdms.get(i).getPatient().getName() + "   " + "Κατάσταση: " + tempAdms.get(i).getStatus());
        }    
    }
    
    //prosthetei toys giatrous sto jcombobox1
    public void epGiatroi(){
        ArrayList<Doctor> e = this.Clinic1.getPersonnel();
        jComboBox1.removeAllItems(); 
        for (int i = 0; i<e.size(); i++){
            String amka12 = String.valueOf(e.get(i).getAMKA()); //amka twn giatrwn
            String onoma12 = e.get(i).getName(); //onoma twn giatrwn
            this.JComboList1.add("Όνομα: " + onoma12 + "    " + "AMKA: " + amka12); //to prosthetw sto jcombo
        }
    }
    
    //prosthetei toys astheneis sto jcombobox2
    public void epAstheneis(){
       Clinic1.getPatientList().add(p1);
       Clinic1.getPatientList().add(p2);
       Clinic1.getPatientList().add(p3);
       Clinic1.getPatientList().add(p4);
       Clinic1.getPatientList().add(p5);
       Clinic1.getPatientList().add(p6);
       Clinic1.getPatientList().add(p7);
       Clinic1.getPatientList().add(p8);
       Clinic1.getPatientList().add(p9);
       Clinic1.getPatientList().add(p10);
       jComboBox1.removeAllItems(); 
       for (int i = 0; i<Clinic1.getPatientList().size(); i++){
            String amka12 = String.valueOf(Clinic1.getPatientList().get(i).getAmka()); //amka twn asthenwn
            String onoma12 = Clinic1.getPatientList().get(i).getName(); //onoma twn asthenwn
            this.JComboList2.add("Όνομα: " + onoma12 + "    " + "AMKA: " + amka12); //to prosthetw sto jcombo
       }
    }
    
    //prosthetei toys nosileutes sto jcombobox3
    public void epNosileutes(){
        ArrayList<Nosileutis> e = this.returnNosileutes();
        jComboBox3.removeAllItems();
        for (int i = 0; i<e.size(); i++){
            String amka12 = String.valueOf(e.get(i).getAmka()); //amka twn nosileutwn
            String onoma12 = e.get(i).getName(); //onoma twn nosileutwn
            String onoma13 = e.get(i).getDocName();
            this.JComboList3.add("Όνομα: " + onoma12 + "    " + "AMKA: " + amka12+ "    " + "Επ. Ιατρός: " + onoma13); //to prosthetw sto jcombo
        }
    }
    
    //epistrefei to text area tou onomatos 
    public javax.swing.JTextArea getOnoma(){
        return this.onoma;
    }
    
    //epistrefei to text area tou amka
    public javax.swing.JTextArea getAMKA(){
        return this.amka;
    }
    
    //epistrefei to text area ths eidikotitas
    public javax.swing.JTextArea getEidik(){
        return this.edikotita;
    }
    
    //epistrefei to text area ths klinikhs
    public javax.swing.JTextArea getKlin(){
        return this.klinikh;
    }
    
    //epistrefei thn orath lista twn eisitiriwn
    public javax.swing.JList<String> getEisitiria(){
        return this.eisitiria;
    }
    
    //epistrefei thn orath lista twn eksitiriwn
    public javax.swing.JList<String> getEksitiria(){
        return this.eksitiria;
    }
    
    //epistrefei to text field twn dwmatiwn
    public javax.swing.JTextField getDomKlin(){
        return this.DomKlin;
    }
    
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
            java.util.logging.Logger.getLogger(Dashboard_Headdoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Headdoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Headdoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Dashboard_Headdoc.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Dashboard_Headdoc().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel AMKA;
    private javax.swing.JPanel Button_Panel;
    private javax.swing.JLayeredPane Dashboard_Layer;
    private javax.swing.JTabbedPane Dashboard_tabs;
    private javax.swing.JTextField DomKlin;
    private javax.swing.JList<String> OnCallList_J;
    private javax.swing.JScrollPane OnCallList_J_Pane;
    private javax.swing.JPanel Parath_Plir;
    private javax.swing.JPanel Plir;
    private javax.swing.JPanel Tab_Panel;
    private javax.swing.JTextArea amka;
    private javax.swing.JPanel applications;
    private javax.swing.JPanel clinic_info;
    private javax.swing.JPanel day_offs;
    private javax.swing.JTextArea edikotita;
    private javax.swing.JLabel eidik;
    private javax.swing.JList<String> eisitiria;
    private javax.swing.JList<String> eksitiria;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JButton jButton4;
    private javax.swing.JButton jButton5;
    private javax.swing.JButton jButton6;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JList<String> jList5;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel klin;
    private javax.swing.JTextArea klinikh;
    private javax.swing.JButton logout_button;
    private javax.swing.JList<String> mal12;
    private javax.swing.JPanel on_call;
    private javax.swing.JTextArea onoma;
    private javax.swing.JLabel onomal;
    private javax.swing.JPanel patient_list;
    private javax.swing.JPanel supplies;
    private javax.swing.JPanel user_info;
    // End of variables declaration//GEN-END:variables
}
