package br.gov.lexml.urnformatter

import junit.framework.Assert.assertEquals
import junit.framework.TestCase

class Uren2NomeCompactoTest extends TestCase {
  
    def testLabel_art1() { assertEquals("art. 1º", Urn2NomeCompacto.format("art1")) }
    def testLabel_art1_cpt() { assertEquals("art. 1º, caput", Urn2NomeCompacto.format("art1_cpt")) }
    def testLabel_art1_par1u() { assertEquals("art. 1º, parágrafo único", Urn2NomeCompacto.format("art1_par1u")) }

    def testLabel_art1_par1u_ali3() { assertEquals("art. 1º, parágrafo único, III", Urn2NomeCompacto.format("art1_par1u_inc3")) }
    def testLabel_art1_par1u_ali3_inc2() { assertEquals("art. 1º, parágrafo único, III, b", Urn2NomeCompacto.format("art1_par1u_inc3_ali2")) }
    
    def testLabel_art2() { assertEquals("art. 2º", Urn2NomeCompacto.format("art2")) }
    def testLabel_art2_cpt() { assertEquals("art. 2º, caput", Urn2NomeCompacto.format("art2_cpt")) }
    def testLabel_art2_cpt_inc1() { assertEquals("art. 2º, I", Urn2NomeCompacto.format("art2_cpt_inc1")) }
    def testLabel_art2_cpt_inc2() { assertEquals("art. 2º, II", Urn2NomeCompacto.format("art2_cpt_inc2")) }
    def testLabel_art2_par1u() { assertEquals("art. 2º, parágrafo único", Urn2NomeCompacto.format("art2_par1u"))}

    def testLabel_art3() { assertEquals("art. 3º", Urn2NomeCompacto.format("art3")) }
    def testLabel_art3_cpt() { assertEquals("art. 3º, caput", Urn2NomeCompacto.format("art3_cpt")) }
    def testLabel_art3_cpt_inc1() { assertEquals("art. 3º, I", Urn2NomeCompacto.format("art3_cpt_inc1")) }
    def testLabel_art3_cpt_inc2() { assertEquals("art. 3º, II", Urn2NomeCompacto.format("art3_cpt_inc2")) }
    def testLabel_art3_cpt_inc3() { assertEquals("art. 3º, III", Urn2NomeCompacto.format("art3_cpt_inc3")) }
    def testLabel_art3_cpt_inc4() { assertEquals("art. 3º, IV", Urn2NomeCompacto.format("art3_cpt_inc4")) }
    def testLabel_art3_cpt_inc4_ali1() { assertEquals("art. 3º, IV, a", Urn2NomeCompacto.format("art3_cpt_inc4_ali1")) }
    def testLabel_art3_cpt_inc4_ali2() { assertEquals("art. 3º, IV, b", Urn2NomeCompacto.format("art3_cpt_inc4_ali2")) }
    def testLabel_art3_cpt_inc5() { assertEquals("art. 3º, V", Urn2NomeCompacto.format("art3_cpt_inc5")) }
    def testLabel_art3_cpt_inc6() { assertEquals("art. 3º, VI", Urn2NomeCompacto.format("art3_cpt_inc6")) }
    def testLabel_art3_cpt_inc7() { assertEquals("art. 3º, VII", Urn2NomeCompacto.format("art3_cpt_inc7")) }

    def testLabel_art4() { assertEquals("art. 4º", Urn2NomeCompacto.format("art4")) }
    def testLabel_art4_cpt() { assertEquals("art. 4º, caput", Urn2NomeCompacto.format("art4_cpt")) }
    def testLabel_art4_par1() { assertEquals("art. 4º, § 1º", Urn2NomeCompacto.format("art4_par1")) }
    def testLabel_art4_par2() { assertEquals("art. 4º, § 2º", Urn2NomeCompacto.format("art4_par2")) }
    def testLabel_art4_par3() { assertEquals("art. 4º, § 3º", Urn2NomeCompacto.format("art4_par3")) }
    def testLabel_art4_par4() { assertEquals("art. 4º, § 4º", Urn2NomeCompacto.format("art4_par4")) }
    def testLabel_art4_par5() { assertEquals("art. 4º, § 5º", Urn2NomeCompacto.format("art4_par5")) }
    def testLabel_art4_par6() { assertEquals("art. 4º, § 6º", Urn2NomeCompacto.format("art4_par6")) }

    def testLabel_art5() { assertEquals("art. 5º", Urn2NomeCompacto.format("art5")) }
    def testLabel_art5_cpt() { assertEquals("art. 5º, caput", Urn2NomeCompacto.format("art5_cpt")) }
    def testLabel_art5_par1() { assertEquals("art. 5º, § 1º", Urn2NomeCompacto.format("art5_par1")) }
    def testLabel_art5_par2() { assertEquals("art. 5º, § 2º", Urn2NomeCompacto.format("art5_par2")) }
    def testLabel_art6() { assertEquals("art. 6º", Urn2NomeCompacto.format("art6")) }
    def testLabel_art6_cpt() { assertEquals("art. 6º, caput", Urn2NomeCompacto.format("art6_cpt")) }

