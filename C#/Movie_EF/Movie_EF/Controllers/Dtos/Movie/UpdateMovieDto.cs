﻿using System.ComponentModel.DataAnnotations;

namespace Movie_EF.Controllers.Dtos
{
    public class UpdateMovieDto
    {
        [Required]
        public string Title { get; set; }
        [Required]
        public string Director { get; set; }
        [StringLength(42)]
        public string Genre { get; set; }
        [Range(1, 650)]
        public int Duraction { get; set; }
        public int AgeRating { get; set; }
    }
}
