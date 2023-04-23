package co.com.ciudadela.modelo

import java.util.{Calendar, Date}

case class Ciudadela(fechaFin: Option[Date],
                     solicitudesOrdenes: List[OrdenConstruccion] = List(),
                     material: Material = Material(),
                     plazoEntrega: Int = 0,
                     fechaInicio: Calendar,
                     arquitecto: Arquitecto = Arquitecto())

case class Arquitecto(identificacion: String = "123451", nombre: String = "Fernando Casique")
