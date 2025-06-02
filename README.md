# med

# Waste Classification Model (Ensemble Learning Approach)

## Load and Process the Dataset

- **Data Processing and Augmentation**
  - Input Images (224,224,3)
  - Augmentations:
    * Rotation (20°)
    * Width/Height Shift (0.2)
    * Shear/Zoom (0.2)
    * Horizontal Flip

## MobileNetV2 Base Model

- **Transfer Learning Architecture**
  - Pretrained MobileNetV2 (ImageNet)
  - GlobalAverage Pooling
  - Dense (128 units, ReLU)
  - Dropout (0.5)
  - Dense (5 units, Softmax)
  - Optimization:
    * Adam Optimizer
    * Loss: CategoricalCrossEntropy

## Class Mapping

- **0- cardboard**
- **1- glass**
- **2- metal**
- **3- paper**
- **4- plastic**

## Training Process

- **Train the model**
  - 15 epochs
  - Batch size: 32
  - 80/20 train-val split
- **Save model weights**
- **Evaluation metrics**:
  - Training/Validation Accuracy
  - Training/Validation Loss

## Prediction Pipeline

- **Load new image**
- **Preprocess (resize, normalize)**
- **Model prediction**
- **Class confidence output**

---

**Fig. 1.** Training process overview for the waste classification model.