    def testLabel_art7() { assertEquals("art. 7º", Urn2NomeCompacto.format("art7")) }
    def testLabel_art7_cpt() { assertEquals("art. 7º, caput", Urn2NomeCompacto.format("art7_cpt")) }
    def testLabel_art7_par1() { assertEquals("art. 7º, § 1º", Urn2NomeCompacto.format("art7_par1")) }
    def testLabel_art7_par2() { assertEquals("art. 7º, § 2º", Urn2NomeCompacto.format("art7_par2")) }  

    def testLabel_art8() { assertEquals("art. 8º", Urn2NomeCompacto.format("art8")) }
    def testLabel_art8_cpt() { assertEquals("art. 8º, caput", Urn2NomeCompacto.format("art8_cpt")) }
    def testLabel_art8_cpt_inc1() { assertEquals("art. 8º, I", Urn2NomeCompacto.format("art8_cpt_inc1")) }
    def testLabel_art8_cpt_inc2() { assertEquals("art. 8º, II", Urn2NomeCompacto.format("art8_cpt_inc2")) }
    def testLabel_art8_cpt_inc3() { assertEquals("art. 8º, III", Urn2NomeCompacto.format("art8_cpt_inc3")) }

    def testLabel_art9() { assertEquals("art. 9º", Urn2NomeCompacto.format("art9")) }
    def testLabel_art9_cpt() { assertEquals("art. 9º, caput", Urn2NomeCompacto.format("art9_cpt")) }
    def testLabel_art9_cpt_inc1() { assertEquals("art. 9º, I", Urn2NomeCompacto.format("art9_cpt_inc1")) }
    def testLabel_art9_cpt_inc2() { assertEquals("art. 9º, II", Urn2NomeCompacto.format("art9_cpt_inc2")) }
    def testLabel_art9_cpt_inc3() { assertEquals("art. 9º, III", Urn2NomeCompacto.format("art9_cpt_inc3")) }
    def testLabel_art9_cpt_inc4() { assertEquals("art. 9º, IV", Urn2NomeCompacto.format("art9_cpt_inc4")) }
    def testLabel_art9_cpt_inc5() { assertEquals("art. 9º, V", Urn2NomeCompacto.format("art9_cpt_inc5")) }
    def testLabel_art9_cpt_inc6() { assertEquals("art. 9º, VI", Urn2NomeCompacto.format("art9_cpt_inc6")) }
    def testLabel_art9_par1u() { assertEquals("art. 9º, parágrafo único", Urn2NomeCompacto.format("art9_par1u")) }

    def testLabel_art10() { assertEquals("art. 10", Urn2NomeCompacto.format("art10")) }
    def testLabel_art10_cpt() { assertEquals("art. 10, caput", Urn2NomeCompacto.format("art10_cpt")) }

    def testLabel_art11() { assertEquals("art. 11", Urn2NomeCompacto.format("art11")) }
    def testLabel_art11_cpt() { assertEquals("art. 11, caput", Urn2NomeCompacto.format("art11_cpt")) }

    def testLabel_art12() { assertEquals("art. 12", Urn2NomeCompacto.format("art12")) }
    def testLabel_art12_cpt() { assertEquals("art. 12, caput", Urn2NomeCompacto.format("art12_cpt")) }
    def testLabel_art12_cpt_inc1() { assertEquals("art. 12, I", Urn2NomeCompacto.format("art12_cpt_inc1")) }
    def testLabel_art12_cpt_inc2() { assertEquals("art. 12, II", Urn2NomeCompacto.format("art12_cpt_inc2")) }
    def testLabel_art12_cpt_inc3() { assertEquals("art. 12, III", Urn2NomeCompacto.format("art12_cpt_inc3")) }
    def testLabel_art12_par1u() { assertEquals("art. 12, parágrafo único", Urn2NomeCompacto.format("art12_par1u")) }

    def testLabel_art13() { assertEquals("art. 13", Urn2NomeCompacto.format("art13")) }
    def testLabel_art13_cpt() { assertEquals("art. 13, caput", Urn2NomeCompacto.format("art13_cpt")) }
    def testLabel_art13_par1() { assertEquals("art. 13, § 1º", Urn2NomeCompacto.format("art13_par1")) }
    def testLabel_art13_par2() { assertEquals("art. 13, § 2º", Urn2NomeCompacto.format("art13_par2")) }

