// JavaScript Document



function toggleArtsImage() {
  var imageContainer = document.querySelector('.image-container');
  var artsBar = document.querySelector('.arts-bar');

  if (imageContainer.style.display === "none" || imageContainer.style.display === "") {
    imageContainer.style.display = "block";  // Show the image
    artsBar.style.width = "500px";  // Increased expanded width of the bar
  } else {
    imageContainer.style.display = "none";  // Hide the image
    artsBar.style.width = "300px";  // Reset to initial width
  }
}

function toggleImage(imageId) {
  var imageContainer = document.getElementById(imageId);
  var bar = imageContainer.previousElementSibling;

  if (imageContainer.style.display === "none" || imageContainer.style.display === "") {
    imageContainer.style.display = "block";  // Show the image
    bar.style.width = "500px";  // Extend the bar width
  } else {
    imageContainer.style.display = "none";  // Hide the image
    bar.style.width = "300px";  // Reset the bar width
  }
}












