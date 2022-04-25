export class Patient {

  prenom: any;
  nom: any;
  sexe: any;
  poid: any;
  taille: any;
  telephone: any;
  date_admission: any;
  date_naissance: any;
  date_sortie:any;

  constructor(
    prenom: any,
  nom: any,
  sexe: any,
  poid: any,
  taille: any,
  telephone: any,
  date_admission: any,
  date_naissance: any,
  date_sortie:any,
  ) {
      this.prenom = prenom;
      this.nom = nom;
      this.sexe = sexe;
      this.poid = poid;
      this.taille = taille;
      this.telephone = telephone;
      this.date_admission = date_admission;
      this.date_naissance = date_naissance;
      this.date_sortie = date_sortie;
  }
}
