/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JackPatRuss;

import javax.swing.table.DefaultTableModel;

/**
 *
 * @author John Patrick Mateo
 */
public class ArrayDB {

    String[] colNames = {"Book Number", "Title", "Author", "Year", "Availability"};
    String[][] tblData = {{"B100101", "Trusted platform module basics", "Steven Kinney", "1999", "YES"},
    {"B100102", "Practical Embedded Security", "Timothy Stapko", "1998", "YES"},
    {"B100103", "Microcomputers in engineering and science", "J. Ffynlo Craine", "2001", "YES"},
    {"B100104", "The windows serial port programming handbook", "Ying Bai", "2007", "YES"},
    {"B100105", "Hard disk smarts", "Chris A. Bosshardt", "2004", "YES"},
    {"B100106", "An introduction to computer science and technology", "Tom Logsdon", "1999", "YES"},
    {"B100107", "Servicing Personal Computers", "Michael H Tooley", "1999", "YES"},
    {"B100108", "Computer storage systems and technology", "Richard E. Matick", "2009", "YES"},
    {"B100109", "The hard disk technical guide", "Douglas T. Anderson", "2010", "YES"},
    {"B100110", "Modeling embedded systems and SoCs", "Axel Jantsch", "2000", "YES"},
    {"B100111", "Hard disk quick reference", "Ed X. DeJesus", "2006", "YES"},
    {"B100112", "Computer-aided experimentation", "Jules Finkel", "1999", "YES"},
    {"B100113", "Verification techniques for system-level design", "Masahiro Fujita", "1998", "YES"},
    {"B100114", "Microcomputer Electronics", "Daniel Metzger", "2001", "YES"},
    {"B100115", "Introduction to IBM direct access storage devices", "Marilyn Bohl", "2007", "YES"},
    {"B100116", "Embedded Systems Design with 8051 Microcontrollers", "Masahiro Fujita", "2004", "YES"},
    {"B100117", "Semiconductor Memories", "Betty Prince", "1999", "YES"},
    {"B100118", "Embedded systems", "James K Peckols", "1999", "YES"},
    {"B100119", "Practical FPGA programming in C", "David Pellerin", "2009", "YES"},
    {"B100120", "How Computers Really Work", "Milind S. Pandit", "2010", "YES"},
    {"B100121", "USB complete", "Jan Axelson", "2000", "YES"},
    {"B100122", "Embedded Systems", "James K. Peckols", "2006", "YES"},
    {"B100123", "Spoken natural language dialog systems", "Ronnie W. Smith", "2010", "YES"},
    {"B100124", "Serial port complete", "Jan Axelson", "2003", "YES"},
    {"B100125", "An introduction to computer science and technology", "Tom Logsdon", "1999", "YES"}};

    DefaultTableModel dtaRec = new DefaultTableModel(tblData, colNames);

    String[] colUser = {"User ID", "Password", "Firstname", "Middlename", "Surname", "Type"};
    String[][] tblDataUsers = {{"1210266", "123456", "John Patrick", "Mendoza", "Mateo", "Admin"},
    {"1210270", "123456", "Russell", "Pastor", "Cuevas", "Admin"},
    {"1214447", "123456", "Jacinto", " Gollas", "Serraon", "Admin"},
    {"1210401", "123456", "Mark", "Lee", "Mendoza", "User"},
    {"1210275", "123456", "Karl", "Reyes", "Ibanez", "User"},
    {"1220243", "123456", "Patrick", "Manese", "De Jesus", "User"},
    {"1210570", "123456", "Mary", "izenhower", "Potter", "User"},
    {"1210896", "123456", "Jean May", "Milagros", "Reyes", "User"},
    {"1210475", "123456", "Yasmin", "Mendoza", "Mateo", "User"},
    {"1210111", "123456", "Ken", "Izuka", "Kaneki", "User"},
    {"1210224", "123456", "Kirigaya", "Kirito", "Kazuto", "User"},
    {"1210769", "123456", "Rize", "Minouka", "Kamishiro", "User"},
    {"1210844", "123456", "Kei", "Ichiban", "Shirogane", "User"},
    {"1210921", "123456", "Naotsugu", "Ryu", "Hasegawa", "User"},
    {"1210645", "123456", "Jessica", "Marie", "Alba", "User"}};
    
    
    
    DefaultTableModel dtaUsers = new DefaultTableModel(tblDataUsers, colUser);

}