    def testLabel_art14() { assertEquals("art. 14", Urn2NomeCompacto.format("art14")) }
    def testLabel_art14_cpt() { assertEquals("art. 14, caput", Urn2NomeCompacto.format("art14_cpt")) }
    def testLabel_art14_cpt_inc1() { assertEquals("art. 14, I", Urn2NomeCompacto.format("art14_cpt_inc1")) }
    def testLabel_art14_cpt_inc2() { assertEquals("art. 14, II", Urn2NomeCompacto.format("art14_cpt_inc2")) }
    def testLabel_art14_cpt_inc2_ali1() { assertEquals("art. 14, II, a", Urn2NomeCompacto.format("art14_cpt_inc2_ali1")) }
    def testLabel_art14_cpt_inc2_ali2() { assertEquals("art. 14, II, b", Urn2NomeCompacto.format("art14_cpt_inc2_ali2")) }
    def testLabel_art14_cpt_inc3() { assertEquals("art. 14, III", Urn2NomeCompacto.format("art14_cpt_inc3")) }
    def testLabel_art14_cpt_inc4() { assertEquals("art. 14, IV", Urn2NomeCompacto.format("art14_cpt_inc4")) }
    def testLabel_art14_cpt_inc5() { assertEquals("art. 14, V", Urn2NomeCompacto.format("art14_cpt_inc5")) }
    def testLabel_art14_cpt_inc6() { assertEquals("art. 14, VI", Urn2NomeCompacto.format("art14_cpt_inc6")) }
    def testLabel_art14_cpt_inc7() { assertEquals("art. 14, VII", Urn2NomeCompacto.format("art14_cpt_inc7")) }
    def testLabel_art14_cpt_inc8() { assertEquals("art. 14, VIII", Urn2NomeCompacto.format("art14_cpt_inc8")) }
    def testLabel_art14_cpt_inc9() { assertEquals("art. 14, IX", Urn2NomeCompacto.format("art14_cpt_inc9")) }
    def testLabel_art14_cpt_inc10() { assertEquals("art. 14, X", Urn2NomeCompacto.format("art14_cpt_inc10")) }
    def testLabel_art14_cpt_inc10_ali1() { assertEquals("art. 14, X, a", Urn2NomeCompacto.format("art14_cpt_inc10_ali1")) }
    def testLabel_art14_cpt_inc10_ali2() { assertEquals("art. 14, X, b", Urn2NomeCompacto.format("art14_cpt_inc10_ali2")) }
    def testLabel_art14_cpt_inc10_ali3() { assertEquals("art. 14, X, c", Urn2NomeCompacto.format("art14_cpt_inc10_ali3")) }
    def testLabel_art14_cpt_inc11() { assertEquals("art. 14, XI", Urn2NomeCompacto.format("art14_cpt_inc11")) }
    def testLabel_art14_cpt_inc12() { assertEquals("art. 14, XII", Urn2NomeCompacto.format("art14_cpt_inc12")) }
    def testLabel_art14_cpt_inc12_ali1() { assertEquals("art. 14, XII, a", Urn2NomeCompacto.format("art14_cpt_inc12_ali1")) }
    def testLabel_art14_cpt_inc12_ali2() { assertEquals("art. 14, XII, b", Urn2NomeCompacto.format("art14_cpt_inc12_ali2")) }
    def testLabel_art14_cpt_inc12_ali2_ite1() { assertEquals("art. 14, XII, b, 1", Urn2NomeCompacto.format("art14_cpt_inc12_ali2_ite1")) }
    def testLabel_art14_cpt_inc12_ali2_ite2() { assertEquals("art. 14, XII, b, 2", Urn2NomeCompacto.format("art14_cpt_inc12_ali2_ite2")) }
    def testLabel_art14_cpt_inc12_ali2_ite3() { assertEquals("art. 14, XII, b, 3", Urn2NomeCompacto.format("art14_cpt_inc12_ali2_ite3")) }
    def testLabel_art14_cpt_inc12_ali2_ite4() { assertEquals("art. 14, XII, b, 4", Urn2NomeCompacto.format("art14_cpt_inc12_ali2_ite4")) }
    def testLabel_art14_cpt_inc12_ali2_ite5() { assertEquals("art. 14, XII, b, 5", Urn2NomeCompacto.format("art14_cpt_inc12_ali2_ite5")) }
    def testLabel_art14_cpt_inc12_ali2_ite6() { assertEquals("art. 14, XII, b, 6", Urn2NomeCompacto.format("art14_cpt_inc12_ali2_ite6")) }
    def testLabel_art14_cpt_inc12_ali2_ite7() { assertEquals("art. 14, XII, b, 7", Urn2NomeCompacto.format("art14_cpt_inc12_ali2_ite7")) }
    def testLabel_art14_cpt_inc12_ali3() { assertEquals("art. 14, XII, c", Urn2NomeCompacto.format("art14_cpt_inc12_ali3")) }
    def testLabel_art14_cpt_inc12_ali4() { assertEquals("art. 14, XII, d", Urn2NomeCompacto.format("art14_cpt_inc12_ali4")) }
    def testLabel_art14_cpt_inc12_ali5() { assertEquals("art. 14, XII, e", Urn2NomeCompacto.format("art14_cpt_inc12_ali5")) }
    def testLabel_art14_cpt_inc13() { assertEquals("art. 14, XIII", Urn2NomeCompacto.format("art14_cpt_inc13")) }
    def testLabel_art14_cpt_inc14() { assertEquals("art. 14, XIV", Urn2NomeCompacto.format("art14_cpt_inc14")) }
    def testLabel_art14_par1() { assertEquals("art. 14, § 1º", Urn2NomeCompacto.format("art14_par1")) }
    def testLabel_art14_par2() { assertEquals("art. 14, § 2º", Urn2NomeCompacto.format("art14_par2")) }
    def testLabel_art14_par3() { assertEquals("art. 14, § 3º", Urn2NomeCompacto.format("art14_par3")) }
    def testLabel_art14_par4() { assertEquals("art. 14, § 4º", Urn2NomeCompacto.format("art14_par4")) }
    def testLabel_art14_par5() { assertEquals("art. 14, § 5º", Urn2NomeCompacto.format("art14_par5")) }
    def testLabel_art14_par6() { assertEquals("art. 14, § 6º", Urn2NomeCompacto.format("art14_par6")) }
    def testLabel_art14_par7() { assertEquals("art. 14, § 7º", Urn2NomeCompacto.format("art14_par7")) }
    def testLabel_art14_par8() { assertEquals("art. 14, § 8º", Urn2NomeCompacto.format("art14_par8")) }

