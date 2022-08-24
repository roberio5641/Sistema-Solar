package br.unifor.cct.sistemasolar.repository

import br.unifor.cct.sistemasolar.model.User

object UserRepository {

    fun findAll():List<User>{
        return listOf(
            User(1, "Mercurio" , "Massa(Mt = 1) = 0,05527" ),
            User(2, "Vênus" , "Massa(Mt = 1) = 0,81500" ),
            User(3, "Terra" , "Massa(Mt = 1) = 1,0000" ),
            User(4, "Marte" , "Massa(Mt = 1) = 0,10745" ),
            User(5, "Ceres(Anão)" , "Massa(Mt = 1) = 0,00016" ),
            User(6, "Júpiter" , "Massa(Mt = 1) = 317,83" ),
            User(7, "Saturno" , "Massa(Mt = 1) = 95,159" ),
            User(8, "Urano" , "Massa(Mt = 1) = 14,500" ),
            User(9, "Neptuno" , "Massa(Mt = 1) =  17,204" ),
            User(10, "Plutão(Anão)" , "Massa(Mt = 1) = 0,00220" ),
            User(11, "Haumea(Anão)" , "Massa(Mt = 1) = 0,00070" ),
            User(12, "Makemake(Anão)" , "Massa(Mt = 1) = 0,0007" ),
            User(13, "Éris(Anão)" , "Massa(Mt = 1) = 0,00278" ),
            User(14,"Sedna(Anão)" ,"Massa(Mt = 1) = N/A")
            )
    }

}