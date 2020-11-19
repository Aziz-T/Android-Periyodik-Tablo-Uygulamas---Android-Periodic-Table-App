package com.k.periyodiktablo;

import java.util.ArrayList;
import java.util.List;

public class VeriTabani {
    List<AtomModeli> atomModeliList = new ArrayList<>();


    public VeriTabani() {

        atomModeliList.add(new AtomModeli("H","Hydrogen","1","Nonmetal","1,008","1","-1,+1","Gas","Colorless","1s1","1","1","0"));
        atomModeliList.add(new AtomModeli("He","Helium","2","Noble Gas","4,0026","2","0","Gas","Colorless","1s2","2","2","2"));
        atomModeliList.add(new AtomModeli("Li","Lithium","3","Alkaline Metal","6,9","2-1","-1,+1","Solid","Silver","1s2 2s1","3","3","4"));
        atomModeliList.add(new AtomModeli("Be","Berllium","4","Alkaline Earth","9,0122","2-2","+2","Solid","Slate","1s2 2s2","4","4","5"));
        atomModeliList.add(new AtomModeli("B","Boron","5","Semimetal","10,8","2-3","+3","Solid","Black","1s2 2s2 2p1","5","5","6"));
        atomModeliList.add(new AtomModeli("C","Carbon","6","Nonmetal","12,0107","2-4","-4,+2,+4","Solid","Black","1s2 2s2 2p2","6","6","6"));
        atomModeliList.add(new AtomModeli("N","Nitrogen","7","Nonmetal","14,0067","2-5","-3,-2,-1,+1,+2,+3,+4,+5","Gas","Colorless","1s2 2s2 2p3","7","7","7"));
        atomModeliList.add(new AtomModeli("O","Oxygen","8","Nonmetal","15,9994","2-6","-2,-1,+1,+2","Gas","Colorless","1s2 2s2 2p4","8","8","8"));
        atomModeliList.add(new AtomModeli("F","Fluorine","9","Halogen","18,9984","2-7","-1","Gas","Colorless","1s2 2s2 2p5","9","9","10"));
        atomModeliList.add(new AtomModeli("Ne","Neon","10","Noble Gas","20,1797","2-8","0","Gas","Colorless","1s2 2s2 2p6","10","10","10"));
        atomModeliList.add(new AtomModeli("Na","Sodium","11","Alkaline Metal","22,9897","2-8-1","+1","Solid","Silver","1s2 2s2 2p6 3s1","11","11","12"));
        atomModeliList.add(new AtomModeli("Mg","Magnesium","12","Alkaline Earth","24,3","2-8-2","+2","Solid","Silver","1s2 2s2 2p6 3s2","12","12","12"));
        atomModeliList.add(new AtomModeli("Al","Aluminum","13","Basic Metal","26,9815","2-8-3","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p1","13","13","14"));
        atomModeliList.add(new AtomModeli("Si","Silicon","14","Semimetal","28,0855","2-8-4","-4,+2,+4","Solid","Grey","1s2 2s2 2p6 3s2 3p2","14","14","14"));
        atomModeliList.add(new AtomModeli("P","Phosphorus","15","Nonmetal","30,9738","2-8-5","-3,+3,+4,+5","Solid","Colorless","1s2 2s2 2p6 3s2 3p3","15","15","16"));
        atomModeliList.add(new AtomModeli("S","Sulfur","16","Nonmetal","32,065","2-8-6","-2,+2,+4,+6","Solid","Yellow","1s2 2s2 2p6 3s2 3p4","16","16","16"));
        atomModeliList.add(new AtomModeli("Cl","Chlorine","17","Halogen","35,453","2-8-7","-1,+1,+3,+5,+7","Gas","Yellow","1s2 2s2 2p6 3s2 3p5","17","17","18"));
        atomModeliList.add(new AtomModeli("Ar","Argon","18","Noble Gas","39,948","2-8-8","0","Gas","Colorless","1s2 2s2 2p6 3s2 3p6","18","18","22"));

        atomModeliList.add(new AtomModeli("K","Potassium","19","Alkaline Metal","39,0983","2-8-8-1","+1","Solid","Silver","1s2 2s2 2p6 3s2 3p6 4s1","19","19","20"));
        atomModeliList.add(new AtomModeli("Ca","Calcium","20","Alkaline Earth","40,078","2-8-8-2","+2","Solid","Silver","1s2 2s2 2p6 3s2 3p6 4s2","20","20","20"));
        atomModeliList.add(new AtomModeli("Sc","Scandium","21","Transition Metal","44,9559","2-8-9-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d1 4s2","21","21","24"));
        atomModeliList.add(new AtomModeli("Ti","Titanium","22","Transition Metal","47,867","2-8-10-2","+2,+3,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d2 4s2","22","22","26"));
        atomModeliList.add(new AtomModeli("V","Vanadium","23","Transition Metal","50,9415","2-8-11-2","+2,+3,+4,+5","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d3 4s2","23","23","28"));
        atomModeliList.add(new AtomModeli("Cr","Chromium","24","Transition Metal","51,9961","2-8-13-1","-2,+2,+3,+4,+6","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d5 4s1","24","24","28"));
        atomModeliList.add(new AtomModeli("Mn","Manganese","25","Transition Metal","54,938","2-8-13-2","-1,+2,+3,+4,+5,+6,+7","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d5 4s2","25","25","30"));
        atomModeliList.add(new AtomModeli("Fe","Iron","26","Transition Metal","55,845","2-8-14-2","-2,+2,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d6 4s2","26","26","30"));
        atomModeliList.add(new AtomModeli("Co","Cobalt","27","Transition Metal","58,9332","2-8-15-2","-1,+2,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d7 4s2","27","27","32"));
        atomModeliList.add(new AtomModeli("Ni","Nickel","28","Transition Metal","58,6934","2-8-16-2","-1,+2,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d8 4s2","28","28","31"));
        atomModeliList.add(new AtomModeli("Cu","Copper","29","Transition Metal","63,546","2-8-18-1","+1,+2","Solid","Copper Tone","1s2 2s2 2p6 3s2 3p6 3d10 4s1","29","29","35"));
        atomModeliList.add(new AtomModeli("Zn","Zinc","30","Transition Metal","65,39","2-8-18-2","+2","Solid","Slate","1s2 2s2 2p6 3s2 3p6 3d10 4s2","30","30","35"));
        atomModeliList.add(new AtomModeli("Ga","Gallium","31","Basic Metal","69,723","2-8-18-3","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p1","31","31","39"));
        atomModeliList.add(new AtomModeli("Ge","Germanium","32","Semimetal","72,64","2-8-18-4","+2,+4","Solid","Grey","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p2","32","32","41"));
        atomModeliList.add(new AtomModeli("As","Arsenic","33","Semimetal","74,9216","2-8-18-5","-3,+3,+5","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p3","33","33","42"));
        atomModeliList.add(new AtomModeli("Se","Selenium","34","Nonmetal","78,96","2-8-18-6","-2,+2,+4,+6","Solid","Grey","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p4","34","34","45"));
        atomModeliList.add(new AtomModeli("Br","Bromine","35","Halogen","79,904","2-8-18-7","-1,+1,+3,+5,+7","Solid","Red","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p5","35","35","45"));
        atomModeliList.add(new AtomModeli("Kr","Krypton","36","Noble Gas","83,8","2-8-18-8","0,+2,+4","Gas","Colorless","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6","36","36","48"));

        atomModeliList.add(new AtomModeli("Rb","Rubidium","37","Alkaline Metal","85,4678","2-8-18-8-1","+1","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 5s1","37","37","48"));
        atomModeliList.add(new AtomModeli("Sr","Strontium","38","Alkaline Earth","87,62","2-8-18-8-2","+2","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 5s2","38","38","50"));
        atomModeliList.add(new AtomModeli("Y","Yttrium","39","Transition Metal","88,9059","2-8-18-9-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d1 5s2","39","39","50"));
        atomModeliList.add(new AtomModeli("Zr","Zirconium","40","Transition Metal","91,224","2-8-18-10-2","+3,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d2 5s2","40","40","51"));
        atomModeliList.add(new AtomModeli("Nb","Niobium","41","Transition Metal","92,9064","2-8-18-12-1","-1,+3,+5","Solid","Gray","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d4 5s1","41","41","52"));
        atomModeliList.add(new AtomModeli("Mo","Molybdenum","42","Transition Metal","95,94","2-8-18-13-1","-2,+2,+3,+4,+5,+6","Solid","Gray","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d5 5s1","42","42","54"));
        atomModeliList.add(new AtomModeli("Tc","Technetium","43","Transition Metal","98","2-8-18-13-2","-1,+4,+7","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d5 5s2","43","43","55"));
        atomModeliList.add(new AtomModeli("Ru","Ruthenium","44","Transition Metal","101,07","2-8-18-15-1","-2,+2,+3,+4,+6,+8","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d7 5s1","44","44","57"));
        atomModeliList.add(new AtomModeli("Rh","Rhodium","45","Transition Metal","102,9055","2-8-18-16-1","-1,+2,+3,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d8 5s1","45","45","58"));
        atomModeliList.add(new AtomModeli("Pd","Palladium","46","Transition Metal","106,42","2-8-18-18","+2,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10","46","46","60"));
        atomModeliList.add(new AtomModeli("Ag","Silver","47","Transition Metal","107,8682","2-8-18-18-1","+1,+2","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s1","47","47","61"));
        atomModeliList.add(new AtomModeli("Cd","Cadmium","48","Transition Metal","112,411","2-8-18-18-2","+2","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2","48","48","64"));
        atomModeliList.add(new AtomModeli("In","Indium","49","Basic Metal","114,818","2-8-18-18-3","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p1","49","49","66"));
        atomModeliList.add(new AtomModeli("Sn","Tin","50","Basic Metal","118,71","2-8-18-18-4","+2,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p2","50","50","69"));
        atomModeliList.add(new AtomModeli("Sb","Antimony","51","Semimetal","121,76","2-8-18-18-5","-3,+3,+5","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p3","51","51","71"));
        atomModeliList.add(new AtomModeli("Te","Tellurium","52","Semimetal","127,6","2-8-18-18-6","-2,+2,+4,+6","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p4","52","52","76"));
        atomModeliList.add(new AtomModeli("I","Iodine","53","Halogen","126,9045","2-8-18-18-7","-1,+1,+5,+7","Solid","Slate","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p5","53","53","74"));
        atomModeliList.add(new AtomModeli("Xe","Xenon","54","Noble Gas","131,293","2-8-18-18-8","0,+2,+4,+6,+8","Gas","Colorless","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6","54","54","77"));

        atomModeliList.add(new AtomModeli("Cs","Cesium","55","Alkaline Metal","132,9055","2-8-18-18-8-1","+1","Solid","Yellow","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 6s1","55","55","78"));
        atomModeliList.add(new AtomModeli("Ba","Barium","56","Alkaline Earth","137,327","2-8-18-18-8-2","+2","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 6s2","56","56","81"));
        atomModeliList.add(new AtomModeli("-","-","-","Lanthanide","","","","","","","","",""));
        atomModeliList.add(new AtomModeli("La","Lanthanum","57","Lanthanide","138,9055","2-8-18-18-9-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 5d1 6s2","57","57","82"));
        atomModeliList.add(new AtomModeli("Ce","Cerium","58","Lanthanide","140,116","2-8-18-19-9-2","+3,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f1 5d1 6s2","58","58","82"));
        atomModeliList.add(new AtomModeli("Pr","Praseodymium","59","Lanthanide","140,9077","2-8-18-21-8-2","+3,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f3 6s2","59","59","82"));
        atomModeliList.add(new AtomModeli("Nd","Neodymium","60","Lanthanide","144,24","2-8-18-22-8-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f4 6s2 4f4 6s2","60","60","84"));
        atomModeliList.add(new AtomModeli("Pm","Promethium","61","Lanthanide","145","2-8-18-23-8-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f5 6s2","61","61","84"));
        atomModeliList.add(new AtomModeli("Sm","Samarium","62","Lanthanide","150,36","2-8-18-24-8-2","+2,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f6 6s2","62","62","88"));
        atomModeliList.add(new AtomModeli("Eu","Europium","63","Lanthanide","151,964","2-8-18-25-8-2","+2,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f7 6s2","63","63","89"));
        atomModeliList.add(new AtomModeli("Gd","Gadolinium","64","Lanthanide","157,25","2-8-18-25-9-2","+2,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f7 5d1 6s2","64","64","93"));
        atomModeliList.add(new AtomModeli("Tb","Terbium","65","Lanthanide","158,9253","2-8-18-27-8-2","+3,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f9 6s2","65","65","94"));
        atomModeliList.add(new AtomModeli("Dy","Dysprosium","66","Lanthanide","162,5","2-8-18-28-8-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f10 6s2","66","66","97"));
        atomModeliList.add(new AtomModeli("Ho","Holmium","67","Lanthanide","164,9303","2-8-18-29-8-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f11 6s2","67","67","98"));
        atomModeliList.add(new AtomModeli("Er","Erbium","68","Lanthanide","167,259","2-8-18-30-8-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f12 6s2","68","68","99"));
        atomModeliList.add(new AtomModeli("Tm","Thulium","69","Lanthanide","168,9342","2-8-18-31-8-2","+2,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f13 6s2","69","69","100"));
        atomModeliList.add(new AtomModeli("Yb","Ytterbium","70","Lanthanide","173,04","2-8-18-32-8-2","+2,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 6s2","70","70","103"));
        atomModeliList.add(new AtomModeli("Lu","Lutetium","71","Lanthanide","174,967","2-8-18-32-9-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d1 6s2","71","71","104"));
        atomModeliList.add(new AtomModeli("Hf","Hafnium","72","Transition Metal","178,49","2-8-18-32-10-2","+4","Solid","Grey","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d2 6s2","72","72","106"));
        atomModeliList.add(new AtomModeli("Ta","Tantalum","73","Transition Metal","180,9479","2-8-18-32-11-2","+5","Solid","Grey","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d3 6s2","73","73","108"));
        atomModeliList.add(new AtomModeli("W","Tungsten","74","Transition Metal","183,84","2-8-18-32-12-2","+2,+3,+4,+5,+6","Solid","Grey","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d4 6s2","74","74","110"));
        atomModeliList.add(new AtomModeli("Re","Rhenium","75","Transition Metal","186,207","2-8-18-32-13-2","-1,+2,+4,+6,+7","Solid","Grey","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d5 6s2","75","75","111"));
        atomModeliList.add(new AtomModeli("Os","Osmium","76","Transition Metal","190,23","2-8-18-32-14-2","+2,+3,+4,+6,+8","Solid","Slate","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d6 6s2","76","76","114"));
        atomModeliList.add(new AtomModeli("Ir","Iridium","77","Transition Metal","192,217","2-8-18-32-15-2","+1,+2,+3,+4,+6","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d7 6s2","77","77","115"));
        atomModeliList.add(new AtomModeli("Pt","Platinum","78","Transition Metal","195,078","2-8-18-32-17-1","+2,+4","Solid","Grey","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d9 6s1","78","78","117"));
        atomModeliList.add(new AtomModeli("Au","Gold","79","Transition Metal","196,9665","2-8-18-32-18-1","+1,+3","Solid","Gold","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s1","79","79","118"));
        atomModeliList.add(new AtomModeli("Hg","Mercury","80","Transition Metal","200,59","2-8-18-32-18-2","+1,+2","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2","80","80","121"));
        atomModeliList.add(new AtomModeli("Tl","Thallium","81","Basic Metal","204,3833","2-8-18-32-18-3","+1,+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p1","81","81","123"));
        atomModeliList.add(new AtomModeli("Pb","Lead","82","Basic Metal","207,2","2-8-18-32-18-4","+2,+4","Solid","Slate","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p2","82","82","125"));
        atomModeliList.add(new AtomModeli("Bi","Bismuth","83","Basic Metal","208,9804","2-8-18-32-18-5","+3,+5","Solid","Grey","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p3","83","83","126"));
        atomModeliList.add(new AtomModeli("Po","Polonium","84","Semimetal","209","2-8-18-32-18-6","+2,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p4","84","84","125"));
        atomModeliList.add(new AtomModeli("At","Astatine","85","Halogen","210","2-8-18-32-18-7","-1,+1,+3,+5,+7","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p5","85","85","125"));
        atomModeliList.add(new AtomModeli("Rn","Radon","86","Noble Gas","222","2-8-18-32-18-8","0,+2","Gas","Colorless","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6","86","86","136"));

        atomModeliList.add(new AtomModeli("Fr","Francium","87","Alkaline Metal","223","2-8-18-32-18-8-1","+1","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 7s1","87","87","136"));
        atomModeliList.add(new AtomModeli("Ra","Radium","88","Alkaline Earth","226","2-8-18-32-18-8-2","+2","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 7s2","88","88","138"));
        atomModeliList.add(new AtomModeli("--","-","-","Actinide","","","","","","","","",""));
        atomModeliList.add(new AtomModeli("Ac","Actinium","89","Actinide","227","2-8-18-32-18-9-2","+3","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 6d1 7s2","89","89","138"));
        atomModeliList.add(new AtomModeli("Th","Thorium","90","Actinide","232,0381","2-8-18-32-18-10-2","+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 6d2 7s2","90","90","142"));
        atomModeliList.add(new AtomModeli("Pa","Protactinium","91","Actinide","231,0359","2-8-18-32-20-9-2","+4,+5","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f2 6d1 7s2","91","91","140"));
        atomModeliList.add(new AtomModeli("U","Uranium","92","Actinide","238,0289","2-8-18-32-21-9-2","+3,+4,+5,+6","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f3 6d1 7s2","92","92","146"));
        atomModeliList.add(new AtomModeli("Np","Neptunium","93","Actinide","237","2-8-18-32-22-9-2","+3,+4,+5,+6","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f4 6d1 7s2","93","93","144"));
        atomModeliList.add(new AtomModeli("Pu","Plutonium","94","Actinide","244","2-8-18-32-24-8-2","+3,+4,+5,+6","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f6 7s2","94","64","150"));
        atomModeliList.add(new AtomModeli("Am","Americium","95","Actinide","243","2-8-18-32-25-8-2","+3,+4,+5,+6","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f7 7s2","95","95","148"));
        atomModeliList.add(new AtomModeli("Cm","Curium","96","Actinide","247","2-8-18-32-25-9-2","+3,+4","Solid","Silver","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f7 6d1 7s2","96","96","151"));
        atomModeliList.add(new AtomModeli("Bk","Berkelium","97","Actinide","247","2-8-18-32-27-8-2","+3,+4","Solid","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f9 7s2","97","97","150"));
        atomModeliList.add(new AtomModeli("Cf","Californium","98","Actinide","251","2-8-18-32-28-8-2","+3,+4","Solid","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f10 7s2","98","98","153"));
        atomModeliList.add(new AtomModeli("Es","Einsteinium","99","Actinide","252","2-8-18-32-29-8-2","+3","Solid","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f11 7s2","99","99","153"));
        atomModeliList.add(new AtomModeli("Fm","Fermium","100","Actinide","257","2-8-18-32-30-8-2","+3","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f12 7s2","100","100","157"));
        atomModeliList.add(new AtomModeli("Md","Mendelevium","101","Actinide","258","2-8-18-32-31-8-2","+2,+3","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f13 7s2","101","101","157"));
        atomModeliList.add(new AtomModeli("No","Nobelium","102","Actinide","259","2-8-18-32-32-8-2","+2,+3","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 7s2","102","102","157"));
        atomModeliList.add(new AtomModeli("Lr","Lawrencium","103","Actinide","262","2-8-18-32-32-8-3","+3","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 7s2 7p1","103","103","159"));
        atomModeliList.add(new AtomModeli("Rf","Rutherfordium","104","Transition Metal","261","2-8-18-32-32-10-2","+4","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d2 7s2","104","104","163"));
        atomModeliList.add(new AtomModeli("Db","Dubnium","105","Transition Metal","262","2-8-18-32-32-11-2","+5","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d3 7s2","105","105","165"));
        atomModeliList.add(new AtomModeli("Sg","Seaborgium","106","Transition Metal","266","2-8-18-32-32-12-2","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d4 7s2","106","106","163"));
        atomModeliList.add(new AtomModeli("Bh","Bohrium","107","Transition Metal","264","2-8-18-32-32-13-2","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d5 7s2","107","107","163"));
        atomModeliList.add(new AtomModeli("Hs","Hassium","108","Transition Metal","277","2-8-18-32-32-14-2","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d6 7s2","108","108","162"));
        atomModeliList.add(new AtomModeli("Mt","Meitnerium","109","Transition Metal","278","2-8-18-32-32-15-2","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d7 7s2","109","109","169"));
        atomModeliList.add(new AtomModeli("Ds","Darmstadtium","110","Transition Metal","281","2-8-18-32-32-17-1","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d9 7s1","110","110","171"));
        atomModeliList.add(new AtomModeli("Rg","Roentgenium","111","Transition Metal","281","2-8-18-32-32-18-1","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s1","111","111","170"));
        atomModeliList.add(new AtomModeli("Cn","Copernicium","112","Transition Metal","285","2-8-18-32-32-18-2","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2","112","112","173"));
        atomModeliList.add(new AtomModeli("Uut","Ununtrium","113","Basic Metal","286","2-8-18-32-32-18-3","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p1","113","113","173"));
        atomModeliList.add(new AtomModeli("Fl","Flerovium","114","Basic Metal","289","2-8-18-32-32-18-4","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p2","114","114","175"));
        atomModeliList.add(new AtomModeli("Uup","Ununpentium","115","Basic Metal","289","2-8-18-32-32-18-5","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p3","115","115","174"));
        atomModeliList.add(new AtomModeli("Lv","Livermorium","116","Basic Metal","293","2-8-18-32-32-18-6","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p4","116","116","177"));
        atomModeliList.add(new AtomModeli("Uus","Ununseptium","117","Halogen","293","2-8-18-32-32-18-7","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p5","117","117","176"));
        atomModeliList.add(new AtomModeli("Uuo","Ununoctium","118","Noble Gas","294","2-8-18-32-32-18-8","n/a","Unknown","-","1s2 2s2 2p6 3s2 3p6 3d10 4s2 4p6 4d10 5s2 5p6 4f14 5d10 6s2 6p6 5f14 6d10 7s2 7p6","118","118","176"));

    }




}