    def testLabel_art15() { assertEquals("art. 15", Urn2NomeCompacto.format("art15")) }
    def testLabel_art15_cpt() { assertEquals("art. 15, caput", Urn2NomeCompacto.format("art15_cpt")) }

    def testLabel_art16() { assertEquals("art. 16", Urn2NomeCompacto.format("art16")) }
    def testLabel_art16_cpt() { assertEquals("art. 16, caput", Urn2NomeCompacto.format("art16_cpt")) }

    def testLabel_art17() { assertEquals("art. 17", Urn2NomeCompacto.format("art17")) }
    def testLabel_art17_cpt() { assertEquals("art. 17, caput", Urn2NomeCompacto.format("art17_cpt")) }
    def testLabel_art17_par1() { assertEquals("art. 17, § 1º", Urn2NomeCompacto.format("art17_par1")) }
    def testLabel_art17_par2() { assertEquals("art. 17, § 2º", Urn2NomeCompacto.format("art17_par2")) }

    def testLabel_art18() { assertEquals("art. 18", Urn2NomeCompacto.format("art18")) }
    def testLabel_art18_cpt() { assertEquals("art. 18, caput", Urn2NomeCompacto.format("art18_cpt")) }
    def testLabel_art18_cpt_inc1() { assertEquals("art. 18, I", Urn2NomeCompacto.format("art18_cpt_inc1")) }
    def testLabel_art18_cpt_inc1_ali1() { assertEquals("art. 18, I, a", Urn2NomeCompacto.format("art18_cpt_inc1_ali1")) }
    def testLabel_art18_cpt_inc1_ali2() { assertEquals("art. 18, I, b", Urn2NomeCompacto.format("art18_cpt_inc1_ali2")) }
    def testLabel_art18_cpt_inc1_ali3() { assertEquals("art. 18, I, c", Urn2NomeCompacto.format("art18_cpt_inc1_ali3")) }
    def testLabel_art18_cpt_inc1_ali4() { assertEquals("art. 18, I, d", Urn2NomeCompacto.format("art18_cpt_inc1_ali4")) }
    def testLabel_art18_cpt_inc1_ali5() { assertEquals("art. 18, I, e", Urn2NomeCompacto.format("art18_cpt_inc1_ali5")) }
    def testLabel_art18_cpt_inc1_ali6() { assertEquals("art. 18, I, f", Urn2NomeCompacto.format("art18_cpt_inc1_ali6")) }
    def testLabel_art18_cpt_inc1_ali7() { assertEquals("art. 18, I, g", Urn2NomeCompacto.format("art18_cpt_inc1_ali7")) }
    def testLabel_art18_cpt_inc1_ali8() { assertEquals("art. 18, I, h", Urn2NomeCompacto.format("art18_cpt_inc1_ali8")) }
    def testLabel_art18_cpt_inc2() { assertEquals("art. 18, II", Urn2NomeCompacto.format("art18_cpt_inc2")) }
    def testLabel_art18_cpt_inc2_ali1() { assertEquals("art. 18, II, a", Urn2NomeCompacto.format("art18_cpt_inc2_ali1")) }
    def testLabel_art18_cpt_inc2_ali2() { assertEquals("art. 18, II, b", Urn2NomeCompacto.format("art18_cpt_inc2_ali2")) }
    def testLabel_art18_par1u() { assertEquals("art. 18, parágrafo único", Urn2NomeCompacto.format("art18_par1u")) }

    def testLabel_art19() { assertEquals("art. 19", Urn2NomeCompacto.format("art19")) }
    def testLabel_art19_cpt() { assertEquals("art. 19, caput", Urn2NomeCompacto.format("art19_cpt")) }
    def testLabel_art19_cpt_inc1() { assertEquals("art. 19, I", Urn2NomeCompacto.format("art19_cpt_inc1")) }
    def testLabel_art19_cpt_inc2() { assertEquals("art. 19, II", Urn2NomeCompacto.format("art19_cpt_inc2")) }

    def testLabel_art20() { assertEquals("art. 20", Urn2NomeCompacto.format("art20")) }
    def testLabel_art20_cpt() { assertEquals("art. 20, caput", Urn2NomeCompacto.format("art20_cpt")) }

