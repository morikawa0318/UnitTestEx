/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package moe.lisp;

import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author koide
 */
public class CalculatorTest {
    // テストメソッド。メソッド名は「test+テスト対象メソッド名+連番」を推奨。
    /**
     * 2引数とも正整数の場合のテスト<br/>
     * 対象: multiply(int, int)<br/>
     * 条件: 引数10, 20<br/>
     * 期待する結果: 戻り値 200<br/>
     * @throws Exception 
     */
    @Test // テストメソッドを表すアノテーション
    public void testMultiply01() throws Exception {
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 200; // 期待する戻り値
        int actual = calc.multiply(10, 20); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
    
    /**
     * 引数の一方が正数，他方が負数の場合のテスト<br/>
     * 対象: multiply(int, int)<br/>
     * 条件: 引数-10, 20<br/>
     * 期待する結果: 戻り値 200<br/>
     * @throws Exception 
     */
    @Test
    public void testMultiply02() throws Exception {
        // 以降，テスト項目毎にテストメソッドを作成
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = -200; // 期待する戻り値
        int actual = calc.multiply(-10, 20); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
    
    /**
     * 引数の一方が0，他方が負数の場合のテスト<br/>
     * 対象: multiply(int, int)<br/>
     * 条件: 引数10, 20<br/>
     * 期待する結果: 戻り値 200<br/>
     * @throws Exception 
     */
    @Test
    public void testMultiply03() throws Exception {
        // 以降，テスト項目毎にテストメソッドを作成
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 0; // 期待する戻り値
        int actual = calc.multiply(0, -20); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
    
    /**
     * c &gt; b &gt aの場合のテスト<br/>
     * 対象: max(int, int, int)<br/>
     * 条件: 引数10, 20, 30<br/>
     * 期待する結果: 戻り値 30<br/>
     * @throws Exception 
     */
    @Test
    public void testMax01() throws Exception {
        // 以降，テスト項目毎にテストメソッドを作成
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(10, 20, 30); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
    
   
    /**
     * b &gt; c &gt aの場合のテスト<br/>
     * 対象: max(int, int, int)<br/>
     * 条件: 引数10, 20, 30<br/>
     * 期待する結果: 戻り値 30<br/>
     * @throws Exception 
     */
    @Test
    public void testMax02() throws Exception {
        // 以降，テスト項目毎にテストメソッドを作成
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(10, 30, 20); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
    
    /**
     * c &gt; a &gt bの場合のテスト<br/>
     * 対象: max(int, int, int)<br/>
     * 条件: 引数10, 20, 30<br/>
     * 期待する結果: 戻り値 30<br/>
     * @throws Exception 
     */
    @Test
    public void testMax03() throws Exception {
        // 以降，テスト項目毎にテストメソッドを作成
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(20, 10, 30); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
    
    /**
     * b &gt; a &gt cの場合のテスト<br/>
     * 対象: max(int, int, int)<br/>
     * 条件: 引数10, 20, 30<br/>
     * 期待する結果: 戻り値 30<br/>
     * @throws Exception 
     */
    @Test
    public void testMax04() throws Exception {
        // 以降，テスト項目毎にテストメソッドを作成
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(20, 30, 10); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
    
    /**
     * a &gt; c &gt bの場合のテスト<br/>
     * 対象: max(int, int, int)<br/>
     * 条件: 引数10, 20, 30<br/>
     * 期待する結果: 戻り値 30<br/>
     * @throws Exception 
     */
    @Test
    public void testMax05() throws Exception {
        // 以降，テスト項目毎にテストメソッドを作成
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(30, 10, 20); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
    
    /**
     * a &gt; b &gt cの場合のテスト<br/>
     * 対象: max(int, int, int)<br/>
     * 条件: 引数10, 20, 30<br/>
     * 期待する結果: 戻り値 30<br/>
     * @throws Exception 
     */
    @Test
    public void testMax06() throws Exception {
        // 以降，テスト項目毎にテストメソッドを作成
        Calculator calc = new Calculator(); // テスト対象の準備
        int expected = 30; // 期待する戻り値
        int actual = calc.max(30, 20, 10); // テスト対象実行
        assertEquals(expected, actual); // 実行結果の検証
    }
}
