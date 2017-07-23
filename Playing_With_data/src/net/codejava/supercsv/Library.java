
package net.codejava.supercsv;


public class Library
{
    private String name;
    private String hoursOfOp;
    private String address;
    private String website;
    private String phone;
    private String zip;



    public Library()
    {

    }



    public Library(String name, String hoursOfOp, String address, String zip, String phone, String website)
    {

        this.name = name;
        this.hoursOfOp = hoursOfOp;
        this.address = address;
        this.website = website;
        this.phone = phone;
        this.zip = zip;
    }





    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public String getHoursOfOp()
    {
        return hoursOfOp;
    }

    public void setHoursOfOp(String hoursOfOp)
    {
        this.hoursOfOp = hoursOfOp;
    }

    public String getAddress()
    {
        return address;
    }

    public void setAddress(String address)
    {
        this.address = address;
    }

    public String getWebsite()
    {
        return website;
    }

    public void setWebsite(String website)
    {
        this.website = website;
    }

    public String getPhone()
    {
        return phone;
    }

    public void setPhone(String phone)
    {
        this.phone = phone;
    }

    public String getZip()
    {
        return zip;
    }

    public void setZip(String zip)
    {
        this.zip = zip;
    }


    @Override
    public String toString()
    {
        return "Library" + "\n Name = " + this.getName() + "\n Hours of operation = " + this.getHoursOfOp() + "\n Address = " + this.getAddress() + "\n Website = '" + this.getWebsite() + "'\n Phone = " + this.getPhone() + "\n Zip code = " + this.getZip();
    }


}