    def testLabel_art21() { assertEquals("art. 21", Urn2NomeCompacto.format("art21")) }
    def testLabel_art21_cpt() { assertEquals("art. 21, caput", Urn2NomeCompacto.format("art21_cpt")) }

    def testLabel_art22() { assertEquals("art. 22", Urn2NomeCompacto.format("art22")) }
    def testLabel_art22_cpt() { assertEquals("art. 22, caput", Urn2NomeCompacto.format("art22_cpt")) }
    def testLabel_art22_cpt_inc1() { assertEquals("art. 22, I", Urn2NomeCompacto.format("art22_cpt_inc1")) }
    def testLabel_art22_cpt_inc2() { assertEquals("art. 22, II", Urn2NomeCompacto.format("art22_cpt_inc2")) }
    def testLabel_art22_cpt_inc3() { assertEquals("art. 22, III", Urn2NomeCompacto.format("art22_cpt_inc3")) }
    def testLabel_art22_cpt_inc4() { assertEquals("art. 22, IV", Urn2NomeCompacto.format("art22_cpt_inc4")) }
    def testLabel_art22_cpt_inc5() { assertEquals("art. 22, V", Urn2NomeCompacto.format("art22_cpt_inc5")) }

    def testLabel_art23() { assertEquals("art. 23", Urn2NomeCompacto.format("art23")) }
    def testLabel_art23_cpt() { assertEquals("art. 23, caput", Urn2NomeCompacto.format("art23_cpt")) }
    def testLabel_art23_cpt_inc1() { assertEquals("art. 23, I", Urn2NomeCompacto.format("art23_cpt_inc1")) }
    def testLabel_art23_cpt_inc2() { assertEquals("art. 23, II", Urn2NomeCompacto.format("art23_cpt_inc2")) }

    def testLabel_art24() { assertEquals("art. 24", Urn2NomeCompacto.format("art24")) }
    def testLabel_art24_cpt() { assertEquals("art. 24, caput", Urn2NomeCompacto.format("art24_cpt")) }
    def testLabel_art24_cpt_inc1() { assertEquals("art. 24, I", Urn2NomeCompacto.format("art24_cpt_inc1")) }
    def testLabel_art24_cpt_inc2() { assertEquals("art. 24, II", Urn2NomeCompacto.format("art24_cpt_inc2")) }
    def testLabel_art24_cpt_inc2_ali1() { assertEquals("art. 24, II, a", Urn2NomeCompacto.format("art24_cpt_inc2_ali1")) }
    def testLabel_art24_cpt_inc2_ali2() { assertEquals("art. 24, II, b", Urn2NomeCompacto.format("art24_cpt_inc2_ali2")) }
    def testLabel_art24_cpt_inc3() { assertEquals("art. 24, III", Urn2NomeCompacto.format("art24_cpt_inc3")) }
    def testLabel_art24_cpt_inc4() { assertEquals("art. 24, IV", Urn2NomeCompacto.format("art24_cpt_inc4")) }
    def testLabel_art24_cpt_inc5() { assertEquals("art. 24, V", Urn2NomeCompacto.format("art24_cpt_inc5")) }
    def testLabel_art24_cpt_inc5_ali1() { assertEquals("art. 24, V, a", Urn2NomeCompacto.format("art24_cpt_inc5_ali1")) }
    def testLabel_art24_cpt_inc5_ali2() { assertEquals("art. 24, V, b", Urn2NomeCompacto.format("art24_cpt_inc5_ali2")) }
    def testLabel_art24_cpt_inc6() { assertEquals("art. 24, VI", Urn2NomeCompacto.format("art24_cpt_inc6")) }

    def testLabel_art25() { assertEquals("art. 25", Urn2NomeCompacto.format("art25")) }
    def testLabel_art25_cpt() { assertEquals("art. 25, caput", Urn2NomeCompacto.format("art25_cpt")) }

    def testLabel_art26() { assertEquals("art. 26", Urn2NomeCompacto.format("art26")) }
    def testLabel_art26_cpt() { assertEquals("art. 26, caput", Urn2NomeCompacto.format("art26_cpt")) }

    def testLabel_art27() { assertEquals("art. 27", Urn2NomeCompacto.format("art27")) }
    def testLabel_art27_cpt() { assertEquals("art. 27, caput", Urn2NomeCompacto.format("art27_cpt")) }
    def testLabel_art27_par1u() { assertEquals("art. 27, parágrafo único", Urn2NomeCompacto.format("art27_par1u")) }

    def testLabel_art28() { assertEquals("art. 28", Urn2NomeCompacto.format("art28")) }
    def testLabel_art28_cpt() { assertEquals("art. 28, caput", Urn2NomeCompacto.format("art28_cpt")) }
    def testLabel_art28_cpt_inc1() { assertEquals("art. 28, I", Urn2NomeCompacto.format("art28_cpt_inc1")) }
    def testLabel_art28_cpt_inc2() { assertEquals("art. 28, II", Urn2NomeCompacto.format("art28_cpt_inc2")) }
    def testLabel_art28_cpt_inc3() { assertEquals("art. 28, III", Urn2NomeCompacto.format("art28_cpt_inc3")) }

