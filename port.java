// JavaScript Document


// Function to show Writing images (no toggle)
function showWritingImages() {
  const writingImages = document.getElementById('writing-images');
  const drawingImages = document.getElementById('drawing-images');
  const adobeImages = document.getElementById('adobe-images');
  
  // Ensure Writing images are visible
  writingImages.style.display = 'block';
  
  // Hide other sections
  drawingImages.style.display = 'none';
  adobeImages.style.display = 'none';
}

// Function to toggle visibility of Drawing images
function showDrawingImages() {
  const writingImages = document.getElementById('writing-images');
  const drawingImages = document.getElementById('drawing-images');
  const adobeImages = document.getElementById('adobe-images');
  
  // Toggle visibility of the Drawing images section
  if (drawingImages.style.display === 'none') {
    drawingImages.style.display = 'block';
  } else {
    drawingImages.style.display = 'none';
  }
  
  // Hide other sections if they are visible
  writingImages.style.display = 'none';
  adobeImages.style.display = 'none';
}

// Function to toggle visibility of Adobe images
function showAdobeImages() {
  const writingImages = document.getElementById('writing-images');
  const drawingImages = document.getElementById('drawing-images');
  const adobeImages = document.getElementById('adobe-images');
  
  // Toggle visibility of the Adobe images section
  if (adobeImages.style.display === 'none') {
    adobeImages.style.display = 'block';
  } else {
    adobeImages.style.display = 'none';
  }
  
  // Hide other sections if they are visible
  writingImages.style.display = 'none';
  drawingImages.style.display = 'none';
}







