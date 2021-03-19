package March.m_19;

import java.util.Objects;

public class SmartPhones {
    private final long IMEINumber;
    private final String smartPhoneName;
    private int price;
    private byte screenSize;

    public SmartPhones(long IMEINumber, String smartPhoneName, int price, byte screenSize) {
        this.IMEINumber = IMEINumber;
        this.smartPhoneName = smartPhoneName;
        this.price = price;
        this.screenSize = screenSize;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public byte getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(byte screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        SmartPhones that = (SmartPhones) o;
        return IMEINumber == that.IMEINumber && price == that.price && screenSize == that.screenSize && Objects.equals(smartPhoneName, that.smartPhoneName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(IMEINumber, smartPhoneName, price, screenSize);
    }

    @Override
    public String toString() {
        return "SmartPhones{" +
                "IMEINumber=" + IMEINumber +
                ", smartPhoneName='" + smartPhoneName + '\'' +
                ", price=" + price +
                ", screenSize=" + screenSize +
                '}';
    }

}