    def testLabel_art29() { assertEquals("art. 29", Urn2NomeCompacto.format("art29")) }
    def testLabel_art29_cpt() { assertEquals("art. 29, caput", Urn2NomeCompacto.format("art29_cpt")) }
    def testLabel_art29_par1u() { assertEquals("art. 29, parágrafo único", Urn2NomeCompacto.format("art29_par1u")) }

    def testLabel_art30() { assertEquals("art. 30", Urn2NomeCompacto.format("art30")) }
    def testLabel_art30_cpt() { assertEquals("art. 30, caput", Urn2NomeCompacto.format("art30_cpt")) }
    def testLabel_art30_cpt_inc1() { assertEquals("art. 30, I", Urn2NomeCompacto.format("art30_cpt_inc1")) }
    def testLabel_art30_cpt_inc2() { assertEquals("art. 30, II", Urn2NomeCompacto.format("art30_cpt_inc2")) }

    def testLabel_art31() { assertEquals("art. 31", Urn2NomeCompacto.format("art31")) }
    def testLabel_art31_cpt() { assertEquals("art. 31, caput", Urn2NomeCompacto.format("art31_cpt")) }
    def testLabel_art31_par1u() { assertEquals("art. 31, parágrafo único", Urn2NomeCompacto.format("art31_par1u")) }

    def testLabel_art32() { assertEquals("art. 32", Urn2NomeCompacto.format("art32")) }
    def testLabel_art32_cpt() { assertEquals("art. 32, caput", Urn2NomeCompacto.format("art32_cpt")) }
    def testLabel_art32_cpt_inc1() { assertEquals("art. 32, I", Urn2NomeCompacto.format("art32_cpt_inc1")) }
    def testLabel_art32_cpt_inc2() { assertEquals("art. 32, II", Urn2NomeCompacto.format("art32_cpt_inc2")) }
    def testLabel_art32_cpt_inc3() { assertEquals("art. 32, III", Urn2NomeCompacto.format("art32_cpt_inc3")) }
    def testLabel_art32_cpt_inc4() { assertEquals("art. 32, IV", Urn2NomeCompacto.format("art32_cpt_inc4")) }
    def testLabel_art32_cpt_inc5() { assertEquals("art. 32, V", Urn2NomeCompacto.format("art32_cpt_inc5")) }
    def testLabel_art32_cpt_inc6() { assertEquals("art. 32, VI", Urn2NomeCompacto.format("art32_cpt_inc6")) }
    def testLabel_art32_par1() { assertEquals("art. 32, § 1º", Urn2NomeCompacto.format("art32_par1")) }
    def testLabel_art32_par2() { assertEquals("art. 32, § 2º", Urn2NomeCompacto.format("art32_par2")) }
    def testLabel_art32_par3() { assertEquals("art. 32, § 3º", Urn2NomeCompacto.format("art32_par3")) }
    def testLabel_art32_par4() { assertEquals("art. 32, § 4º", Urn2NomeCompacto.format("art32_par4")) }
    def testLabel_art32_par4_inc1() { assertEquals("art. 32, § 4º, I", Urn2NomeCompacto.format("art32_par4_inc1")) }
    def testLabel_art32_par4_inc2() { assertEquals("art. 32, § 4º, II", Urn2NomeCompacto.format("art32_par4_inc2")) }
    def testLabel_art32_par5() { assertEquals("art. 32, § 5º", Urn2NomeCompacto.format("art32_par5")) }
    def testLabel_art32_par5_inc1() { assertEquals("art. 32, § 5º, I", Urn2NomeCompacto.format("art32_par5_inc1")) }
    def testLabel_art32_par5_inc2() { assertEquals("art. 32, § 5º, II", Urn2NomeCompacto.format("art32_par5_inc2")) }

    def testLabel_art33() { assertEquals("art. 33", Urn2NomeCompacto.format("art33")) }
    def testLabel_art33_cpt() { assertEquals("art. 33, caput", Urn2NomeCompacto.format("art33_cpt")) }
    def testLabel_art33_par1() { assertEquals("art. 33, § 1º", Urn2NomeCompacto.format("art33_par1")) }
    def testLabel_art33_par2() { assertEquals("art. 33, § 2º", Urn2NomeCompacto.format("art33_par2")) }
    def testLabel_art33_par3() { assertEquals("art. 33, § 3º", Urn2NomeCompacto.format("art33_par3")) }

    def testLabel_art34() { assertEquals("art. 34", Urn2NomeCompacto.format("art34")) }
    def testLabel_art34_cpt() { assertEquals("art. 34, caput", Urn2NomeCompacto.format("art34_cpt")) }

    def testLabel_art35() { assertEquals("art. 35", Urn2NomeCompacto.format("art35")) }
    def testLabel_art35_cpt() { assertEquals("art. 35, caput", Urn2NomeCompacto.format("art35_cpt")) }

