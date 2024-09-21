CREATE DATABASE IF NOT EXISTS periodic_table;
USE periodic_table;

CREATE TABLE elements (
    atomic_number INT PRIMARY KEY,
    name VARCHAR(50),
    symbol VARCHAR(5),
    atomic_weight DOUBLE,
    block CHAR(1),
    property CHAR(1)
);

INSERT INTO elements (atomic_number, name, symbol, atomic_weight, block, property) VALUES
(1, 'Hydrogen', 'H', 1.008, 'S', 'N'),
(2, 'Helium', 'He', 4.0026, 'S', 'N'),
(3, 'Lithium', 'Li', 6.94, 'S', 'M'),
(4, 'Beryllium', 'Be', 9.0122, 'S', 'M'),
(5, 'Boron', 'B', 10.81, 'P', 'M'),
(6, 'Carbon', 'C', 12.011, 'P', 'N'),
(7, 'Nitrogen', 'N', 14.007, 'P', 'N'),
(8, 'Oxygen', 'O', 15.999, 'P', 'N'),
(9, 'Fluorine', 'F', 18.998, 'P', 'N'),
(10, 'Neon', 'Ne', 20.180, 'P', 'N'),
(11, 'Sodium', 'Na', 22.990, 'S', 'M'),
(12, 'Magnesium', 'Mg', 24.305, 'S', 'M'),
(13, 'Aluminium', 'Al', 26.982, 'P', 'M'),
(14, 'Silicon', 'Si', 28.085, 'P', 'M'),
(15, 'Phosphorus', 'P', 30.974, 'P', 'N'),
(16, 'Sulfur', 'S', 32.06, 'P', 'N'),
(17, 'Chlorine', 'Cl', 35.45, 'P', 'N'),
(18, 'Argon', 'Ar', 39.948, 'P', 'N'),
(19, 'Potassium', 'K', 39.098, 'S', 'M'),
(20, 'Calcium', 'Ca', 40.078, 'S', 'M'),
(21, 'Scandium', 'Sc', 44.956, 'D', 'T'),
(22, 'Titanium', 'Ti', 47.867, 'D', 'T'),
(23, 'Vanadium', 'V', 50.942, 'D', 'T'),
(24, 'Chromium', 'Cr', 51.996, 'D', 'T'),
(25, 'Manganese', 'Mn', 54.938, 'D', 'T'),
(26, 'Iron', 'Fe', 55.845, 'D', 'T'),
(27, 'Cobalt', 'Co', 58.933, 'D', 'T'),
(28, 'Nickel', 'Ni', 58.693, 'D', 'T'),
(29, 'Copper', 'Cu', 63.546, 'D', 'T'),
(30, 'Zinc', 'Zn', 65.38, 'D', 'T'),
(31, 'Gallium', 'Ga', 69.723, 'P', 'M'),
(32, 'Germanium', 'Ge', 72.63, 'P', 'M'),
(33, 'Arsenic', 'As', 74.922, 'P', 'M'),
(34, 'Selenium', 'Se', 78.971, 'P', 'N'),
(35, 'Bromine', 'Br', 79.904, 'P', 'N'),
(36, 'Krypton', 'Kr', 83.798, 'P', 'N'),
(37, 'Rubidium', 'Rb', 85.468, 'S', 'M'),
(38, 'Strontium', 'Sr', 87.62, 'S', 'M'),
(39, 'Yttrium', 'Y', 88.906, 'D', 'T'),
(40, 'Zirconium', 'Zr', 91.224, 'D', 'T'),
(41, 'Niobium', 'Nb', 92.906, 'D', 'T'),
(42, 'Molybdenum', 'Mo', 95.95, 'D', 'T'),
(43, 'Technetium', 'Tc', 98.00, 'D', 'T'),
(44, 'Ruthenium', 'Ru', 101.07, 'D', 'T'),
(45, 'Rhodium', 'Rh', 102.91, 'D', 'T'),
(46, 'Palladium', 'Pd', 106.42, 'D', 'T'),
(47, 'Silver', 'Ag', 107.87, 'D', 'T'),
(48, 'Cadmium', 'Cd', 112.41, 'D', 'T'),
(49, 'Indium', 'In', 114.82, 'P', 'M'),
(50, 'Tin', 'Sn', 118.71, 'P', 'M'),
(51, 'Antimony', 'Sb', 121.76, 'P', 'M'),
(52, 'Tellurium', 'Te', 127.60, 'P', 'M'),
(53, 'Iodine', 'I', 126.90, 'P', 'N'),
(54, 'Xenon', 'Xe', 131.29, 'P', 'N'),
(55, 'Cesium', 'Cs', 132.91, 'S', 'M'),
(56, 'Barium', 'Ba', 137.33, 'S', 'M'),
(57, 'Lanthanum', 'La', 138.91, 'F', 'L'),
(58, 'Cerium', 'Ce', 140.12, 'F', 'L'),
(59, 'Praseodymium', 'Pr', 140.91, 'F', 'L'),
(60, 'Neodymium', 'Nd', 144.24, 'F', 'L'),
(61, 'Promethium', 'Pm', 145.00, 'F', 'L'),
(62, 'Samarium', 'Sm', 150.36, 'F', 'L'),
(63, 'Europium', 'Eu', 151.96, 'F', 'L'),
(64, 'Gadolinium', 'Gd', 157.25, 'F', 'L'),
(65, 'Terbium', 'Tb', 158.93, 'F', 'L'),
(66, 'Dysprosium', 'Dy', 162.50, 'F', 'L'),
(67, 'Holmium', 'Ho', 164.93, 'F', 'L'),
(68, 'Erbium', 'Er', 167.26, 'F', 'L'),
(69, 'Thulium', 'Tm', 168.93, 'F', 'L'),
(70, 'Ytterbium', 'Yb', 173.04, 'F', 'L'),
(71, 'Lutetium', 'Lu', 174.97, 'F', 'L'),
(72, 'Hafnium', 'Hf', 178.49, 'D', 'T'),
(73, 'Tantalum', 'Ta', 180.95, 'D', 'T'),
(74, 'Tungsten', 'W', 183.84, 'D', 'T'),
(75, 'Rhenium', 'Re', 186.21, 'D', 'T'),
(76, 'Osmium', 'Os', 190.23, 'D', 'T'),
(77, 'Iridium', 'Ir', 192.22, 'D', 'T'),
(78, 'Platinum', 'Pt', 195.08, 'D', 'T'),
(79, 'Gold', 'Au', 196.97, 'D', 'T'),
(80, 'Mercury', 'Hg', 200.59, 'D', 'T'),
(81, 'Thallium', 'Tl', 204.38, 'P', 'M'),
(82, 'Lead', 'Pb', 207.2, 'P', 'M'),
(83, 'Bismuth', 'Bi', 208.98, 'P', 'M'),
(84, 'Polonium', 'Po', 209.00, 'P', 'M'),
(85, 'Astatine', 'At', 210.00, 'P', 'M'),
(86, 'Radon', 'Rn', 222.00, 'P', 'N'),
(87, 'Francium', 'Fr', 223.00, 'S', 'M'),
(88, 'Radium', 'Ra', 226.00, 'S', 'M'),
(89, 'Actinium', 'Ac', 227.00, 'F', 'L'),
(90, 'Thorium', 'Th', 232.04, 'F', 'L'),
(91, 'Protactinium', 'Pa', 231.04, 'F', 'L'),
(92, 'Uranium', 'U', 238.03, 'F', 'L'),
(93, 'Neptunium', 'Np', 237.00, 'F', 'L'),
(94, 'Plutonium', 'Pu', 244.00, 'F', 'L'),
(95, 'Americium', 'Am', 243.00, 'F', 'L'),
(96, 'Curium', 'Cm', 247.00, 'F', 'L'),
(97, 'Berkelium', 'Bk', 247.00, 'F', 'L'),
(98, 'Californium', 'Cf', 251.00, 'F', 'L'),
(99, 'Einsteinium', 'Es', 252.00, 'F', 'L'),
(100, 'Fermium', 'Fm', 257.00, 'F', 'L'),
(101, 'Mendelevium', 'Md', 258.00, 'F', 'L'),
(102, 'Nobelium', 'No', 259.00, 'F', 'L'),
(103, 'Lawrencium', 'Lr', 262.00, 'F', 'L'),
(104, 'Rutherfordium', 'Rf', 267.00, 'D', 'T'),
(105, 'Dubnium', 'Db', 270.00, 'D', 'T'),
(106, 'Seaborgium', 'Sg', 271.00, 'D', 'T'),
(107, 'Bohrium', 'Bh', 270.00, 'D', 'T'),
(108, 'Hassium', 'Hs', 277.00, 'D', 'T'),
(109, 'Meitnerium', 'Mt', 278.00, 'D', 'T'),
(110, 'Darmstadtium', 'Ds', 281.00, 'D', 'T'),
(111, 'Roentgenium', 'Rg', 282.00, 'D', 'T'),
(112, 'Copernicium', 'Cn', 285.00, 'D', 'T'),
(113, 'Nihonium', 'Nh', 286.00, 'P', 'M'),
(114, 'Flerovium', 'Fl', 289.00, 'P', 'M'),
(115, 'Moscovium', 'Mc', 290.00, 'P', 'M'),
(116, 'Livermorium', 'Lv', 293.00, 'P', 'M'),
(117, 'Tennessine', 'Ts', 294.00, 'P', 'M'),
(118, 'Oganesson', 'Og', 294.00, 'P', 'N');
