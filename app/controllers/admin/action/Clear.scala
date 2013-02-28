package controllers.admin.action

import play.api.mvc._
import models._

object Clear extends AdminAction {
    val description = "This action removes everything from the database"

    val name = """clear"""

    val label = """Clear the database"""

    override def run(request: Request[AnyContent]) {
        Conference.deleteAll()
        User.deleteAll()
        CType.deleteAll()
        ExternalRanking.deleteAll()
        Publisher.deleteAll()
        Region.deleteAll()

        infoMessage("Everything has been removed.")

        infoMessage("Adding admin user")
        User.create("admin", "", "Admin", isAdmin = true)

        infoMessage("Adding the regions...")

        /* Build the regions */
        models.Region.getOrCreate("Worldwide", Option("Worldwide"), isInternational = true)

        models.Region.getOrCreate("North America", Option("North American"), isInternational = true)
        models.Region.getOrCreate("Central America", Option("Central American"), isInternational = true)
        models.Region.getOrCreate("South America", Option("South American"), isInternational = true)

        models.Region.getOrCreate("Europe", Option("European"), isInternational = true)
        models.Region.getOrCreate("Asia", Option("Asian"), isInternational = true)
        // models.Region.getOrCreate("Eastern Europe", Option("Eastern European"), true)
        // models.Region.getOrCreate("Scandinavia", Option("Scandinavian"), true)
        models.Region.getOrCreate("Middle East", Option("Middle East"), isInternational = true)

        // models.Region.getOrCreate("South Asia", Option("South Asian"), true)
        // models.Region.getOrCreate("East Asia", Option("East Asian"), true)
        models.Region.getOrCreate("Oceania", Option("Oceanian"), isInternational = true)
        models.Region.getOrCreate("Africa", Option("African"), isInternational = true)
        models.Region.getOrCreate("Other", Option("Other"), isInternational = true)
        // models.Region.getOrCreate("South Africa", Option("South African"), true)
        // models.Region.getOrCreate("North Africa", Option("North African"), true)
        // models.Region.getOrCreate("Arabia", Option("Arabian"), true)

        models.Region.getOrCreate("Afghanistan", Option("Afghan"), isInternational = false)
        models.Region.getOrCreate("Albania", None, isInternational = false)
        models.Region.getOrCreate("Algeria", Option("Algerian"), isInternational = false)
        models.Region.getOrCreate("Andorra", None, isInternational = false)
        models.Region.getOrCreate("Angola", None, isInternational = false)
        models.Region.getOrCreate("Antigua and Barbuda", None, isInternational = false)
        models.Region.getOrCreate("Argentina", None, isInternational = false)
        models.Region.getOrCreate("Armenia", Option("Armenian"), isInternational = false)
        models.Region.getOrCreate("Australia", Option("Australian"), isInternational = false)
        models.Region.getOrCreate("Austria", None, isInternational = false)
        models.Region.getOrCreate("Azerbaijan", None, isInternational = false)
        models.Region.getOrCreate("Bahamas", None, isInternational = false)
        models.Region.getOrCreate("Bahrain", None, isInternational = false)
        models.Region.getOrCreate("Bangladesh", None, isInternational = false)
        models.Region.getOrCreate("Barbados", None, isInternational = false)
        models.Region.getOrCreate("Belarus", None, isInternational = false)
        models.Region.getOrCreate("Belgium", Option("Belgian"), isInternational = false)
        models.Region.getOrCreate("Belize", None, isInternational = false)
        models.Region.getOrCreate("Benin", None, isInternational = false)
        models.Region.getOrCreate("Bhutan", None, isInternational = false)
        models.Region.getOrCreate("Bolivia", Option("Bolivian"), isInternational = false)
        models.Region.getOrCreate("Bosnia and Herzegovina", None, isInternational = false)
        models.Region.getOrCreate("Botswana", None, isInternational = false)
        models.Region.getOrCreate("Brazil", Option("Brazilian"), isInternational = false)
        models.Region.getOrCreate("Brunei", None, isInternational = false)
        models.Region.getOrCreate("Bulgaria", None, isInternational = false)
        models.Region.getOrCreate("Burkina Faso", None, isInternational = false)
        models.Region.getOrCreate("Burundi", None, isInternational = false)
        models.Region.getOrCreate("Cambodia", None, isInternational = false)
        models.Region.getOrCreate("Cameroon", None, isInternational = false)
        models.Region.getOrCreate("Canada", Option("Canadian"), isInternational = false)
        models.Region.getOrCreate("Cape Verde", None, isInternational = false)
        models.Region.getOrCreate("Central African Republic", None, isInternational = false)
        models.Region.getOrCreate("Chad", None, isInternational = false)
        models.Region.getOrCreate("Chile", Option("Chilian"), isInternational = false)
        models.Region.getOrCreate("China", Option("Chinese"), isInternational = false)
        models.Region.getOrCreate("Colombia", Option("Colombian"), isInternational = false)
        models.Region.getOrCreate("Comoros", None, isInternational = false)
        models.Region.getOrCreate("Congo", None, isInternational = false)
        models.Region.getOrCreate("Costa Rica", Option("Costa Rican"), isInternational = false)
        models.Region.getOrCreate("Cote d'Ivoire", None, isInternational = false)
        models.Region.getOrCreate("Croatia", Option("Croatian"), isInternational = false)
        models.Region.getOrCreate("Cuba", Option("Cuban"), isInternational = false)
        models.Region.getOrCreate("Cyprus", None, isInternational = false)
        models.Region.getOrCreate("Czech Republic", None, isInternational = false)
        models.Region.getOrCreate("Denmark", None, isInternational = false)
        models.Region.getOrCreate("Djibouti", None, isInternational = false)
        models.Region.getOrCreate("Dominica", None, isInternational = false)
        models.Region.getOrCreate("Dominican Republic", None, isInternational = false)
        models.Region.getOrCreate("Ecuador", None, isInternational = false)
        models.Region.getOrCreate("Egypt", Option("Egyptian"), isInternational = false)
        models.Region.getOrCreate("El Salvador", None, isInternational = false)
        models.Region.getOrCreate("Equatorial Guinea", None, isInternational = false)
        models.Region.getOrCreate("Eritrea", None, isInternational = false)
        models.Region.getOrCreate("Estonia", None, isInternational = false)
        models.Region.getOrCreate("Ethiopia", Option("Ethiopian"), isInternational = false)
        models.Region.getOrCreate("Fiji", None, isInternational = false)
        models.Region.getOrCreate("Finland", None, isInternational = false)
        models.Region.getOrCreate("France", Option("French"), isInternational = false)
        models.Region.getOrCreate("Gabon", None, isInternational = false)
        models.Region.getOrCreate("Gambia", None, isInternational = false)
        models.Region.getOrCreate("Georgia", None, isInternational = false)
        models.Region.getOrCreate("Germany", Option("German"), isInternational = false)
        models.Region.getOrCreate("Ghana", None, isInternational = false)
        models.Region.getOrCreate("Greece", Option("Greek"), isInternational = false)
        models.Region.getOrCreate("Grenada", None, isInternational = false)
        models.Region.getOrCreate("Guatemala", None, isInternational = false)
        models.Region.getOrCreate("Guinea", None, isInternational = false)
        models.Region.getOrCreate("Guinea-Bissau", None, isInternational = false)
        models.Region.getOrCreate("Guyana", None, isInternational = false)
        models.Region.getOrCreate("Haiti", None, isInternational = false)
        models.Region.getOrCreate("Honduras", None, isInternational = false)
        models.Region.getOrCreate("Hungary", None, isInternational = false)
        models.Region.getOrCreate("Iceland", None, isInternational = false)
        models.Region.getOrCreate("India", Option("Indian"), isInternational = false)
        models.Region.getOrCreate("Indonesia", Option("Indonesian"), isInternational = false)
        models.Region.getOrCreate("Iran", None, isInternational = false)
        models.Region.getOrCreate("Iraq", None, isInternational = false)
        models.Region.getOrCreate("Ireland", Option("Irish"), isInternational = false)
        models.Region.getOrCreate("Israel", None, isInternational = false)
        models.Region.getOrCreate("Italy", Option("Italian"), isInternational = false)
        models.Region.getOrCreate("Jamaica", Option("Jamaican"), isInternational = false)
        models.Region.getOrCreate("Japan", Option("Japanese"), isInternational = false)
        models.Region.getOrCreate("Jordan", None, isInternational = false)
        models.Region.getOrCreate("Kazakhstan", None, isInternational = false)
        models.Region.getOrCreate("Kenya", None, isInternational = false)
        models.Region.getOrCreate("Kiribati", None, isInternational = false)
        models.Region.getOrCreate("North Korea", None, isInternational = false)
        models.Region.getOrCreate("South Korea", None, isInternational = false)
        models.Region.getOrCreate("Kuwait", None, isInternational = false)
        models.Region.getOrCreate("Kyrgyzstan", None, isInternational = false)
        models.Region.getOrCreate("Laos", None, isInternational = false)
        models.Region.getOrCreate("Latvia", None, isInternational = false)
        models.Region.getOrCreate("Lebanon", None, isInternational = false)
        models.Region.getOrCreate("Lesotho", None, isInternational = false)
        models.Region.getOrCreate("Liberia", None, isInternational = false)
        models.Region.getOrCreate("Libya", None, isInternational = false)
        models.Region.getOrCreate("Liechtenstein", None, isInternational = false)
        models.Region.getOrCreate("Lithuania", None, isInternational = false)
        models.Region.getOrCreate("Luxembourg", None, isInternational = false)
        models.Region.getOrCreate("Macedonia", None, isInternational = false)
        models.Region.getOrCreate("Madagascar", None, isInternational = false)
        models.Region.getOrCreate("Malawi", None, isInternational = false)
        models.Region.getOrCreate("Malaysia", None, isInternational = false)
        models.Region.getOrCreate("Maldives", None, isInternational = false)
        models.Region.getOrCreate("Mali", None, isInternational = false)
        models.Region.getOrCreate("Malta", None, isInternational = false)
        models.Region.getOrCreate("Marshall Islands", None, isInternational = false)
        models.Region.getOrCreate("Mauritania", None, isInternational = false)
        models.Region.getOrCreate("Mauritius", None, isInternational = false)
        models.Region.getOrCreate("Mexico", None, isInternational = false)
        models.Region.getOrCreate("Micronesia", None, isInternational = false)
        models.Region.getOrCreate("Moldova", None, isInternational = false)
        models.Region.getOrCreate("Monaco", None, isInternational = false)
        models.Region.getOrCreate("Mongolia", None, isInternational = false)
        models.Region.getOrCreate("Montenegro", None, isInternational = false)
        models.Region.getOrCreate("Morocco", None, isInternational = false)
        models.Region.getOrCreate("Mozambique", None, isInternational = false)
        models.Region.getOrCreate("Myanmar", None, isInternational = false)
        models.Region.getOrCreate("Namibia", None, isInternational = false)
        models.Region.getOrCreate("Nauru", None, isInternational = false)
        models.Region.getOrCreate("Nepal", None, isInternational = false)
        models.Region.getOrCreate("Netherlands", None, isInternational = false)
        models.Region.getOrCreate("New Zealand", None, isInternational = false)
        models.Region.getOrCreate("Nicaragua", None, isInternational = false)
        models.Region.getOrCreate("Niger", None, isInternational = false)
        models.Region.getOrCreate("Nigeria", None, isInternational = false)
        models.Region.getOrCreate("Norway", None, isInternational = false)
        models.Region.getOrCreate("Oman", None, isInternational = false)
        models.Region.getOrCreate("Pakistan", None, isInternational = false)
        models.Region.getOrCreate("Palau", None, isInternational = false)
        models.Region.getOrCreate("Panama", None, isInternational = false)
        models.Region.getOrCreate("Papua New Guinea", None, isInternational = false)
        models.Region.getOrCreate("Paraguay", None, isInternational = false)
        models.Region.getOrCreate("Peru", None, isInternational = false)
        models.Region.getOrCreate("Philippines", None, isInternational = false)
        models.Region.getOrCreate("Poland", None, isInternational = false)
        models.Region.getOrCreate("Portugal", None, isInternational = false)
        models.Region.getOrCreate("Qatar", None, isInternational = false)
        models.Region.getOrCreate("Romania", None, isInternational = false)
        models.Region.getOrCreate("Russia", Option("Russian"), isInternational = false)
        models.Region.getOrCreate("Rwanda", None, isInternational = false)
        models.Region.getOrCreate("Saint Kitts and Nevis", None, isInternational = false)
        models.Region.getOrCreate("Saint Lucia", None, isInternational = false)
        models.Region.getOrCreate("Saint Vincent and the Grenadines", None, isInternational = false)
        models.Region.getOrCreate("Samoa", None, isInternational = false)
        models.Region.getOrCreate("San Marino", None, isInternational = false)
        models.Region.getOrCreate("Sao Tome and Principe", None, isInternational = false)
        models.Region.getOrCreate("Saudi Arabia", None, isInternational = false)
        models.Region.getOrCreate("Senegal", None, isInternational = false)
        models.Region.getOrCreate("Serbia", None, isInternational = false)
        models.Region.getOrCreate("Seychelles", None, isInternational = false)
        models.Region.getOrCreate("Sierra Leone", None, isInternational = false)
        models.Region.getOrCreate("Singapore", None, isInternational = false)
        models.Region.getOrCreate("Slovakia", None, isInternational = false)
        models.Region.getOrCreate("Slovenia", None, isInternational = false)
        models.Region.getOrCreate("Solomon Islands", None, isInternational = false)
        models.Region.getOrCreate("Somalia", None, isInternational = false)
        models.Region.getOrCreate("South Africa", None, isInternational = false)
        models.Region.getOrCreate("Spain", None, isInternational = false)
        models.Region.getOrCreate("Sri Lanka", None, isInternational = false)
        models.Region.getOrCreate("Sudan", None, isInternational = false)
        models.Region.getOrCreate("Suriname", None, isInternational = false)
        models.Region.getOrCreate("Swaziland", None, isInternational = false)
        models.Region.getOrCreate("Sweden", Option("Swedesh"), isInternational = false)
        models.Region.getOrCreate("Switzerland", Option("Swiss"), isInternational = false)
        models.Region.getOrCreate("Syria", None, isInternational = false)
        models.Region.getOrCreate("Tajikistan", None, isInternational = false)
        models.Region.getOrCreate("Tanzania", None, isInternational = false)
        models.Region.getOrCreate("Thailand", None, isInternational = false)
        models.Region.getOrCreate("Timor-Leste", None, isInternational = false)
        models.Region.getOrCreate("Togo", None, isInternational = false)
        models.Region.getOrCreate("Tonga", None, isInternational = false)
        models.Region.getOrCreate("Trinidad and Tobago", None, isInternational = false)
        models.Region.getOrCreate("Tunisia", None, isInternational = false)
        models.Region.getOrCreate("Turkey", None, isInternational = false)
        models.Region.getOrCreate("Turkmenistan", None, isInternational = false)
        models.Region.getOrCreate("Tuvalu", None, isInternational = false)
        models.Region.getOrCreate("Uganda", None, isInternational = false)
        models.Region.getOrCreate("Ukraine", None, isInternational = false)
        models.Region.getOrCreate("United Arab Emirates", None, isInternational = false)
        models.Region.getOrCreate("United Kingdom", None, isInternational = false)
        models.Region.getOrCreate("United States", Option("United States"), isInternational = false)
        models.Region.getOrCreate("Uruguay", None, isInternational = false)
        models.Region.getOrCreate("Uzbekistan", None, isInternational = false)
        models.Region.getOrCreate("Vanuatu", None, isInternational = false)
        models.Region.getOrCreate("Vatican City", None, isInternational = false)
        models.Region.getOrCreate("Venezuela", None, isInternational = false)
        models.Region.getOrCreate("Vietnam", Option("Vietnamese"), isInternational = false)
        models.Region.getOrCreate("Yemen", None, isInternational = false)
        models.Region.getOrCreate("Zambia", None, isInternational = false)
        models.Region.getOrCreate("Zimbabwe", None, isInternational = false)

        successMessage("Regions added")
    }
}