    def testLabel_art36() { assertEquals("art. 36", Urn2NomeCompacto.format("art36")) }
    def testLabel_art36_cpt() { assertEquals("art. 36, caput", Urn2NomeCompacto.format("art36_cpt")) }
    
    def testLabel_art37() { assertEquals("art. 37", Urn2NomeCompacto.format("art37")) }
    def testLabel_art37_cpt() { assertEquals("art. 37, caput", Urn2NomeCompacto.format("art37_cpt")) }

    def testLabel_tit1() { assertEquals("Título I", Urn2NomeCompacto.format("tit1")) }

    def testLabel_tit1_cap1() { assertEquals("Capítulo I do Título I", Urn2NomeCompacto.format("tit1_cap1")) }

    def testLabel_tit1_cap1_art2() { assertEquals("Capítulo I do Título I, art. 2º", Urn2NomeCompacto.format("tit1_cap1_art2")) }

    def testAgrupadores() {
        assertEquals("Título I", Urn2NomeCompacto.format("tit1"))
        assertEquals("Capítulo I do Título I", Urn2NomeCompacto.format("tit1_cap1"))
        assertEquals("Seção II do Capítulo I do Título I", Urn2NomeCompacto.format("tit1_cap1_sec2"))
        assertEquals("Subseção IV da Seção II do Capítulo I do Título I", Urn2NomeCompacto.format("tit1_cap1_sec2_sub4"))
        assertEquals("Subseção IV da Seção II do Capítulo I do Título I do Livro III", Urn2NomeCompacto.format("liv3_tit1_cap1_sec2_sub4"))
        assertEquals("Livro III do Anexo I", Urn2NomeCompacto.format("anx1_liv3"))

        assertEquals("raiz, componente principal, art. 1º", Urn2NomeCompacto.format("lex_cpp_art1"))
        assertEquals("raiz, componente principal do Anexo I, art. 1º", Urn2NomeCompacto.format("lex_cpp_anx1_art1"))
        assertEquals("raiz, componente principal do Anexo I, art. 2º", Urn2NomeCompacto.format("lex_cpp_anx1_art2"))
    }

    def testLabel_tit1_sec1_3() { assertEquals("Seções I a III do Título I", Urn2NomeCompacto.format(List("tit1_sec1", "tit1_sec2", "tit1_sec3"))) }

    def testLabel_tit1_sec1_art1_par1_3() { assertEquals("art. 1º, § 1º ao 3º", Urn2NomeCompacto.format(List("tit1_sec1_art1_par1", "tit1_sec1_art1_par2", "tit1_sec1_art1_par3"))) }

    def testLabel_tit1_sec1_art1_par1_inc1_3() { assertEquals("art. 1º, § 1º, I a III", Urn2NomeCompacto.format(List("tit1_sec1_art1_par1_inc1", "tit1_sec1_art1_par1_inc2", "tit1_sec1_art1_par1_inc3"))) }

    def testLabel_tit1_sec1_art1_par1_inc1_ali1_ite1_3() { assertEquals("art. 1º, § 1º, I, a, 1 a 3", Urn2NomeCompacto.format(List("tit1_sec1_art1_par1_inc1_ali1_ite1", "tit1_sec1_art1_par1_inc1_ali1_ite2", "tit1_sec1_art1_par1_inc1_ali1_ite3"))) }

    def testLabel_tit1_sec1_2_sec3_art1_2_art4() { assertEquals("arts. 1º e 2º e art. 4º e Seções I e II do Título I", Urn2NomeCompacto.format(List("tit1_sec1", "tit1_sec2", "tit1_sec3", "tit1_sec3_art1", "tit1_sec3_art2", "tit1_sec3_art4"))) }

    def testLabel_tit1_sec1_2_sec3_art1_2_art4_art6_10() { assertEquals("arts. 1º e 2º, art. 4º e arts. 6º a 10 e Seções I e II do Título I", Urn2NomeCompacto.format(List("tit1_sec1", "tit1_sec2", "tit1_sec3", "tit1_sec3_art1", "tit1_sec3_art2", "tit1_sec3_art4", "tit1_sec3_art6", "tit1_sec3_art7", "tit1_sec3_art8", "tit1_sec3_art9", "tit1_sec3_art10"))) }

    def testLabel_tit1_sec1_2_sec3_art1_2_art4_art6_10_tit2_sec1_5() { assertEquals("arts. 1º e 2º, art. 4º e arts. 6º a 10 e Seções I e II do Título I e Seções I a V do Título II", Urn2NomeCompacto.format(List("tit1_sec1", "tit1_sec2", "tit1_sec3", "tit1_sec3_art1", "tit1_sec3_art2", "tit1_sec3_art4", "tit1_sec3_art6", "tit1_sec3_art7", "tit1_sec3_art8", "tit1_sec3_art9", "tit1_sec3_art10", "tit2_sec1", "tit2_sec2", "tit2_sec3", "tit2_sec4", "tit2_sec5"))) }

