package lab;

/** ออกสอบ
 *
 * ==========================================================================
 *  ส่วน B — ฝึกเขียน Spec (JavaDoc) เอง
 * --------------------------------------------------------------------------
 *  โค้ดข้างล่างนี้ "ทำงานถูกต้องแล้ว" — ห้ามแก้ตัวโค้ด
 *  หน้าที่ของนิสิต: อ่านโค้ด แล้วเติม JavaDoc ให้แต่ละเมธอด
 *
 *  ต้องมีอย่างน้อย:
 *    - บรรทัดสรุปว่าเมธอด "ทำอะไร" (what, ไม่ใช่ how)
 *    - @param   ของทุกพารามิเตอร์ พร้อมข้อจำกัด (pre-condition)
 *    - @return  อธิบายค่าที่คืน (post-condition)
 *    - @throws  ทุก exception ที่โยน พร้อมเงื่อนไข
 * ==========================================================================
 */
public class Specs {
    /**
     * ทำงานอะไร?
     * @param arr ขนาดพื้นที่ ห้ามเป็นnull จะไม่พบ
     * @param key ตำแหน่ง
     * @throws IllegalArgumentException หาก arr เป็น  Null
     * @return ถ้า InDEX เป็น-1 จะไม่พบค่า
     */

    // TODO ข้อ 4: เขียน JavaDoc ให้เมธอดนี้
    public static int firstIndexOf(int[] arr, int key) {
        if (arr == null) throw new IllegalArgumentException("arr must not be null");
        for (int i = 0; i < arr.length; i++)
            if (arr[i] == key) return i;
        return -1;
    }

    // TODO ข้อ 5: เขียน JavaDoc ให้เมธอดนี้
    /**
     * @param arr พื้นที่วงกลม
     * @param radius รํศมีวงกลม
     * @throws IllegalArgumentException  หาก radius < 0 จะไม่พบ
     * 
     * @return คำนวณขนาด * ขนาด ทั้งหมด
     */
    public static double circleArea(double radius) {
        if (radius < 0) throw new IllegalArgumentException("radius must be >= 0");
        return Math.PI * radius * radius;
    }

    // TODO ข้อ 6: เขียน JavaDoc ให้เมธอดนี้
    /**
     * 
     * @param s ตัวอักษร ถ้า s = null ค่าว่าง
     * @return ข้อความหลังจากถูกแปลงเป็นตัวพิมพ์เล็ก
     * @param if ถ้าเงื่อนไขนี้ เป็น null จะ return
     */
    //   (เมธอดนี้ตัดช่องว่างหน้า-หลัง แล้วแปลงเป็นตัวพิมพ์เล็ก;
    //    input null ให้คืน string ว่าง)
    public static String normalize(String s) {
        if (s == null) return "";
        return s.trim().toLowerCase();
    }
}