    def testLabel_art9_inc1_4() { assertEquals("art. 9º, I a IV", Urn2NomeCompacto.format(List("art9_inc1", "art9_inc2", "art9_inc3", "art9_inc4"))) }
    
    def testLabel_anx1_art25_27_anx1_art30() { assertEquals("arts. 25 a 27 e art. 30", Urn2NomeCompacto.format(List("anx1_art25", "anx1_art26", "anx1_art27", "anx1_art30"))) }

    def testLabel_anx2_tit1_sec1_anx1_art25_27_anx1_art30_anx3_tit5() { assertEquals("arts. 25 a 27 e art. 30, Seção I do Título I do Anexo II e Título V do Anexo III", Urn2NomeCompacto.format(List("anx2_tit1_sec1", "anx1_art25", "anx1_art26", "anx1_art27", "anx1_art30", "anx3_tit5"))) }

    def testLabel_empty_list() { assertEquals("", Urn2NomeCompacto.format(List())) }

    def testLabel_anx1_tit1_sec1_2() { assertEquals("Seções I e II do Título I do Anexo I", Urn2NomeCompacto.format(List("anx1_tit1_sec1", "anx1_tit1_sec2"))) }
 
    def testLabel_sec10_11() { assertEquals("Seções X e XI", Urn2NomeCompacto.format(List("sec10", "sec11"))) }

    def testLabel_sec10_12() { assertEquals("Seções X a XII", Urn2NomeCompacto.format(List("sec10", "sec11", "sec12"))) }

    def testLabel_ite1_2() { assertEquals("1 e 2", Urn2NomeCompacto.format(List("ite1", "ite2"))) }

    def testLabel_ite1_3() { assertEquals("1 a 3", Urn2NomeCompacto.format(List("ite1", "ite2", "ite3"))) }

    def testLabel_ali1_2() { assertEquals("a e b", Urn2NomeCompacto.format(List("ali1", "ali2"))) }

    def testLabel_ali1_3() { assertEquals("a a c", Urn2NomeCompacto.format(List("ali1", "ali2", "ali3"))) }

    def testLabel_inc1_2() { assertEquals("I e II", Urn2NomeCompacto.format(List("inc1", "inc2"))) }

    def testLabel_inc1_3() { assertEquals("I a III", Urn2NomeCompacto.format(List("inc1", "inc2", "inc3"))) }

    def testLabel_par1_2() { assertEquals("§ 1º e 2º", Urn2NomeCompacto.format(List("par1", "par2"))) }

    def testLabel_par1_3() { assertEquals("§ 1º ao 3º", Urn2NomeCompacto.format(List("par1", "par2", "par3"))) }

    def testLabel_art1_2() { assertEquals("arts. 1º e 2º", Urn2NomeCompacto.format(List("art1", "art2"))) }

    def testLabel_art1_3() { assertEquals("arts. 1º a 3º", Urn2NomeCompacto.format(List("art1", "art2", "art3"))) }

    def testLabel_art1e3() { assertEquals("arts. 1º e 3º", Urn2NomeCompacto.format(List("art1", "art3"))) }

    
    def testLabel_anx25_anx3_anx1() { assertEquals("Anexo A do Anexo 3 do Anexo XXV", Urn2NomeCompacto.format(List("anx25_anx3_anx1"))) }
    
    def testLabel_art135() { assertEquals("arts. 1º, 3º e 5º", Urn2NomeCompacto.format(List("tit1_sec1_art1", "tit1_sec1_art3", "tit1_sec1_art5"))) }
    
    def testLabel_art13I5() { assertEquals("arts. 1º, 3º I e 5º", Urn2NomeCompacto.format(List("tit1_sec1_art1", "tit1_sec1_art3_inc1", "tit1_sec1_art5"))) }
    
    def testLabel_art13Ia5() { assertEquals("arts. 1º, 3º I a e 5º", Urn2NomeCompacto.format(List("tit1_sec1_art1", "tit1_sec1_art3_inc1_ali1", "tit1_sec1_art5"))) }

    
    /*def testLabel_art1357() { assertEquals("arts. 1º, 3º, 5º e 7º", Urn2NomeCompacto.format(List("tit1_sec1_art1", "tit1_sec1_art3", "tit1_sec1_art5", "art7"))) }
    
    def testLabel_art135711() { assertEquals("arts. 1º, 3º, 5º, 7º e 11", Urn2NomeCompacto.format(List("tit1_sec1_art1", "tit1_sec1_art3", "tit1_sec1_art5", "art7", "tit50_sec1_art11"))) }
    
    def testLabel_art135711anx1() { assertEquals("arts. 1º, 3º, 5º, 7º e 11 e art. 11 do Anexo I", Urn2NomeCompacto.format(List("tit1_sec1_art1", "tit1_sec1_art3", "tit1_sec1_art5", "art7", "tit50_sec1_art11", "anx1_art1"))) }    

    def testLabel_anx10() { assertEquals("Anexo X", Urn2NomeCompacto.format(List("anx10"))) }
    
    def testLabel_anx1011() { assertEquals("Anexos X e XI", Urn2NomeCompacto.format(List("anx10", "anx11"))) } */

    
}
